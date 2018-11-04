package com.mdoery.likeclockuidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * In this example, we reproduce the "look and feel" of the "Timer" part of the "Clock" app. It
 * has a middle window-like area containing three scrolling custom widgets. It looks exactly like
 * a slot machine, so the code could be used in that kind of application as well.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
