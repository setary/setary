package com.kedacom.platform2mc.ntv;		//package, import�пɸ���ʵ����Ŀ�޸�

//import android.util.Log;

import com.kedacom.platform2mc.struct.ChnTranData;
import com.kedacom.platform2mc.struct.DevSrcSta;
import com.kedacom.platform2mc.struct.DevAllChnIdName;
import com.kedacom.platform2mc.struct.DeviceGroupInfo;
import com.kedacom.platform2mc.struct.DeviceInfo;
import com.kedacom.platform2mc.struct.DeviceID;
import com.kedacom.platform2mc.struct.EncoderParam;
import com.kedacom.platform2mc.struct.EncoderParamTotal;
import com.kedacom.platform2mc.struct.StreamUrlInfo;
import com.kedacom.platform2mc.struct.StreamUrlList;
import com.kedacom.platform2mc.struct.SubsDevices;
import com.kedacom.platform2mc.struct.DeviceStatus;
import com.kedacom.platform2mc.struct.GroupID;
import com.kedacom.platform2mc.struct.VideoSrcInfoSDK;
import com.kedacom.platform2mc.struct.DevChn;
import com.kedacom.platform2mc.struct.PtzCmd;
import com.kedacom.platform2mc.struct.PointMoveCmd;
import com.kedacom.platform2mc.struct.StreamParam;
import com.kedacom.platform2mc.struct.EventInfo;
import com.kedacom.platform2mc.struct.AppVersionUrl;
import com.kedacom.platform2mc.struct.TRecordInfo;
import com.kedacom.platform2mc.struct.TPeriod;
import com.kedacom.platform2mc.struct.VidOSD;
import com.kedacom.platform2mc.struct.SearchDvcRspInfo;
import com.kedacom.platform2mc.struct.RecPlyCtlInfo;
import com.kedacom.platform2mc.struct.TRecordDownloadInfo;
import com.kedacom.platform2mc.struct.DeviceGroupPathItem;
import com.kedacom.platform2mc.struct.SearchResultItem;
import com.kedacom.platform2mc.struct.DeviceTree;

public class IPhoenixSDK {

    //java����jni�������豸״̬��Ϣ���豸�����߼��澯���ص������ӿ�
    public static native boolean MsgSetEnv();

	//java����jni���ȡ�豸״̬��Ϣֵ���豸�����߼��澯���Ľӿ�
	//�������豸�����ߵ���Ϣ���Ǹ澯��Ϣ�ص�Ҫ�����ṹ��DeviceStatus��ֵ
    public static native boolean JSetMsg(int useless[], DeviceID mDeviceID, DeviceStatus mDeviceStatus);

	//java����jni�������豸�¼��ص��������������ţ�ץ�Ļص����Լ��ؼ���ص��������ӿ�
    public static native boolean MsgSetEnvEventCB();

	//java����jni���ȡ�豸�¼��ص���ֵ�������������ţ�ץ�Ļص����Լ��ؼ���ص����Ľӿ�
	//�����������¼��Ļص���Ҫ�����ṹ��EventInfo��ֵ
    public static native boolean JSetMsgEventCB(int useless[], EventInfo mEventInfo);

	public native static int	PlatTypeDetect(String server,int errorCode[]);

	//�β�BusinessModeֵΪ1,��ʾ��ʼ��ƽ̨1.0�Ļ���;�β�BusinessModeֵΪ2,��ʾ��ʼ��ƽ̨2.0�Ļ���
	//�β�StreamModeֵΪ3ʱ����ʾSDK�õ���g900��������
	//�β�DecoderMode��ֵΪ1ʱ����ʾ����SDK�Ľ���
	public native boolean ModualSelect(int BusinessMode,int StreamMode,int DecoderMode);
	//SDK��ʼ������
 	public native boolean Init();
	//SDK��ʼ�������ڶ��汾����Ҫ����Context��������ͬ����֧���µ�Android Media��Ƶ���ŷ���
    public native boolean InitV2(Object context);

	//SDK���ٺ���
    public native boolean Cleanup();
		
	//��ȡSDK�汾��Ϣ��SDK�����ʱ������ڣ�
    public native boolean GetAppVersion(AppVersionUrl mAppVersionUrl);
    
    //�ͻ��˵�½ƽ̨�ĺ���
    public native boolean LogIn(String userName, String passWord, String server, String clientType, int errorCode[]);	//native ���������޸�

