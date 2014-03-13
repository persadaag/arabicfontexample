package com.example.arabicfontexample;

import java.io.IOException;

import com.grafian.quran.text.NativeRenderer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Spinner spinner1;
	private Button btnSubmit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// set default font type
        String name = "me_quran.ttf";
        try {
			NativeRenderer.loadFont(getAssets().open(name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        String text = "بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ";
        TextView holder = (TextView) findViewById(R.id.arabic);
        holder.setText(text);
        
		addListenerOnButton(text);
	}

	private void addListenerOnButton(String text) {
		// TODO Auto-generated method stub
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		btnSubmit = (Button) findViewById(R.id.button1);
		final String txt = text;
				
		
		btnSubmit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(MainActivity.this, String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_SHORT).show();
				String name;
				int key = (int)(spinner1.getSelectedItemId());
				
				switch (key) {
				case 0:
					name = "me_quran.ttf";
					break;
				case 1 : 
						name = "naskh.otf";						
					break;
				case 2 : 
						name = "noorehuda.ttf";
					break;
				case 3 : 
						name = "qalam.ttf";
					break;
				default:
					name = "me_quran.ttf";
					break;
				}; 
				
				
				try {
					NativeRenderer.loadFont(getAssets().open(name));
					TextView holder = (TextView) findViewById(R.id.arabic);
			        holder.setText(txt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
