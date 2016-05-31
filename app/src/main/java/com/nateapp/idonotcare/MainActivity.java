package com.nateapp.idonotcare;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{private ProgressBar mProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		mProgress = (ProgressBar) findViewById(R.id.mPbar);
		new CountDownTimer(25500, 500) {

			public void onTick(long millisUntilFinished) {
				mProgress.setProgress(mProgress.getProgress()+ 2);
			}

			public void onFinish() {
				setContentView(R.layout.notcare);
			}
		}.start();
    }
}
