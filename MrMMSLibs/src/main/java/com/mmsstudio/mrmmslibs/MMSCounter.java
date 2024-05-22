package com.mmsstudio.mrmmslibs;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MMSCounter {


    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void Counter(long totalMillis, long intervalMillis, TextView tView) {
        CountDownTimer timer = new CountDownTimer(totalMillis, intervalMillis) {
            @Override
            public void onTick(long millisUntilFinished) {
                tView.append("\n" + millisUntilFinished);
            }

            @Override
            public void onFinish() {
                tView.append("\nFinished");
            }
        };
        timer.start();
    }
}
