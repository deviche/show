package com.dev.show.utils;

import android.util.Log;

import com.dev.show.BuildConfig;

public class Logutils {

    //默认debug调试环境下显示log,release环境不会显示
    //也可以通过下面set方法设置
    public  static boolean isShowDebug = BuildConfig.DEBUG;

    public void setShowDebug(boolean showDebug) {
        isShowDebug = showDebug;
    }


    public  static  void  v(String tag,String msg){
        if (isShowDebug){
            Log.v(tag,msg);
        }
    }

    public static void v(String msg){
        if (isShowDebug){
            Logutils.v("",msg);
        }
    }

    public static void  d(String tag, String msg){
        if (isShowDebug){
            Log.d(tag,msg);
        }
    }

    public static void d(String msg){
        if (isShowDebug){
            Logutils.d("",msg);
        }
    }

    public  static void  e(String tag,String msg){
        if (isShowDebug){
            Log.e(tag,msg);
        }
    }


    public  static void  e(String  msg){
        if (isShowDebug){
            Logutils.e("",msg);
        }
    }
}
