package com.example.administrator.densitytest;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Create by ZhangKan on 2018/6/20
 * 用于存放整个应用所需的各种变量
 */
public class ApplicationUtil extends Application {
    public static final String TAG = "ApplicationUtil";
//    VoiceAssistantContext voiceAssistantContext;
    private static ApplicationUtil applicationUtil;
    private static String BAIDU_ID = "11499685";
    private static String BAIDU_KEY = "BdaBPAukjGXwAG4zfOxGETOW";
    private static String BAIDU_SECRET_KEY = "S9HPumQGGSX5DvOyxbs3MpzdRwZ69gIm";
    //baidu unit sk ak配置
    public static String BAIDU_UNIT_AK = "XvcjpathGR9dKcToqEVnMoHV";
    public static String BAIDU_UNIT_SK = "TXOj37UZI4CqAInSd5Gk6PKoHbK5RolA";
//    private WakeupManager wakeupManager;

    public static String currentCity = null;
    private static Context context;

    //用于获取系统上下文,hello
    public static ApplicationUtil getInstance() {
        Log.d(TAG, "获取上下文");
        return applicationUtil;
    }

    public static String getBaiduID(){
        return BAIDU_ID;
    }

    public static String getBaiduKey(){
        return BAIDU_KEY;
    }

    public static String getBaiduSecretKey(){
        return BAIDU_SECRET_KEY;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        applicationUtil = this;
        // TODO: 2018/6/28 以后应该从用户数据库中读取默认城市信息
        currentCity = "南京";
        Log.d(TAG, "进程启动");
//        startVoiceAssistant();
        Intent service = new Intent(this, MainActivity.class);
        this.startService(service);
    }

    /**
     * 启动上下文
     */
//    private void startVoiceAssistant(){
//        voiceAssistantContext = VoiceAssistantContext.getInstance();
//    }
//
//    public static void initLockActivity(){
//        Intent intent = new Intent();
//        intent.setClass(ApplicationUtil.getInstance(), WakeActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        ApplicationUtil.getInstance().startActivity(intent);
//    }

    public static Context getContext() {
        return context;
    }
}