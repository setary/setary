package com.kedacom.platform2mc.ntv;

public class IPhoenixSDKConstantVal {

	// ptz value
	public final static int SDK_PTZ_LEFT = 0;		//ptz操作向左
	public final static int SDK_PTZ_RIGHT = 1;		//ptz操作向右
	public final static int SDK_PTZ_UP = 2;			//ptz操作向上
	public final static int SDK_PTZ_DOWN = 3;		//ptz操作向下
	public final static int SDK_PTZ_LEFT_UP =4;		//ptz操作左上
	public final static int SDK_PTZ_LEFT_DOWN = 5;	//ptz操作左下
	public final static int SDK_PTZ_RIGHT_UP = 6;	//ptz操作 右上
	public final static int SDK_PTZ_RIGHT_DOWN = 7;	//ptz操作右下
	public final static int SDK_PTZ_STOP = 8;		//ptz操作停止
	public final static int SDK_PTZ_ZOOMIN = 9;		//ptz操作放大
	public final static int SDK_PTZ_ZOOMOUT = 10;	//ptz操作缩小
	public final static int SDK_PTZ_ZOOMSTOP = 11;	//ptz操作缩放停止
	public final static int SDK_PTZ_HOME = 12;

	// 平台类型
	public final static int SDK_PLATFORM_TYPE_INVAILED = 0; //非法平台类型
	public final static int SDK_PLATFORM_TYPE_1 = 1;		//平台1.0
	public final static int SDK_PLATFORM_TYPE_2 = 2;		//平台2.0

	// 请求码流类型
	public final static int SDK_STREAM_MODE_TYPE_INVAILED = 0;	//非法平台类型
	public final static int SDK_STREAM_MODE_TYPE_PLAT_1 = 1;	//平台1.0
	public final static int SDK_STREAM_MODE_TYPE_PLAT_2 = 2;	//平台2.0
	public final static int SDK_STREAM_MODE_TYPE_G900 = 3;		//G900

	// 解码类型
	public final static int SDK_DECODER_MODE_INVAILED = 0; //SDK不解码
	public final static int SDK_DECODER_MODE_BASE_DEC = 1; //SDK启动解码器

	//解码器模式
	public final static int SDK_DECODER_MODE_SOFT_DEC = 0;     //软解码
	public final static int SDK_DECODER_MODE_HARDWARE_DEC = 1; //硬解码

	// 打印级别
	public final static int SDK_SCREEN_PRINT_LOG_LEVER_FORBIDDEN = 0;//禁止打印
	public final static int SDK_SCREEN_PRINT_LOG_LEVEL_NOMAL = 1;//打印全部日志信息
	public final static int SDK_SCREEN_PRINT_LOG_LEVER_KEY = 2;//打印关键日志信息
	public final static int SDK_SCREEN_PRINT_LOG_LEVER_SUCC = 3;//只打印成功日志信息
	public final static int SDK_SCREEN_PRINT_LOG_LEVER_FAIL = 4;//只打印失败日志信息


	// 码流播放类型
	public final static int SDK_VIDEO_PLAY_INVAILED = -1;//非法的视频浏览的类型
	public final static int SDK_VIDEO_PLAY_RECORD = 0;//录像回放的视频浏览
	public final static int SDK_VIDEO_PLAY_REAL = 1;//实时码流的视频浏览
	// 录像类型
	public final static int SDK_RECORD_TYPE_INVAILED = -1;//录像查询时和录像回放时非法录像类型
	public final static int SDK_RECORD_TYPE_PLATFORM = 0;//录像查询时和录像回放时平台录像类型
	public final static int SDK_RECORD_TYPE_PU = 1;		//录像查询时和录像回放时前端录像类型

	// 订阅消息类型
	public final static int SDK_SUB_SCRIPTION_TYPE_ONLINE = 1;//只订阅设备上下线信息
	public final static int SDK_SUB_SCRIPTION_TYPE_ALARM = 2;//只订阅设备告警信息
	public final static int SDK_SUB_SCRIPTION_TYPE_CONFIG = 4;//只订阅NVR通道配置信息
	public final static int SDK_SUB_SCRIPTION_TYPE_DEVSTATE = 7;//设备上下线，告警信息，NVR通道信息全订阅
	public final static int SDK_SUB_SRCIPTION_TYPE_GPS = 8;//只订阅设备GPS信息

