package com.example.com.fpoly.android.test.robotium.target;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class SimpleActivity extends ActionBarActivity {

	Button btnsecound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        btnsecound=(Button)findViewById(R.id.GO);
        Intent go_secound_intent = new Intent(SimpleActivity.this,Secound_activity.class);
        startActivity(go_secound_intent);
    }



    
}
