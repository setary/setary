package com.kedacom.platform2mc.ntv;		//package, import�пɸ���ʵ����Ŀ�޸�

import android.view.SurfaceView;
import android.support.v4.app.Fragment;
import android.content.Context;


public class IPhoenixSDK_Android extends IPhoenixSDK{
    private static final String TAG = "[IPhoenixSDK_Android]";

    static {																				  
    	//�����޸ģ��������Ĵ��·��Ӧ���ڹ���Ŀ¼�µ�/libs/armeabi/��
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
