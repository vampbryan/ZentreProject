package com.example.bryanrosales.zentre;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;


public class MainActivity extends Activity

{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Send_SingUpForm(View view)
    {
        Intent intent = new Intent(this, SingUp_Activity.class);
        startActivity(intent);
    }

    public void Send_Home(View view)
    {
        Intent intent = new Intent(this, TabsActivity.class);
        startActivity(intent);
    }


}
