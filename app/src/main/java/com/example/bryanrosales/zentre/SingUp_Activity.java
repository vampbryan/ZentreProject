package com.example.bryanrosales.zentre;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SingUp_Activity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up_);
    }

    public void Send_LogInForm(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
