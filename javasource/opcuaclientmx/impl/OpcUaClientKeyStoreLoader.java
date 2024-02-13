package opcuaclientmx.impl;
/*JV May/June 2020
 * 
 * FOR TEST PURPOSES ONLY!
 * 
 * */
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.milo.opcua.sdk.server.util.HostnameUtil;
import org.eclipse.milo.opcua.stack.core.util.SelfSignedCertificateBuilder;
import org.eclipse.milo.opcua.stack.core.util.SelfSignedCertificateGenerator;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;

import opcuaclientmx.proxies.Certificate;
import opcuaclientmx.proxies.ClientSettings;
import opcuaclientmx.proxies.OpcUaServerCfg;

public class OpcUaClientKeyStoreLoader {
	
    private static final Pattern IP_ADDR_PATTERN = Pattern.compile(
        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    private static final String CLIENT_ALIAS = "client-ai";
    private static final char[] PASSWORD = "passwordTest".toCharArray();

    private static final ILogNode logger = Core.getLogger("OpcUA");

    private X509Certificate clientCertificate;
    private KeyPair clientKeyPair;
  

    OpcUaClientKeyStoreLoader load(IContext context, Path baseDir, OpcUaServerCfg connector) throws Exception {
    	KeyStore keyStore = KeyStore.getInstance("PKCS12");
        Path serverKeyStore = baseDir.resolve("local-client.pfx");
        logger.info("Loading KeyStore at " + serverKeyStore);
        
        if (!Files.exists(serverKeyStore)) {
            keyStore.load(null, PASSWORD);

           
        } else {
            try (InputStream in = Files.newInputStream(serverKeyStore)) {
                keyStore.load(in, PASSWORD);
            }
        }
        
        List <ClientSettings> clientSettingsList = ClientSettings.load(connector.getContext(), "/");
        ClientSettings clientSettings = clientSettingsList.get(0);
        if(clientSettings == null) throw new Exception("Missing clientSettings");
        
        Certificate clientCertificate = clientSettings.getClientCertificate();
        
        
       /*byte[] privateKeyBytes = privateKeyFileInputStream.readAllBytes();
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);

        // Parse the certificate from DER
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] certificateBytes = certificateFileInputStream.readAllBytes();
        X509Certificate certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(certificateBytes));
        
*/
        Key serverPrivateKey = keyStore.getKey(CLIENT_ALIAS, PASSWORD);
        if (serverPrivateKey instanceof PrivateKey) {
            this.clientCertificate = (X509Certificate) keyStore.getCertificate(CLIENT_ALIAS);
            PublicKey serverPublicKey = this.clientCertificate.getPublicKey();
            this.clientKeyPair = new KeyPair(serverPublicKey, (PrivateKey) serverPrivateKey);
        }
    	
    	return this;
    }
    
    
    OpcUaClientKeyStoreLoader load(Path baseDir) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");

        Path serverKeyStore = baseDir.resolve("local-client.pfx");

        logger.info("Loading KeyStore at " + serverKeyStore);

        if (!Files.exists(serverKeyStore)) {
            keyStore.load(null, PASSWORD);

            KeyPair keyPair = SelfSignedCertificateGenerator.generateRsaKeyPair(2048);

            SelfSignedCertificateBuilder builder = new SelfSignedCertificateBuilder(keyPair)
                .setCommonName("Mendix OPC UA Client")
                .setOrganization("Mendix")
                .setOrganizationalUnit("dev")
                .setLocalityName("Rotterdam")
                .setStateName("Zuid-Holland")
                .setCountryCode("NL")
                .setApplicationUri("urn:eclipse:milo:examples:client")
                .addDnsName("localhost")
                .addIpAddress("127.0.0.1");

            // Get as many hostnames and IP addresses as we can listed in the certificate.
            for (String hostname : HostnameUtil.getHostnames("0.0.0.0")) {
                if (IP_ADDR_PATTERN.matcher(hostname).matches()) {
                    builder.addIpAddress(hostname);
                } else {
                    builder.addDnsName(hostname);
                }
            }

            X509Certificate certificate = builder.build();

            keyStore.setKeyEntry(CLIENT_ALIAS, keyPair.getPrivate(), PASSWORD, new X509Certificate[]{certificate});
            try (OutputStream out = Files.newOutputStream(serverKeyStore)) {
                keyStore.store(out, PASSWORD);
            }
        } else {
            try (InputStream in = Files.newInputStream(serverKeyStore)) {
                keyStore.load(in, PASSWORD);
            }
        }

        Key serverPrivateKey = keyStore.getKey(CLIENT_ALIAS, PASSWORD);
        if (serverPrivateKey instanceof PrivateKey) {
            this.clientCertificate = (X509Certificate) keyStore.getCertificate(CLIENT_ALIAS);
            PublicKey serverPublicKey = this.clientCertificate.getPublicKey();
            this.clientKeyPair = new KeyPair(serverPublicKey, (PrivateKey) serverPrivateKey);
        }

        return this;
    }

    X509Certificate getClientCertificate() {
        return this.clientCertificate;
    }

    KeyPair getClientKeyPair() {
        return this.clientKeyPair;
    }


}



