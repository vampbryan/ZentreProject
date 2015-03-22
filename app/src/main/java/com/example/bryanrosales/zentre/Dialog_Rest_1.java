package com.example.bryanrosales.zentre;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.app.AlertDialog;


public class Dialog_Rest_1 extends ActionBarActivity {

    int cont1=0, cont2=0, cont3=0,cont4=0;
    int total=0,total1=0, total2, total3, total4;
    int precio1=10;
    int precio2=20;
    int precio3=30;
    int precio4=40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog__rest_1);
        setTitle("PIZZA HUT");


    }

    public void sumar1(View view)
    {
        cont1++;
        TextView tv_cont1 = (TextView)findViewById(R.id.tv_contt1);
        tv_cont1.setText(String.valueOf(cont1));
    }

    public void restar1(View view)
    {
        cont1--;
        TextView tv_cont1 = (TextView)findViewById(R.id.tv_contt1);
        tv_cont1.setText(String.valueOf(cont1));
    }

    public void sumar2(View view)
    {
        cont2++;
        TextView tv_cont2 = (TextView)findViewById(R.id.tv_contt2);
        tv_cont2.setText(String.valueOf(cont2));
    }

    public void restar2(View view)
    {
        cont2--;
        TextView tv_cont2 = (TextView)findViewById(R.id.tv_contt2);
        tv_cont2.setText(String.valueOf(cont2));
    }

    public void sumar3(View view)
    {
        cont3++;
        TextView tv_cont3 = (TextView)findViewById(R.id.tv_contt3);
        tv_cont3.setText(String.valueOf(cont3));
    }

    public void restar3(View view)
    {
        cont3--;
        TextView tv_cont3 = (TextView)findViewById(R.id.tv_contt3);
        tv_cont3.setText(String.valueOf(cont3));
    }

    public void sumar4(View view)
    {
        cont4++;
        TextView tv_cont4 = (TextView)findViewById(R.id.tv_contt4);
        tv_cont4.setText(String.valueOf(cont4));
    }

    public void restar4(View view)
    {
        cont4--;
        TextView tv_cont4 = (TextView)findViewById(R.id.tv_contt4);
        tv_cont4.setText(String.valueOf(cont4));
    }

    public void total(View view)
    {
        total1=cont1*precio1;
        total2=cont2*precio2;
        total3=cont3*precio3;
        total4=cont4*precio4;
        total=total1+total2+total3+total4;



        new AlertDialog.Builder(this)
            .setTitle("You Sure?")
            .setMessage("Total:"+total)
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // continue with delete
                }
            })
            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // do nothing
                }
            })
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dialog__rest_1, menu);
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

        return super.onOptionsItemSelected(item);
    }



}
