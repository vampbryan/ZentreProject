package com.example.bryanrosales.zentre;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;


public class Home_Activity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("services");
        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("Services");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("promotions");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("Promotions");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("promotons");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("Promotions");
        tabHost.addTab(tabSpec);





    }



    public void Send_LogInForm(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}


