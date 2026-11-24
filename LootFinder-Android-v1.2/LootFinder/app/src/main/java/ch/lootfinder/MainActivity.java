package ch.lootfinder;
import android.app.Activity;import android.os.Bundle;import android.webkit.WebView;import android.view.View;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); w.setFitsSystemWindows(true); w.getSettings().setJavaScriptEnabled(true); w.getSettings().setDomStorageEnabled(true); w.loadUrl("file:///android_asset/index.html");setContentView(w);}
}
