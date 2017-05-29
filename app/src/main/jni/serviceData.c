#include <stdio.h>
#include"jni_yyh_com_mycptojavanative_jni_ServiceProvider.h"
#include <android/log.h>
#include"jni.h"
#define LOG_TAG "System.out.c"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

//java中调用c代码，直接调用native方法即可。
JNIEXPORT void  Java_jni_yyh_com_mycptojavanative_jni_ServiceProvider_callFromCMethod(JNIEnv * env, jobject obj){
    char * pageName = "jni/yyh/com/mycptojavanative/jni/ServiceProvider";
  //第一步，首先找到Java 中的class对象
  jclass clzz = (*env)->FindClass(env,pageName);
  //第二步，找到class里面的一个方法
  jmethodID methodid = (*env)->GetMethodID(env,clzz,"methodInJavaSource","()V");
    int ss = 0;
    LOGD("pagename=%d");
    LOGI("pagename=%s",pageName);
  //第三步调用clas里面的一个方法
  (*env)->CallVoidMethod(env,obj,methodid);

}
