package com.crogram.diandian;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.baidu.cordova.plugin.BaiduAdPlugin;
import com.baidu.mobads.AdView;
import com.baidu.mobads.BaiduManager;
import com.baidu.mobads.InterstitialAd;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

public class BaiduAdsPlugin extends CordovaPlugin
{
  private InterstitialAd b;
  public RelativeLayout relativeLayout;
  private HashMap c = new HashMap();
  RelativeLayout a;

  public void onDestroy()
  {
    h(null, null);
    super.onDestroy();
  }

  public boolean execute(String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    // if ("baiduShowBannerAbsolute".equals(paramString))
    //   b(paramJSONArray, paramCallbackContext);
    // if ("baiduShowBanner".equals(paramString))
    //   c(paramJSONArray, paramCallbackContext);
    // if ("baiduHideBanner".equals(paramString))
    //   d(paramJSONArray, paramCallbackContext);
    // if ("baiduCacheInterstitial".equals(paramString))
    //   g(paramJSONArray, paramCallbackContext);
    // if ("baiduIsInterstitialReady".equals(paramString))
    //   e(paramJSONArray, paramCallbackContext);
    // if ("baiduShowInterstitial".equals(paramString))
    //   f(paramJSONArray, paramCallbackContext);
    // if ("disposePlugin".equals(paramString))
    //   h(paramJSONArray, paramCallbackContext);
    if ("baiduShowSplash".equals(paramString))
      a(paramJSONArray, paramCallbackContext);
    return true;
  }

  private void a(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    JSONObject localJSONObject = paramJSONArray.getJSONObject(0);
    String str1 = localJSONObject.getString("appID");
    String str2 = localJSONObject.getString("splashID");
    // this.cordova.getActivity().runOnUiThread(new c(this, str1, str2));
    paramCallbackContext.success();
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    // if (this.c.containsKey(paramString3))
    //   return;
    Activity localActivity = this.cordova.getActivity();
    AdView.setAppSid(localActivity, paramString1);
    AdView.setAppSec(localActivity, paramString1);
    BaiduManager.init(localActivity);
    if (this.relativeLayout == null)
      this.relativeLayout = new RelativeLayout(localActivity);
    AdView localAdView = new AdView(this.cordova.getActivity(), paramString2);
    // localAdView.setListener(new k(this));
    // this.c.put(paramString3, localAdView);
  }

  // private void b(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   JSONObject localJSONObject = paramJSONArray.getJSONObject(0);
  //   int i = localJSONObject.getInt("x");
  //   int j = localJSONObject.getInt("y");
  //   String str1 = localJSONObject.getString("appID");
  //   String str2 = localJSONObject.getString("bannerID");
  //   String str3 = (localJSONObject.has("bannerName")) ? localJSONObject.getString("bannerName") : "defaultBanner";
  //   this.cordova.getActivity().runOnUiThread(new d(this, str1, str2, str3, i, j));
  //   paramCallbackContext.success();
  // }

  // private void c(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   JSONObject localJSONObject = paramJSONArray.getJSONObject(0);
  //   int i = localJSONObject.getInt("position");
  //   int j = localJSONObject.getInt("marginY");
  //   String str1 = localJSONObject.getString("appID");
  //   String str2 = localJSONObject.getString("bannerID");
  //   String str3 = (localJSONObject.has("bannerName")) ? localJSONObject.getString("bannerName") : "defaultBanner";
  //   this.cordova.getActivity().runOnUiThread(new e(this, str1, str2, str3, j, i));
  //   paramCallbackContext.success();
  // }

  // private void d(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   this.cordova.getActivity().runOnUiThread(new f(this, paramJSONArray));
  //   paramCallbackContext.success();
  // }

  // private void e(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   if (this.b != null)
  //     this.cordova.getActivity().runOnUiThread(new g(this, paramCallbackContext));
  //   else
  //     paramCallbackContext.success(0);
  // }

  // private void f(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   this.cordova.getActivity().runOnUiThread(new h(this));
  //   paramCallbackContext.success();
  // }

  // private void g(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   this.cordova.getActivity().runOnUiThread(new i(this, paramJSONArray));
  //   paramCallbackContext.success();
  // }

  // private void h(JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  // {
  //   this.cordova.getActivity().runOnUiThread(new j(this));
  //   if (paramCallbackContext == null)
  //     return;
  //   paramCallbackContext.success();
  // }

  // private void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, AdView paramAdView)
  // {
  //   RelativeLayout.LayoutParams localLayoutParams;
  //   if (paramBoolean)
  //   {
  //     localLayoutParams = l.a(paramInt3);
  //     localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
  //   }
  //   else
  //   {
  //     localLayoutParams = l.a(paramInt3);
  //     if (paramInt3 <= 0)
  //       localLayoutParams.setMargins(0, paramInt2, 0, 0);
  //     else if (paramInt3 >= 7)
  //       localLayoutParams.setMargins(0, 0, 0, paramInt2);
  //   }
  //   if (paramAdView.getParent() != null)
  //     ((ViewGroup)paramAdView.getParent()).removeView(paramAdView);
  //   this.relativeLayout.addView(paramAdView, localLayoutParams);
  //   if (this.relativeLayout.getParent() != null)
  //     return;
  //   this.cordova.getActivity().addContentView(this.relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
  // }

  void a(String paramString1, String paramString2)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("data", paramString2);
      String str1 = localJSONObject.toString();
      String str2 = "javascript:cordova.fireDocumentEvent(\"" + paramString1 + "\"," + str1 + ");";
      Method localMethod = this.webView.getClass().getMethod("loadUrl", new Class[] { String.class });
      localMethod.invoke(this.webView, new Object[] { str2 });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}