	//设备订阅消息回调事件类型
	public final static int SDK_SUB_SCRIP_CALL_BACK_TYPE_ONLINE = 0;//设备上下线消息回调类型
	public final static int SDK_SUB_SCRIP_CALL_BACK_TYPE_ALARM = 1;//设备告警消息回调类型
	public final static int SDK_SBU_SCRIP_CALL_BACK_TYPE_CONFIG = 2;//设备通道信息回调类型
	public final static int SDK_SBU_SCRIP_CALL_BACK_TYPE_GPS = 3;//设备GPS信息回调
	
	//录像回放的CLT事件类型
	public final static int SDK_RECORD_PLAY_CLT_TYPE_PLAY = 0;//录像回放暂停后回放
	public final static int SDK_RECORD_PLAY_CLT_TYPE_PAUSE = 1;//录像回放的暂停
	public final static int SDK_RECORD_PLAY_CLT_TYPE_SEEK = 2;//录像回放的拖动操作
	public final static int SDK_RECORD_PLAY_CLT_TYPE_SCALE = 3;//录像回放时的快放和慢放
	
	//码流视频播放清晰与流畅
	public final static int SDK_VIDEO_PLAY_FLUENT = 0;		//实时浏览图像的流畅模式
	public final static int SDK_VIDEO_PLAY_HIGHDEFINITION = 1;//实时浏览图像的清晰模式
	public final static int SDK_VIDEO_PLAY_INDEX_INVAILED = 65535;//实时浏览图像URL的非法index,如果应用层不实现StreamUrlCallBackFunc接口，则返回该值
	
	//告警类型
	public final static int SDK_ALARM_TYPE_INVAILED = 0;
	public final static int SDK_ALARM_TYPE_MOVE = 1;
	public final static int SDK_ALARM_TYPE_INPUT = 2;
	public final static int SDK_ALARM_TYPE_DISK_FULL = 3;
	public final static int SDK_ALARM_TYPE_VIDEO_LOST = 4;
	public final static int SDK_ALARM_TYPE_INTE_LLIGENT = 5;
	public final static int SDK_ALARM_TYPE_VIDEO = 6;
		
	// 设备能力
	public final static int SDK_DEVICE_CAP_TYPE_BULLET = 0;		//前端是枪机	
	public final static int SDK_DEVICE_CAP_TYPE_DOME = 1;		//前端是球机
	public final static int SDK_DEVICE_CAP_TYPE_NULL = 2;		//不是枪机也不是球机

	// 设备类型
	public final static int SDK_DEVICE_TYPE_UNKNOWN = 0;
	public final static int SDK_DEVICE_TYPE_ENCODER = 1;
	public final static int SDK_DEVICE_TYPE_DECODER = 2;
	public final static int SDK_DEVICE_TYPE_CODECER = 3;
	public final static int SDK_DEVICE_TYPE_TVWALL = 4;
	public final static int SDK_DEVICE_TYPE_NVR = 5;
	public final static int SDK_DEVICE_TYPE_SVR = 6;
	public final static int SDK_DEVICE_TYPE_ALARM_HOST = 7;
	
	//抓拍图片格式
	public final static int SDK_SNAP_SHOT_TYPE_BMP_32 = 0;
	public final static int SDK_SANP_SHOT_TYPE_JPG_100 = 1;
	public final static int SDK_SNAP_SHOT_TYPE_JPG_70 = 2;
	public final static int SDK_SNAP_SHOT_TYPE_JPG_50 = 3;
	public final static int SDK_SNAP_SHOT_TYPE_JPG_30 = 4;
	public final static int SDK_SANP_SHOT_TYPE_JPG_10 = 5;
	public final static int SDK_SNAP_SHOT_TYPE_BMP_24 = 6;
	