	//�ͻ��˵ǳ���ע����ƽ̨�ĺ���
    public native boolean Logout();
        
	//��ȡ�豸������Ϣ
    public native int GetGroupByGroup(GroupID groupid, int errorCode[]);

	//�����������taskIDΪ����GetGroupByGroup�ķ���ֵ
    public native boolean GetGroupNext(int taskID, DeviceGroupInfo groupInfo, int errorCode[]);
		
	//��ȡ�豸��Ϣ
    public native int GetDeviceByGroup(GroupID groupid, int errorCode[]);
    
    //�����������taskIDΪ����GetDeviceByGroup�ķ���ֵ
    public native boolean GetDeviceNext(int taskID, DeviceInfo deviceInfo, int errorCode[]);
    
    //ptz�����ӿڣ��ϣ��£���,�ң�
    public native boolean SetPtzControl(DevChn tDevChn, PtzCmd tPtzCmd, int errorCode[]);

	//ptz�����ӿڣ�ֻ��Գ������У�
    public native boolean SetPointMoveControl(DevChn tDevChn, PointMoveCmd tPointMoveCmd, int errorCode[]);
	
	//ptz�ӿ�(����Ԥ��λ)	
	public native boolean SetPtzPreSet(DevChn tDevChn, int tPreSetPostion, int errorCode[]);
	
	//ptz�ӿ�(����Ԥ��λ)
	public native boolean SavePtzPreSet(DevChn tDevChn, int tPreSetPostion, int errorCode[]);

    //��ȡ�豸�Ĺ���ID�ӿ�
    public native boolean GetDeviceGBID(DevChn tDevChn, DevChn tDevGbID);

    //��ʼʵʱ�������Žӿ�
    public native int StartRealPlay(DevChn tDevChn, StreamParam tStreamParam, Object surfaceView, int errorCode[]);

	//ֹͣʵʱ�������Žӿ�
    public native boolean StopRealPlay(int dwPlayID, int errorCode[]);
    
    //��ʼ����¼��ӿ�
    //�����������fileTypeΪ1ʱ����ʾ����¼���ļ�����ĸ�ʽΪem3gp
    //�����������fileTypeΪ��1ʱ����Ч(��ʱ��֧��)
    public native boolean StartLocalRecord(int dwPlayID, String strFileName, int fileType);
    
    //ֹͣ����¼��ӿ�
    public native boolean StopLocalRecord(int dwPlayID);
    
    //ץ�ĺ����ӿ�
    //�����������fileTypeΪ1ʱ����ʾץ��ͼƬ�ı����ʽΪemJpeg.
    //�����������fileType��1ʱ����Ч(��ʱ��֧��)
    public native boolean SaveSnapshot(int dwPlayID, String strFileName, int fileType);

	//���ò�����Ƶ�����������ӿ�
	//�������resolutionTypeΪ1ʱΪ���壬�������Ϊ0ʱΪ����
    public native boolean SetHighDefinitionValue(int resolutionType);

	//javaӦ�ò�����Ҫ���ĵ��豸��һ�������Զ���20���豸
	//���д������subscriptTypeΪ1ʱ��ʾ�����豸��������Ϣ
	//���д������subscriptTypeΪ2ʱ��ʾ�����豸�澯��Ϣ
	//���д������subscriptTypeΪ3ʱ��ʾ�����豸�����ߺ͸澯��Ϣ
    public native boolean SetSubscriptDeviceStatus(SubsDevices mSubsDevices, int subscriptType, int errorCode[]);
    
    //javaӦ�ò�����Ҫȡ�����ĵ��豸��ֻ֧�ֵ����豸�������
    //���д������subscriptType�ĺ���ͬ��
    public native boolean SetUnSubscriptDeviceStatus(SubsDevices mSubsDevices, int subscriptType, int errorCode[]);
    

	//��G900��������ʱ�����ֻ���UUID������ʶ�ֻ��豸��������SDK��ʼ���ɹ��Ժ󣬵���һ�δ˽ӿ�
    public native boolean SetFeatureCode(String temFeatureCode);


