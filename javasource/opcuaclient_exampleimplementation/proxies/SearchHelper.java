// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package opcuaclient_exampleimplementation.proxies;

public class SearchHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OpcUaClient_ExampleImplementation.SearchHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SearchString("SearchString"),
		SearchHelper_OpcUaNode("OpcUaClient_ExampleImplementation.SearchHelper_OpcUaNode");

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

	public SearchHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SearchHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchHelperMendixObject)
	{
		if (searchHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, searchHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.searchHelperMendixObject = searchHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SearchHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static opcuaclient_exampleimplementation.proxies.SearchHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return opcuaclient_exampleimplementation.proxies.SearchHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static opcuaclient_exampleimplementation.proxies.SearchHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new opcuaclient_exampleimplementation.proxies.SearchHelper(context, mendixObject);
	}

	public static opcuaclient_exampleimplementation.proxies.SearchHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return opcuaclient_exampleimplementation.proxies.SearchHelper.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
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
	 * @return value of SearchString
	 */
	public final java.lang.String getSearchString()
	{
		return getSearchString(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchString
	 */
	public final java.lang.String getSearchString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SearchString.toString());
	}

	/**
	 * Set value of SearchString
	 * @param searchstring
	 */
	public final void setSearchString(java.lang.String searchstring)
	{
		setSearchString(getContext(), searchstring);
	}

	/**
	 * Set value of SearchString
	 * @param context
	 * @param searchstring
	 */
	public final void setSearchString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String searchstring)
	{
		getMendixObject().setValue(context, MemberNames.SearchString.toString(), searchstring);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SearchHelper_OpcUaNode
	 */
	public final java.util.List<opcuaclient_exampleimplementation.proxies.OpcUaNode> getSearchHelper_OpcUaNode() throws com.mendix.core.CoreException
	{
		return getSearchHelper_OpcUaNode(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchHelper_OpcUaNode
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<opcuaclient_exampleimplementation.proxies.OpcUaNode> getSearchHelper_OpcUaNode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<opcuaclient_exampleimplementation.proxies.OpcUaNode> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.SearchHelper_OpcUaNode.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(opcuaclient_exampleimplementation.proxies.OpcUaNode.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of SearchHelper_OpcUaNode
	 * @param searchhelper_opcuanode
	 */
	public final void setSearchHelper_OpcUaNode(java.util.List<opcuaclient_exampleimplementation.proxies.OpcUaNode> searchhelper_opcuanode)
	{
		setSearchHelper_OpcUaNode(getContext(), searchhelper_opcuanode);
	}

	/**
	 * Set value of SearchHelper_OpcUaNode
	 * @param context
	 * @param searchhelper_opcuanode
	 */
	public final void setSearchHelper_OpcUaNode(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<opcuaclient_exampleimplementation.proxies.OpcUaNode> searchhelper_opcuanode)
	{
		var identifiers = searchhelper_opcuanode
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.SearchHelper_OpcUaNode.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchHelperMendixObject;
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
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final opcuaclient_exampleimplementation.proxies.SearchHelper that = (opcuaclient_exampleimplementation.proxies.SearchHelper) obj;
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
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}