	//本地录像保存类型
	public final static int SDK_LOCAL_REC_TYPE_MP4 = 0;		//
	public final static int SDK_LOCAL_REC_TYPE_3GP = 1;
	public final static int SDK_LOCAL_REC_TYPE_ASF = 2;
	
	//视频码流类型
	public final static int SDK_VIDEO_FORMAT_INVAILED = 0;
	public final static int SDK_VIDEO_FORMAT_SN4 =1;
	public final static int SDK_VIDEO_FORMAT_MPEG4 = 2;
	public final static int SDK_VIDEO_FORMAT_H261 = 3;
	public final static int SDK_VIDEO_FORMAT_H263 = 4;
	public final static int SDK_VIDEO_FORMAT_H264 = 5;
	
	//视频码流解决方案
	public final static int SDK_VIDEO_RESOLUTION_VR_INVAILED = 0;
	public final static int SDK_VIDEO_RESOLUTION_VR_AUTO =1;
	public final static int SDK_VIDEO_RESOLUTION_VR_QCIF = 2;
	public final static int SDK_VIDEO_RESOLUTION_VR_CIF = 4;
	public final static int SDK_VIDEO_RESOLUTION_VR_2CIF = 8;
	public final static int SDK_VIDEO_RESOLUTION_VR_4CIF = 16;
	public final static int SDK_VIDEO_RESOLUTION_VR_QQCIF = 32;
	public final static int SDK_VIDEO_RESOLUTION_VR_QVGA = 64;
	public final static int SDK_VIDEO_RESOLUTION_VR_VGA = 128;
	public final static int SDK_VIDEO_RESOLUTION_VR_720P = 256;
	public final static int SDK_VIDEO_RESOLUTION_VR_1080P = 512;
	public final static int SDK_VIDEO_RESOLUTION_VR_QXGA = 1024;
	
	//视频质量等级
	public final static int SDK_VIDEO_QUALITY_INVAILED  = 0;
	public final static int SDK_VIDEO_QUALITY_NOMAL  	= 1;
	public final static int SDK_VIDEO_QUALITY_SPEED     = 2;
	
	// 客户端类型
	public final static String SDK_CLIENT_TYPE_ANDROID_PHONE = "ANDROID_PHONE";
	public final static String SDK_CLIENT_TYPE_ANDROID_PAD = "ANDROID_PAD";
	public final static String SDK_CLIENT_TYPE_IOS_PHONE = "IOS_PHONE";
	public final static String SDK_CLIENT_TYPE_IOS_PAD = "IOS_PAD";
	public final static String SDK_CLIENT_TYPE_LINUX_CLIENT = "LINUX_CLIENT";
	public final static String SDK_CLIENT_TYPE_LINUX_SERVER = "LINUX_SERVER";
	public final static String SDK_CLIENT_TYPE_WIN_CLIENT = "WIN_CLIENT";
	public final static String SDK_CLIENT_TYPE_WIN_JNI_CLIENT = "WIN_JNI_CLIENT";
	public final static String SDK_CLIENT_TYPE_WIN_JNI_SERVER = "WIN_JNI_SERVER";

	//SDK回调事件类型
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_LOGIN = 1;					//登陆事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_LOGOUT = 2;					//注销事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_GETGROUP = 3;		  		//获取设备组事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_GETDEVICE = 4;				//获取设备事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_STARTSTREAM = 5;			//请求码流播放（包括实时码流浏览和录像浏览）是否成功事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_RECVKEYFRAME = 6;			//SDK收到码流关键帧回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_STOPSTREAM = 7;				//停止码流播放事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_PTZ = 8;					//ptz操作时间回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SUBSCRIPT = 9;				//消息订阅事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_LOCALREC = 10;				//本地录像事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SNAPSHOT = 11;				//本地抓拍事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SEARCHREC = 12;		    	//搜索录像事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_STARTPLAYREC = 13;			//请求录像播放事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_STOPPLAYREC = 14;			//请求录像停止播放事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_VCRCTRL = 15;				//录像回放VCR操作结果事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_HeartbeatErr = 16;			//与平台心跳检测失败事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SEARCHDVC = 17;				//SDK搜索设备事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_RECORD_DOWNLOAD = 18;		//请求录像下载时件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_RECORD_DOWNLOAD_PACE = 19;	//录像下载进度事件回调
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SYNCTIME = 20; 				// 两个保留参数组成64位UTC时间，m_dwReserve1为低32位，m_dwReserve2为高32位，一般只用到低32位
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_DECSTYLECHANGED = 21;		// m_dwReserve1为发生变化的解码器风格指针
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_CHANGEPASSWORD = 22;
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_SEARCHRESULT=23;			//多视图设备树的搜索结果回调, m_dwReserve1表示成功或失败的bool类型,true表示搜索完成,false表示发生了错误
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_MVCPLAYDISCONNECTED=24;	//MVC的某一路播放断链了事件通知，m_dwWorkID 表示播放ID,errorcode=MCU_PLAYER_ERR_DEVICES_OFFLINE，其他参数保留
	public final static int SDK_EVENT_CALLBACK_WORKTYPE_UNKNOWN = 255;				//非法类型的事件回调