	//�����ط�¼���taskID������ֵ����taskID������0��ֵ������-1��ʾ����
    public native int CreateRecordTask(DevChn temDevChn ,int errorCode[]);
	//��ѯһ��ʱ��ε�¼��
    public native boolean PreLoadRecord(int dwTaskId, TPeriod PreLoadTime, int recordType, int errorCode[]);
	//���յ���ѯ¼����¼��ص��Ժ���ô˽ӿڻ�ȡrecord����
    public native boolean GetRecordNext(int dwTaskId, int dwSeekTime, TRecordInfo dwRecordInfo, int errorCode[]);
	//��ʼ�ط�¼��
    public native int StartRecordplay(int dwTaskId, int dwPlayTime, int playType,Object surfaceView, int errorCode[]);

	//¼��طŵ�VCR����
	public native boolean RecordPlayCtrl(RecPlyCtlInfo stRecPlyCtlInfo,int errorCode[]);

	//ֹͣ�ط�¼��
    public native boolean StopRecordplay(int playId,int errorCode[]);
	//����֮ǰ������tasdkID
    public native boolean DestroyRecordTask(int dwTaskId);

	public native boolean SetVideoOSD(DevChn tDevChn,VidOSD tVidOsd,int errorCode[]);

	//����ƽ̨¼��
	public native boolean StartPlatRec(DevChn tDevChn, int errorCode[]);
	//ֹͣƽ̨¼��
	public native boolean StopPlatRec(DevChn tDevChn, int errorCode[]);
	//����������Ч
    public native boolean SetAudioEnable(int jplayId);
	//��������
    public native boolean SetAudioDisable(int jplayId);
	//�����豸
    public native boolean SearchDvc(String jSearchDvcName,int SearchResLimt,int errorCode[]);
	//��ȡ�������
	public native boolean GetSearchDvcRspInfo( SearchDvcRspInfo jSearchDvcInfo,int errorCode[]);
	//��ȡ��������Ϣ
	public native boolean GetGroupInfo(GroupID jGroupId,DeviceGroupInfo jGroupInfo);
	//�������jdwLogFlagΪ1ʱ��ʾ��������log��־�ļ���0��ʾ�رձ���log��־�ļ� �����·���ڡ�mnt/sdcrad/log/���ļ���
	public native boolean SetSaveLogFile(int jdwLogFlag,String jSaveLogFileDirectName);
	//�������jdwShowLogLevΪ1��ʾ������Ļ��ӡ��0��ʾ�ر���Ļ��ӡ
	public native boolean SetScreenShowLog(int jdwShowLogLev);
	
	public native boolean GetDevSrcStatus(DevChn tDevChn,DevSrcSta tDevSrcSta,int errorCode[]);
	
	public native boolean SendKeyFrame(DevChn tDevChn,int errorCode[]);
	
	public native boolean SendTransData(DevChn tDevChn,ChnTranData tChnTranData,int errorCode[]);
	
	public native boolean GetPuEncoderParam(DevChn tDevChn,EncoderParamTotal tEncParaTotal,int errorCode[]);
	
	public native boolean SetPuEncoderParam(DevChn tDevChn,EncoderParam tEncParam,int errorCode[]);
	
	public native boolean GetDevChnIdName(DevChn tDevChn,DevAllChnIdName tDevChnIdName,int errorCode[]);
	
	//¼������
	public native int StartRecordDownLoad(int dwTaskID, TRecordDownloadInfo tDownloadInfo, int errorCode[]);
	public native boolean StopRecordDownLoad(int dwPlayID, int errorCode[]);
	//������������streamPattern:0��ʾTCP����, :1��ʾUDP����
	public native boolean SetStreamPattern(int streamPattern, int errorCode[]);
	//�޸�����
	public native boolean ChangePassword(String oldPwd, String newPwd, int errorCode[]);
	//��ʼurl����
    public native int StartPlay(String utf8_url, StreamParam tStreamParam, Object surfaceView, int errorCode[]);
	//ֹͣurl����
    public native boolean StopPlay(int dwPlayID, int errorCode[]);
	//���ý���������:nDecodeMode:1��ʾӲ���룬0��ʾ�����
	public native boolean SetDecodeMode(int nDecodeMode);
	//��ȡ�����豸���б�
	public native DeviceTree[] GetMultiViewDeviceTreeList(/*DeviceTree treeList[],*/ int errorCode[]);
	//���õ�ǰ�������豸��ID
	public native boolean SelectDeviceTreeID(String treeId, int errorCode[]);
	//��������������,����ֵ����taskID������0��ֵ������-1��ʾ����
	//�������� String queryKey���﷨
	// �豸����/ͳ�� ��������queryKey�ؼ���֧������, ��������֮�䶼�� AND ��ϵ, �﷨��ʹ�ÿո����
	// userid		ָ��Ҫ�������û�id, δָ��ʱ������ǰ��¼�û�.
	// key			�����ؼ���. ģ��ƥ��. ƴ������ĸ?
	// state=online/offline	�豸״̬, ����/������, idle״̬���Ǻ��Ե���.
	// tree		ָ��Ҫ��������id(��ͼ), ���δָ��,����ϵͳĬ���豸��.
	// rootgroup	ָ�����豸��, δָ��ʱΪ���ĸ���.
	// devid		ָ��Ҫ�������豸Id.
	// filterEmptyGroup	ָ���豸�����Ƿ����豸,Ĭ��ֻ�������豸���豸��.
	// type=group/device/videosrc		ָ��Ҫ�������������豸��, �豸,��ƵԴ.
	// ���� "key=123 tree=f0fe7512844940d298e5e40d96cd9b98 type=device"
	
