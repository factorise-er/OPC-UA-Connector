// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package opcuaclientmx.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the OpcUaClientMx module
	public static boolean aSu_ReinitializeSubscriptions(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("OpcUaClientMx.ASu_ReinitializeSubscriptions").withParams(params).execute(context);
	}
	public static void bSd_GracefullyShutdownSubscriptions(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("OpcUaClientMx.BSd_GracefullyShutdownSubscriptions").withParams(params).execute(context);
	}
	public static void mB_ClientSettings_NewEdit(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("OpcUaClientMx.MB_ClientSettings_NewEdit").withParams(params).execute(context);
	}
	public static void mB_Create_OpcUaServer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("OpcUaClientMx.MB_Create_OpcUaServer").withParams(params).execute(context);
	}
	public static void mB_DeleteSubscription(IContext context, opcuaclientmx.proxies.MonitoredItem _monitoredItem, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MonitoredItem", _monitoredItem == null ? null : _monitoredItem.getMendixObject());
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_DeleteSubscription").withParams(params).execute(context);
	}
	public static void mB_OpcUaServerCfg_Browse(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg, opcuaclientmx.proxies.Troubleshooting _troubleshooting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		params.put("Troubleshooting", _troubleshooting == null ? null : _troubleshooting.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_OpcUaServerCfg_Browse").withParams(params).execute(context);
	}
	public static void mB_OpcUaServerCfg_Read(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg, opcuaclientmx.proxies.Troubleshooting _troubleshooting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		params.put("Troubleshooting", _troubleshooting == null ? null : _troubleshooting.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_OpcUaServerCfg_Read").withParams(params).execute(context);
	}
	public static void mB_OpcUaServerCfg_Subscribe_simple(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer, opcuaclientmx.proxies.Troubleshooting _troubleshooting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		params.put("Troubleshooting", _troubleshooting == null ? null : _troubleshooting.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_OpcUaServerCfg_Subscribe_simple").withParams(params).execute(context);
	}
	public static void mB_OpcUaServerCfg_Subscribe_wMsg(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer, opcuaclientmx.proxies.Troubleshooting _troubleshooting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		params.put("Troubleshooting", _troubleshooting == null ? null : _troubleshooting.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_OpcUaServerCfg_Subscribe_wMsg").withParams(params).execute(context);
	}
	public static void mB_OpcUaServerCfg_Write(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer, opcuaclientmx.proxies.Troubleshooting _troubleshooting)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		params.put("Troubleshooting", _troubleshooting == null ? null : _troubleshooting.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_OpcUaServerCfg_Write").withParams(params).execute(context);
	}
	public static void mB_ReconnectExistingSubscriptions(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_ReconnectExistingSubscriptions").withParams(params).execute(context);
	}
	public static opcuaclientmx.proxies.ClientSettings mB_RetrieveCreate_ClientSettings(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("OpcUaClientMx.MB_RetrieveCreate_ClientSettings").withParams(params).execute(context);
		return result == null ? null : opcuaclientmx.proxies.ClientSettings.initialize(context, result);
	}
	public static void mB_Save_OpcUaServer(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_Save_OpcUaServer").withParams(params).execute(context);
	}
	public static void mB_ShowAdvancedTroubleshooting(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_ShowAdvancedTroubleshooting").withParams(params).execute(context);
	}
	public static void mB_Subscription_Refresh(IContext context, opcuaclientmx.proxies.MonitoredItem _monitoredItem, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MonitoredItem", _monitoredItem == null ? null : _monitoredItem.getMendixObject());
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_Subscription_Refresh").withParams(params).execute(context);
	}
	public static void mB_Subscription_Unsubscribe(IContext context, opcuaclientmx.proxies.MonitoredItem _subscription, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Subscription", _subscription == null ? null : _subscription.getMendixObject());
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_Subscription_Unsubscribe").withParams(params).execute(context);
	}
	public static void mB_TestConnectionOPCServer(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServerCfg)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServerCfg", _opcUaServerCfg == null ? null : _opcUaServerCfg.getMendixObject());
		Core.microflowCall("OpcUaClientMx.MB_TestConnectionOPCServer").withParams(params).execute(context);
	}
	public static void reinitialzeSubscription(IContext context, opcuaclientmx.proxies.MonitoredItem _iteratorSubscription)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("IteratorSubscription", _iteratorSubscription == null ? null : _iteratorSubscription.getMendixObject());
		Core.microflowCall("OpcUaClientMx.ReinitialzeSubscription").withParams(params).execute(context);
	}
	public static boolean save_OpcUaServer(IContext context, opcuaclientmx.proxies.OpcUaServerCfg _opcUaServer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("OpcUaServer", _opcUaServer == null ? null : _opcUaServer.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("OpcUaClientMx.Save_OpcUaServer").withParams(params).execute(context);
	}
	public static void subscriptionIncomingData_Process_TEST(IContext context, java.lang.String _payload, java.lang.String _subscriptionID, java.lang.String _monitoredItemID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Payload", _payload);
		params.put("SubscriptionID", _subscriptionID);
		params.put("MonitoredItemID", _monitoredItemID);
		Core.microflowCall("OpcUaClientMx.SubscriptionIncomingData_Process_TEST").withParams(params).execute(context);
	}
	public static void subscriptionIncomingData_Process_wMessage_TEST(IContext context, opcuaclientmx.proxies.Message _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Message", _message == null ? null : _message.getMendixObject());
		Core.microflowCall("OpcUaClientMx.SubscriptionIncomingData_Process_wMessage_TEST").withParams(params).execute(context);
	}
	public static void unsubscribeSubscription(IContext context, opcuaclientmx.proxies.MonitoredItem _iteratorSubscription, boolean _restartSubscriptionOnNextReboot)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("IteratorSubscription", _iteratorSubscription == null ? null : _iteratorSubscription.getMendixObject());
		params.put("RestartSubscriptionOnNextReboot", _restartSubscriptionOnNextReboot);
		Core.microflowCall("OpcUaClientMx.UnsubscribeSubscription").withParams(params).execute(context);
	}
}
