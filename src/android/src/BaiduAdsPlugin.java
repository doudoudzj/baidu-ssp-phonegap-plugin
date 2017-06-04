package com.crogram.diandian;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.baidu.cordova.plugin.BaiduAdPlugin;
import com.baidu.mobads.AdSettings;
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
//  private InterstitialAd b;
  public RelativeLayout relativeLayout;
//  private HashMap c = new HashMap();
  RelativeLayout a;

  public void onDestroy()
  {
    // h(null, null);
    super.onDestroy();
  }

  public boolean execute(String paramString, CallbackContext paramCallbackContext)
  {
    if ("setKeywords".equals(paramString))
        // AdSettings.setKey(new String[]{"baidu", paramString});
     a(paramString, paramCallbackContext);
    return true;
  }


  private void a(String paramString1, CallbackContext paramString2)
  {
    Activity localActivity = this.cordova.getActivity();
    AdSettings.setKey(new String[]{"baidu", paramString1});
    // AdView.setAppSid(localActivity, paramString1);
    BaiduManager.init(localActivity);
    if (this.relativeLayout == null)
      this.relativeLayout = new RelativeLayout(localActivity);
  }
}
