// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package opcuaclientmx.proxies;

public class Subscription
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject subscriptionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OpcUaClientMx.Subscription";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RequestedPublishingInterval_ms("RequestedPublishingInterval_ms"),
		SubscriptionID("SubscriptionID"),
		Status("Status"),
		Subscription_OpcUaServerCfg("OpcUaClientMx.Subscription_OpcUaServerCfg");

		private java.lang.String metaName;

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

	public Subscription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "OpcUaClientMx.Subscription"));
	}

	protected Subscription(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject subscriptionMendixObject)
	{
		if (subscriptionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("OpcUaClientMx.Subscription", subscriptionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a OpcUaClientMx.Subscription");

		this.subscriptionMendixObject = subscriptionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Subscription.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static opcuaclientmx.proxies.Subscription initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return opcuaclientmx.proxies.Subscription.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static opcuaclientmx.proxies.Subscription initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new opcuaclientmx.proxies.Subscription(context, mendixObject);
	}

	public static opcuaclientmx.proxies.Subscription load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return opcuaclientmx.proxies.Subscription.initialize(context, mendixObject);
	}

	public static java.util.List<opcuaclientmx.proxies.Subscription> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<opcuaclientmx.proxies.Subscription> result = new java.util.ArrayList<opcuaclientmx.proxies.Subscription>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//OpcUaClientMx.Subscription" + xpathConstraint))
			result.add(opcuaclientmx.proxies.Subscription.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of RequestedPublishingInterval_ms
	 */
	public final java.math.BigDecimal getRequestedPublishingInterval_ms()
	{
		return getRequestedPublishingInterval_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestedPublishingInterval_ms
	 */
	public final java.math.BigDecimal getRequestedPublishingInterval_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.RequestedPublishingInterval_ms.toString());
	}

	/**
	 * Set value of RequestedPublishingInterval_ms
	 * @param requestedpublishinginterval_ms
	 */
	public final void setRequestedPublishingInterval_ms(java.math.BigDecimal requestedpublishinginterval_ms)
	{
		setRequestedPublishingInterval_ms(getContext(), requestedpublishinginterval_ms);
	}

	/**
	 * Set value of RequestedPublishingInterval_ms
	 * @param context
	 * @param requestedpublishinginterval_ms
	 */
	public final void setRequestedPublishingInterval_ms(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal requestedpublishinginterval_ms)
	{
		getMendixObject().setValue(context, MemberNames.RequestedPublishingInterval_ms.toString(), requestedpublishinginterval_ms);
	}

	/**
	 * @return value of SubscriptionID
	 */
	public final java.lang.String getSubscriptionID()
	{
		return getSubscriptionID(getContext());
	}

	/**
	 * @param context
	 * @return value of SubscriptionID
	 */
	public final java.lang.String getSubscriptionID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SubscriptionID.toString());
	}

	/**
	 * Set value of SubscriptionID
	 * @param subscriptionid
	 */
	public final void setSubscriptionID(java.lang.String subscriptionid)
	{
		setSubscriptionID(getContext(), subscriptionid);
	}

	/**
	 * Set value of SubscriptionID
	 * @param context
	 * @param subscriptionid
	 */
	public final void setSubscriptionID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String subscriptionid)
	{
		getMendixObject().setValue(context, MemberNames.SubscriptionID.toString(), subscriptionid);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final opcuaclientmx.proxies.SubscriptionStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final opcuaclientmx.proxies.SubscriptionStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return opcuaclientmx.proxies.SubscriptionStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(opcuaclientmx.proxies.SubscriptionStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.SubscriptionStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Subscription_OpcUaServerCfg
	 */
	public final opcuaclientmx.proxies.OpcUaServerCfg getSubscription_OpcUaServerCfg() throws com.mendix.core.CoreException
	{
		return getSubscription_OpcUaServerCfg(getContext());
	}

	/**
	 * @param context
	 * @return value of Subscription_OpcUaServerCfg
	 */
	public final opcuaclientmx.proxies.OpcUaServerCfg getSubscription_OpcUaServerCfg(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		opcuaclientmx.proxies.OpcUaServerCfg result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Subscription_OpcUaServerCfg.toString());
		if (identifier != null)
			result = opcuaclientmx.proxies.OpcUaServerCfg.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Subscription_OpcUaServerCfg
	 * @param subscription_opcuaservercfg
	 */
	public final void setSubscription_OpcUaServerCfg(opcuaclientmx.proxies.OpcUaServerCfg subscription_opcuaservercfg)
	{
		setSubscription_OpcUaServerCfg(getContext(), subscription_opcuaservercfg);
	}

	/**
	 * Set value of Subscription_OpcUaServerCfg
	 * @param context
	 * @param subscription_opcuaservercfg
	 */
	public final void setSubscription_OpcUaServerCfg(com.mendix.systemwideinterfaces.core.IContext context, opcuaclientmx.proxies.OpcUaServerCfg subscription_opcuaservercfg)
	{
		if (subscription_opcuaservercfg == null)
			getMendixObject().setValue(context, MemberNames.Subscription_OpcUaServerCfg.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Subscription_OpcUaServerCfg.toString(), subscription_opcuaservercfg.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return subscriptionMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final opcuaclientmx.proxies.Subscription that = (opcuaclientmx.proxies.Subscription) obj;
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
		return "OpcUaClientMx.Subscription";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}