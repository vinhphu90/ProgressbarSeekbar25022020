package com.examplevinhphutvp.progressbarseekbar25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressbar = findViewById(R.id.Progressbar);

        CountDownTimer countDownTimer = new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (mProgressbar.getProgress() >= 100 )
                    mProgressbar.setProgress(0);
                mProgressbar.setProgress(mProgressbar.getProgress() + 10);

            }


            @Override
            public void onFinish() {
                this.start();

            }
        };
        countDownTimer.start();
    }
}
