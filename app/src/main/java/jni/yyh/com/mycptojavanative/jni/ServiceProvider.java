package jni.yyh.com.mycptojavanative.jni;

import jni.yyh.com.mycptojavanative.MyApplication;
import jni.yyh.com.mycptojavanative.utils.GetToast;
import jni.yyh.com.mycptojavanative.utils.LogUtil;

/**
 * Created by Administrator on 2017/5/24 0024.
 */

public class ServiceProvider {

    public  void methodInJavaSource(){
        System.out.print("-------->我来了");
        LogUtil.e("yuyahao","-------->我来了");
        for (int i = 0; i < 20; i++) {
            GetToast.useString(MyApplication.getInstance(),"C代码来调用我啦啦啦..."+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 调用C代码，让C代码再次调用Java代码
     */
    public native void callFromCMethod();
}
