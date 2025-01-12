// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package opcuaclientmx.proxies;

public class OpcUaServerCfg extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OpcUaClientMx.OpcUaServerCfg";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ServerID("ServerID"),
		URL("URL"),
		Username("Username"),
		Password("Password"),
		Password_Encrypted("Password_Encrypted"),
		AuthenticationType("AuthenticationType"),
		SecurityPolicy("SecurityPolicy"),
		SecurityMode("SecurityMode"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		AuthenticationCertificate("OpcUaClientMx.AuthenticationCertificate"),
		ServerCertificate("OpcUaClientMx.ServerCertificate");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public OpcUaServerCfg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected OpcUaServerCfg(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject opcUaServerCfgMendixObject)
	{
		super(context, opcUaServerCfgMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, opcUaServerCfgMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'OpcUaServerCfg.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static opcuaclientmx.proxies.OpcUaServerCfg initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return opcuaclientmx.proxies.OpcUaServerCfg.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static opcuaclientmx.proxies.OpcUaServerCfg initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new opcuaclientmx.proxies.OpcUaServerCfg(context, mendixObject);
	}

	public static opcuaclientmx.proxies.OpcUaServerCfg load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return opcuaclientmx.proxies.OpcUaServerCfg.initialize(context, mendixObject);
	}

	public static java.util.List<opcuaclientmx.proxies.OpcUaServerCfg> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> opcuaclientmx.proxies.OpcUaServerCfg.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of ServerID
	 */
	public final java.lang.String getServerID()
	{
		return getServerID(getContext());
	}

	/**
	 * @param context
	 * @return value of ServerID
	 */
	public final java.lang.String getServerID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ServerID.toString());
	}

	/**
	 * Set value of ServerID
	 * @param serverid
	 */
	public final void setServerID(java.lang.String serverid)
	{
		setServerID(getContext(), serverid);
	}

	/**
	 * Set value of ServerID
	 * @param context
	 * @param serverid
	 */
	public final void setServerID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String serverid)
	{
		getMendixObject().setValue(context, MemberNames.ServerID.toString(), serverid);
	}

	/**
	 * @return value of URL
	 */
	public final java.lang.String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final java.lang.String getURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(java.lang.String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return value of Username
	 */
	public final java.lang.String getUsername()
	{
		return getUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of Username
	 */
	public final java.lang.String getUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Username.toString());
	}

	/**
	 * Set value of Username
	 * @param username
	 */
	public final void setUsername(java.lang.String username)
	{
		setUsername(getContext(), username);
	}

	/**
	 * Set value of Username
	 * @param context
	 * @param username
	 */
	public final void setUsername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.Username.toString(), username);
	}

	/**
	 * @return value of Password
	 */
	public final java.lang.String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final java.lang.String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(java.lang.String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of Password_Encrypted
	 */
	public final java.lang.String getPassword_Encrypted()
	{
		return getPassword_Encrypted(getContext());
	}

	/**
	 * @param context
	 * @return value of Password_Encrypted
	 */
	public final java.lang.String getPassword_Encrypted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password_Encrypted.toString());
	}

	/**
	 * Set value of Password_Encrypted
	 * @param password_encrypted
	 */
	public final void setPassword_Encrypted(java.lang.String password_encrypted)
	{
		setPassword_Encrypted(getContext(), password_encrypted);
	}

	/**
	 * Set value of Password_Encrypted
	 * @param context
	 * @param password_encrypted
	 */
	public final void setPassword_Encrypted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password_encrypted)
	{
		getMendixObject().setValue(context, MemberNames.Password_Encrypted.toString(), password_encrypted);
	}

	/**
	 * Set value of AuthenticationType
	 * @param authenticationtype
	 */
	public final opcuaclientmx.proxies.AuthenticationType getAuthenticationType()
	{
		return getAuthenticationType(getContext());
	}

	/**
	 * @param context
	 * @return value of AuthenticationType
	 */
	public final opcuaclientmx.proxies.AuthenticationType getAuthenticationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AuthenticationType.toString());
		if (obj == null) {
			return null;
		}
		return opcuaclientmx.proxies.AuthenticationType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AuthenticationType
	 * @param authenticationtype
	 */
	public final void setAuthenticationType(opcuaclientmx.proxies.AuthenticationType authenticationtype)
	{
		setAuthenticationType(getContext(), authenticationtype);
	}

	/**
	 * Set value of AuthenticationType
	 * @param context
	 * @param authenticationtype
	 */
	public final void setAuthenticationType(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.AuthenticationType authenticationtype)
	{
		if (authenticationtype != null) {
			getMendixObject().setValue(context, MemberNames.AuthenticationType.toString(), authenticationtype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.AuthenticationType.toString(), null);
		}
	}

	/**
	 * Set value of SecurityPolicy
	 * @param securitypolicy
	 */
	public final opcuaclientmx.proxies.SecurityPolicy getSecurityPolicy()
	{
		return getSecurityPolicy(getContext());
	}

	/**
	 * @param context
	 * @return value of SecurityPolicy
	 */
	public final opcuaclientmx.proxies.SecurityPolicy getSecurityPolicy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SecurityPolicy.toString());
		if (obj == null) {
			return null;
		}
		return opcuaclientmx.proxies.SecurityPolicy.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SecurityPolicy
	 * @param securitypolicy
	 */
	public final void setSecurityPolicy(opcuaclientmx.proxies.SecurityPolicy securitypolicy)
	{
		setSecurityPolicy(getContext(), securitypolicy);
	}

	/**
	 * Set value of SecurityPolicy
	 * @param context
	 * @param securitypolicy
	 */
	public final void setSecurityPolicy(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.SecurityPolicy securitypolicy)
	{
		if (securitypolicy != null) {
			getMendixObject().setValue(context, MemberNames.SecurityPolicy.toString(), securitypolicy.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.SecurityPolicy.toString(), null);
		}
	}

	/**
	 * Set value of SecurityMode
	 * @param securitymode
	 */
	public final opcuaclientmx.proxies.SecurityMode getSecurityMode()
	{
		return getSecurityMode(getContext());
	}

	/**
	 * @param context
	 * @return value of SecurityMode
	 */
	public final opcuaclientmx.proxies.SecurityMode getSecurityMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SecurityMode.toString());
		if (obj == null) {
			return null;
		}
		return opcuaclientmx.proxies.SecurityMode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SecurityMode
	 * @param securitymode
	 */
	public final void setSecurityMode(opcuaclientmx.proxies.SecurityMode securitymode)
	{
		setSecurityMode(getContext(), securitymode);
	}

	/**
	 * Set value of SecurityMode
	 * @param context
	 * @param securitymode
	 */
	public final void setSecurityMode(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.SecurityMode securitymode)
	{
		if (securitymode != null) {
			getMendixObject().setValue(context, MemberNames.SecurityMode.toString(), securitymode.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.SecurityMode.toString(), null);
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of AuthenticationCertificate
	 */
	public final opcuaclientmx.proxies.Certificate getAuthenticationCertificate() throws com.mendix.core.CoreException
	{
		return getAuthenticationCertificate(getContext());
	}

	/**
	 * @param context
	 * @return value of AuthenticationCertificate
	 * @throws com.mendix.core.CoreException
	 */
	public final opcuaclientmx.proxies.Certificate getAuthenticationCertificate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		opcuaclientmx.proxies.Certificate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuthenticationCertificate.toString());
		if (identifier != null) {
			result = opcuaclientmx.proxies.Certificate.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of AuthenticationCertificate
	 * @param authenticationcertificate
	 */
	public final void setAuthenticationCertificate(opcuaclientmx.proxies.Certificate authenticationcertificate)
	{
		setAuthenticationCertificate(getContext(), authenticationcertificate);
	}

	/**
	 * Set value of AuthenticationCertificate
	 * @param context
	 * @param authenticationcertificate
	 */
	public final void setAuthenticationCertificate(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.Certificate authenticationcertificate)
	{
		if (authenticationcertificate == null) {
			getMendixObject().setValue(context, MemberNames.AuthenticationCertificate.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.AuthenticationCertificate.toString(), authenticationcertificate.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ServerCertificate
	 */
	public final opcuaclientmx.proxies.Certificate getServerCertificate() throws com.mendix.core.CoreException
	{
		return getServerCertificate(getContext());
	}

	/**
	 * @param context
	 * @return value of ServerCertificate
	 * @throws com.mendix.core.CoreException
	 */
	public final opcuaclientmx.proxies.Certificate getServerCertificate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		opcuaclientmx.proxies.Certificate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServerCertificate.toString());
		if (identifier != null) {
			result = opcuaclientmx.proxies.Certificate.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ServerCertificate
	 * @param servercertificate
	 */
	public final void setServerCertificate(opcuaclientmx.proxies.Certificate servercertificate)
	{
		setServerCertificate(getContext(), servercertificate);
	}

	/**
	 * Set value of ServerCertificate
	 * @param context
	 * @param servercertificate
	 */
	public final void setServerCertificate(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.Certificate servercertificate)
	{
		if (servercertificate == null) {
			getMendixObject().setValue(context, MemberNames.ServerCertificate.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ServerCertificate.toString(), servercertificate.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final opcuaclientmx.proxies.OpcUaServerCfg that = (opcuaclientmx.proxies.OpcUaServerCfg) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