	//int maxnum ϣ���������ص������Ŀ�������������󲻻ᳬ����ֵ��
	//int timeoutMS ����������ʱ�䣨���룩����Ϊ�ǳ�ʱ
	//boolean bNotifyResult ��ʾ�Ƿ�����������¼���ʽ֪ͨ�û� SDK_EVENT_CALLBACK_WORKTYPE_SEARCHRESULT
	//�ýӿ���Ҫ IsCapbilityEnable(SDK_CAPTYPE_MULTIVIEW_DEVICETREE_SEARCH) ����true����ʹ�á�
	public native int CreateSearchTask(String queryKey, int maxnum, int timeoutMS, boolean bNotifyResult, int errorCode[]);
	//�����������	
	//int beginIndex ���ؽ����ʼ������
	//int num �����������ص���Ŀ��
	//SearchResultItem resultItems[] ���������������
	//int totalNum[] ���ؽ������������ֵ������δ���ǰ�����ܻ��
	//int lastPage[] �Ƿ������һҳ��ǣ�1��ʾ�����һҳ0��ʾ������
	public native SearchResultItem[] GetSearchResult(int taskId, int beginIndex, int num, /*SearchResultItem resultItems[],*/ int totalNum[], int lastPage[], int errorCode[]);
	//��������
	public native boolean DestroySearchTask(int taskId);
	//�ж�ƽ̨��SDK�Ƿ�֧��ĳ���������˺�����������ȷ��¼ƽ̨����ܵ��ã�
	//capType�μ�java�������� SDK_CAPTYPE_MULTIVIEW_DEVICETREE_SEARCH
	public native boolean IsCapbilityEnable(int capType);
	
	public void SetMainCtx() {	
		//���������޸ģ������ڲ�ʵ�ֲ����޸ģ����ڳ�ʼ���豸״̬�ص��������豸�¼��ص�����
		MsgSetEnv();
    	MsgSetEnvEventCB();
	}
	
	public static void myCallbackFunc() {		
    	//�豸״̬�������ߣ��澯�ȣ��ص������������������޸ģ������ڲ�ʵ�ֿ��޸�
	}

    public static void myEventCallBackFunc() {
    	//�豸�¼������󲥷�������ץ���Ƿ�ɹ����ص������������������޸ģ������ڲ�ʵ�ֿ��޸�
	}

	public static int StreamUrlCallBackFunc(StreamUrlList temUrlList)
	{
		//SDK��URL�ص�
		//Ӧ�ò����ʵ�����������Ҳ���Բ�ʵ�����������
		//���Ӧ�ò㲻ʵ���������������ֵ�뷵��65535,
		//Ӧ�ò����ʵ���������������ֵӦ��С��m_byUrlNum
		//Log.d("xql", "temUrlList.m_byUrlNum="+temUrlList.m_byUrlNum);
		for(int UrlIdx = 0;UrlIdx < temUrlList.m_byUrlNum;UrlIdx++)
		{
			//Log.d("xql", "tempUrlInfo.m_szUrl="+temUrlList.m_StreamUrl[0].m_szUrl+"  tempUrlInfo.m_dwWidth="+temUrlList.m_StreamUrl[0].m_dwWidth+"  tempUrlInfo.m_dwHeight="+temUrlList.m_StreamUrl[0].m_dwHeight);
		}
		int RtnUrlIndx = 0;
		
		return RtnUrlIndx;
	}
}
