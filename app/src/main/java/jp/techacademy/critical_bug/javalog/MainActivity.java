package jp.techacademy.critical_bug.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human a = new Human("桃太郎", 20, "桃");
        a.say();
        a.think();
        Human b = new Human("余市", 30, "お酒");
        b.say();
        b.think();
    }
}
