package jni.yyh.com.mycptojavanative;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/5/24 0024.
 */

public class MyApplication extends Application {
    private static  Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
    public static Context getInstance(){
        return  context;
    }
}
