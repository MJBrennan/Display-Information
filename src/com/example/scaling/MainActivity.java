package com.example.scaling;

import com.example.scaling.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.display_txt);
		
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		

	    
	    
		tv.setText("\nDensity DPI: "+dm.densityDpi+"\nHeight: "+dm.heightPixels+" x Width : "+dm.widthPixels );
	}



}
