package com.kedacom.platform2mc.ntv;		//package, import行可根据实际项目修改

import android.view.SurfaceView;
import android.support.v4.app.Fragment;
import android.content.Context;


public class IPhoenixSDK_Android extends IPhoenixSDK{
    private static final String TAG = "[IPhoenixSDK_Android]";

    static {																				  
    	//不可修改，这二个库的存放路径应放在工程目录下的/libs/armeabi/下
        System.loadLibrary("osp");
        System.loadLibrary("unicommon");
        System.loadLibrary("kdaudiodecoder");
        System.loadLibrary("kdaudioio");
        System.loadLibrary("kdvideodecode");
        System.loadLibrary("kdvideoplayer");
        System.loadLibrary("uniplay");
        System.loadLibrary("urlplaysdk");
        System.loadLibrary("McuSDK_AndroidJni");
    }
}
