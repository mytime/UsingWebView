package com.hello.usingwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    //声明一个WebView
    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //查找控件
        wv = (WebView) findViewById(R.id.wv);
        //WebView加载数据
        wv.loadUrl("http://wwww.jikexueyuan.com");
    }
}
