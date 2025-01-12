// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package encryption.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	/**
	 * @deprecated
	 * The default constructor of the Constants class should not be used.
	 * Use the static get methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Constants() {}

	// These are the constants for the Encryption module

	/**
	* This key will be used to encrypt and decrypt values.
	* The length of this key must be 32 characters.
	*/
	public static java.lang.String getEncryptionKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Encryption.EncryptionKey");
	}

	/**
	* Prefix for stored encrypted values.
	* This value is used to determine whether the value has been already encrypted.
	* The prefix must be either {AES}, {AES2} or {AES3}.
	* Encryption is only supported if the prefix is {AES3}.
	* It is not recommended to change this value.
	*/
	public static java.lang.String getEncryptionPrefix()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Encryption.EncryptionPrefix");
	}

	/**
	* This key will be used to decrypt values that are encrypted with legacy algorithms.
	* The length of this key must be 16 characters.
	*/
	public static java.lang.String getLegacyEncryptionKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Encryption.LegacyEncryptionKey");
	}

	/**
	* Node which appears in log messages for this module.
	*/
	public static java.lang.String getLogNode()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Encryption.LogNode");
	}
}