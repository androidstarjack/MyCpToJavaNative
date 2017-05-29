package jni.yyh.com.mycptojavanative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Method;
import java.util.HashMap;

import jni.yyh.com.mycptojavanative.jni.ServiceProvider;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("serviceData");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
           Class service =  getClassLoader().loadClass("jni.yyh.com.mycptojavanative.jni.ServiceProvider");
            Method method = service.getMethod("methodInJavaSource",new Class []{});
            method.invoke(service.newInstance(),new  Object[]{});
            //调用其方法

        } catch (Exception e) {
            e.printStackTrace();
        }

        findViewById(R.id.btn_onclick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceProvider serviceProvider = new ServiceProvider();
                serviceProvider.callFromCMethod();
            }
        });
    }
}