	// SDK错误码
	public final static int SDK_ERRCODE_MODUAL_INVALID = 60001;		// 无效模块
	public final static int SDK_ERRCODE_TASK_INVALID = 60002;		// 无效任务
	public final static int SDK_ERRCODE_TASK_CREATE_ERROR = 60003;// 创建任务失败
	public final static int SDK_ERRCODE_INPUT_ERROR = 60004;// 输入错误
	public final static int SDK_ERRCODE_GET_DATA_ERROR = 60005;// 获取数据错误
	public final static int SDK_ERRCODE_NET_ERROR = 60006;// 网络错误
	public final static int SDK_ERRCODE_SNAPSHOT_ERROR = 60007;	//抓拍图片失败
	public final static int SDK_ERRCODE_DGROUP_ROOT_INFO_ERROR = 60008; //获取根目录下的设备信息出错
	// 码流播放的同步错误码
	public final static int SDK_ERRCODE_PLAYER_ERR_MVC_CONNECT_MVS_FAILED = 10120;//MVC连接MVS时TCP链路建链失败
	public final static int SDK_ERRCODE_PLAYER_ERR_STREAM_GET_IDLE_STREAM = 61000;//传输模块分配空闲失败
	public final static int SDK_ERRCODE_PLAYER_ERR_DECODER_GET_IDLE_DECODER = 61001;//解码模块分配空闲失败
	public final static int SDK_ERRCODE_PLAYER_ERR_DECODER_CREATE = 61002;//解码器创建失败
	public final static int SDK_ERRCODE_PLAYER_ERR_DECODER_START_PLAY_STREAM = 61003;//启动解码模块失败
	public final static int SDK_ERRCODE_PLAYER_ERR_DECODER_START_PLAY_WND = 61004;//显示模块初始化失败
	public final static int SDK_ERRCODE_PLAYER_ERR_CONVERT_GB_DEVICED_ID = 61005;//devicedID转国标ID失败
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_INIT_FAIL = 61006;//G900模块初始化失败
	public final static int SDK_ERRCODE_PLAYER_ERR_FROM_G900_GET_URL = 61007;//从G900获取URL失败
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_START_REQ_FAIL = 61008;//g900模块发送浏览请求失败
	public final static int SDK_ERRCODE_MCU_PLAYER_ERR_DEVICES_OFFLINE = 61009;//设备不在线
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_URL_NOT_SUPPORT_ALL = 61010;//g900模块发送浏览请求失败
	// 视频码流播放的异步错误码
	public final static int SDK_ERRCODE_PLAYER_ERR_NO_KEY_FRAME_COME = 61100;//码流关键桢没有过来
	public final static int SDK_ERRCODE_PLAYER_ERR_CONNECT_MVC_FAIL = 61102;//mvc连接mvs失败
	public final static int SDK_ERRCODE_PLAYER_ERR_DISCONNECT_MVC_NTF = 61105;//收到mvs断链通知
	public final static int SDK_ERRCODE_PLAYER_ERR_CONNECT_MVC_TIMEOUT = 61106;//mvc连接mvs超时
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_ERR_FAIL = 61901;//G900错误
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_ERR_UNINIT = 61902;//G900未初始化
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_ERR_UNCONNECT = 61903;//未连接G900
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_ERR_PARAM = 61904;//G900 参数错误
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_ERR_INVALID_PLAYEID = 61905;//G900 playid无效
	public final static int SDK_ERRCODE_PLAYER_ERR_G900_TIMEOUT = 61906;//G900 请求超时
	// 录像查询错误码
	public final static int SDK_ERRCODE_QUERY_RECORD_THREAD_NOT_NULL = 62000;//查询录像文件线程已存在
	public final static int SDK_ERRCODE_QUERY_RECORD_TASKID_NOT_EXITS = 62001;//查询平台录像的taskID不存在
	public final static int SDK_ERRCODE_QUERY_RECORD_MANAGER_NULL = 62002;//查询平台录像时数据管理模块为NULL
	public final static int SDK_ERRCODE_QUERY_RECORD_MANAGER_GET_DATA_NULL = 62003;//查询平台录像时数据管理模块获取数据为NULL
	public final static int SDK_ERRCODE_QUERY_RECORD_QUERY_REQ_FAILED = 62004;//查询平台录像出现错误
	public final static int SDK_ERRCODE_QUERY_RECORD_QUERY_RSP_FAILED = 62005;//查询平台录像返回结果出现错误
	public final static int SDK_ERRCODE_QUERY_RECORD_QUERY_NUM_ZERO = 62006;//从平台20获取的录像文件个数为0
	public final static int SDK_ERRCODE_RECORD_SEEK_TIME_OUT_RANG = 62007;//vcr操作时seektime时间跨文件
	public final static int SDK_ERRCODE_RECORD_STOP_PLAY_NTF = 62008;//收到MVS录像回放停止通知
	public final static int SDK_ERRCODE_RECORD_TYPE_WRONG = 62009;//录像类型参数错误
	public final static int SDK_ERRCODE_RECORD_GET_DEV_CHN_WRONG = 62010;//录像回放时查询设备信息错误
	public final static int SDK_ERRCODE_RECORD_GET_TIME_RANGE = 62011;//录像回放时获取录像开始结束时间错误
	// 搜索设备的错误码
	public final static int SDK_ERRCODE_SEARCH_DVC_OK = 62100;//搜索设备正常
	public final static int SDK_ERRCODE_SERACH_DVC_THREAD_EXITS = 62101;//搜索设备线程已存在
	public final static int SDK_ERRCODE_SERACH_DVC_NO_DEVICES = 62102;//搜索设备结果不存在
	// 录像下载的错误码
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_CREATE_KEDAPLAYER_ERR = 62110;//录像下载创建kedaplayer错误
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_PLATFORM_CONNECT_FAIL = 62111;//录像下载连接平台出错
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_PLATFORM_DIRCRIPTION_NULL = 62112;//录像下载描述文件为空
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_LOCAL_DISK_FULL = 62113;//本地磁盘空空间已满
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_LOCAL_FULL_NAME_NULL = 62114;//本地保存文件名为空
	public final static int SDK_ERRCODE_RECORD_DOWNLOAD_ERR_DOWNLOAD_ERR = 62115;//录像下载网络错误
	// ocx的相关错误码
	public final static int SDK_ERRCODE_OCX_INIT_ERR = 66000;//初始化错误
	public final static int SDK_ERRCODE_OCX_WAIT_REC_OVERTIME = 66001;//录像查询等待结束标志超时
	public final static int SDK_ERRCODE_OCX_UNINIT_ERR = 66002;//反初始化错误
	//搜索类型 cusdk__SearchResultType
	 public final static int SDK_SEARCH_RESULT_DEVICEGROUP = 1;
	 public final static int SDK_SEARCH_RESULT_DEVICE = 2;
	 public final static int SDK_SEARCH_RESULT_VIDEOSRC = 3;
	 //SDK或平台能力集常量	 
	  public final static int SDK_CAPTYPE_MULTIVIEW_DEVICETREE_SEARCH = 1;//是否支持多视图设备树搜索
}
