package com.example.com.fpoly.android.test.robotium.target;

import android.R.array;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Secound_activity extends Activity{
	ListView LV;
	String arr[]=new String[]{"android","window phone", "iphone"};
	ArrayAdapter<String> AA;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		LV= (ListView)findViewById(R.id.LV);
		AA = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1,arr);
		LV.setAdapter(AA);
		
	}
}
