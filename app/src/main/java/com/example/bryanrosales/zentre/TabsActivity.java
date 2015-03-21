package com.example.bryanrosales.zentre;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;


public class TabsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost2);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("services");
        tabSpec.setContent(R.id.linearLayout);
        tabSpec.setIndicator("Services");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Promotions");
        tabSpec.setContent(R.id.linearLayout2);
        tabSpec.setIndicator("Promotions");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("publicwall");
        tabSpec.setContent(R.id.linearLayout3);
        tabSpec.setIndicator("PublicWall");
        tabHost.addTab(tabSpec);


    }

    public void Send_Dialog_Restaurant(View view){
        Intent intent = new Intent(this, Dialog_Rest_1.class);
        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tabs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id== R.id.action_go_user_info){
            Intent intent = new Intent(this, User_Info_Activity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
