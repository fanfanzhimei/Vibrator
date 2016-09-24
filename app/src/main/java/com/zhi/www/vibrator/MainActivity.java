package com.zhi.www.vibrator;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;

// 振动器： 当手指按下屏幕时节奏震动一次，离开屏幕时震动2秒
public class MainActivity extends Activity {

    Vibrator vibrator;
    long[] frequency = new long[]{1000, 50, 1000, 50};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) this.getSystemService(this.VIBRATOR_SERVICE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == event.ACTION_DOWN){
            vibrator.vibrate(frequency, -1);
        }
        if(event.getAction() == event.ACTION_UP){
            vibrator.vibrate(2000);
        }
        return false;
    }
}