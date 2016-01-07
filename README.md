# UsingWebView
WebView使用演示

1、布局文件添加WebView控件
  <WebView
        android:id="@+id/wv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"></WebView>
        
2、在类中声明并查找WebView控件
        //声明一个WebView
        private WebView wv;
    
        //查找控件
        wv = (WebView) findViewById(R.id.wv);
        //WebView加载数据
        wv.loadUrl("http://wwww.jikexueyuan.com");

2、配置网络访问权限
    <!--网络访问权限-->
    <uses-permission android:name="android.permission.INTERNET"/>
