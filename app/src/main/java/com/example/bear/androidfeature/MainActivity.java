package com.example.bear.androidfeature;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

//        isAppInstalled();


    }

    public void init() {
        if (isAppInstalled( "com.android.settings")) {
//            Intent intent=new Intent(Intent.ACTION_VIEW);
//            intent.addCategory(Intent.CATEGORY_BROWSABLE);
//            intent.setData(Uri.parse("http://u.androidgame-store.com/new/game1/4/110904/com.android.chrome-49.0.2623.91-262309101.apk?f=baidu_1"));//复制的百度下载链接
//            intent.setClassName("com.android.chrome", "com.google.android.apps.chrome.Main");
//            context.startActivity(intent);
        } else {
//            Toast.makeText(context, "亲，您尚未安装谷歌浏览器，请先安装", Toast.LENGTH_SHORT).show();
            //http://u.androidgame-store.com/new/game1/4/110904/com.android.chrome-49.0.2623.91-262309101.apk?f=baidu_1
//            Intent intent=new Intent(Intent.ACTION_VIEW);
//            intent.addCategory(Intent.CATEGORY_BROWSABLE);
//            intent.setData(Uri.parse("http://u.androidgame-store.com/new/game1/4/110904/com.android.chrome-49.0.2623.91-262309101.apk?f=baidu_1"));
//            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");//调用系统浏览器下载，下载到系统的下载地址
//            context.startActivity(intent);
        }
    }


    private boolean isAppInstalled(String packageName) {
        PackageInfo packageInfo;
        try {
//            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            packageInfo = getPackageManager().getPackageInfo(packageName, 0);
            Log.v("isAppInstalled", String.valueOf(packageInfo));
        } catch (PackageManager.NameNotFoundException e) {
            // TODO Auto-generated catch block
            packageInfo = null;
            e.printStackTrace();
        }
        if (packageInfo == null) {
            Log.v("isAppInstalled", "return false");
            return false;
        } else {
            Log.v("isAppInstalled", "return true");
            return true;
        }
    }

//    private void hasBrowser(Context context){
//        PackageManager pm=context.getPackageManager();
//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        intent.addCategory(Intent.CATEGORY_BROWSABLE);
//        intent.setData(Uri.parse("http://"));
//        List<ResolveInfo> list=pm.queryIntentActivities(intent, PackageManager.GET_INTENT_FILTERS);
//        if(size>0){
//            for (int i = 0; i < size; i++) {
//                ActivityInfo activityInfo=list.get(i).activityInfo;
//                Log.i("GetBrowserInfo", "The packageName is "+activityInfo.packageName+" "+activityInfo.name+"\n");
//            }
//
//        }
//    }
}
