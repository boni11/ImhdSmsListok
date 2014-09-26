package com.imhdsmslistok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class Listok extends ActionBarActivity implements View.OnClickListener{

    Button bInfo;
    Button bPosliSms;
    Button bPosliSms2;

    int mestoId;
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_info:
                Intent intent = new Intent(Listok.this, InfoListok.class);
                startActivity(intent);
                break;

            case R.id.button_posli_sms:
                Toast.makeText(getApplicationContext(), "SMS bola odoslaná", Toast.LENGTH_SHORT).show();
                //switch na mesto
                break;

            case R.id.button_posli_sms2:
                Toast.makeText(getApplicationContext(), "SMS bola odoslaná", Toast.LENGTH_SHORT).show();
                //switch na mesto
                break;
        }

    }

    public void posliSms(int buttonId){
        switch (mestoId){
            case 1:
                if (buttonId == R.id.button_posli_sms2){
                    posli("1124","");
                    //ba sms 2
                }else if(buttonId == R.id.button_posli_sms){
                    posli("1100","");
                    //ba sms 1
                }
                break;

            case 2:
                if (buttonId == R.id.button_posli_sms){
                    posli("1166","");
                    //ke sms 1
                }
                break;

            case 3:
                if (buttonId == R.id.button_posli_sms){
                    posli("1144","");
                    //po sms 1
                }
                break;

            case 4:
                if (buttonId == R.id.button_posli_sms){
                    posli("1155","");
                    //zn sms 1
                }
                break;

            case 5:
                if (buttonId == R.id.button_posli_sms2){
                    posli("1133","24");
                    //bb sms 2
                }else if(buttonId == R.id.button_posli_sms){
                    posli("1133","");
                    //bb sms 1
                }
                break;

            case 6:
                if (buttonId == R.id.button_posli_sms){
                    posli("1122","");
                    //tt sms 1
                }
                break;
        }

    }

    public void posli(String cislo, String body){
        SmsManager smsManager = SmsManager.getDefault();
        //smsManager.sendTextMessage(cislo, null, body, null, null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        Intent intent=getIntent();
        String mesto=intent.getStringExtra("mesto");

        if (mesto.equals("ba")){
            setContentView(R.layout.activity_listok_ba);
            bPosliSms2=(Button) findViewById(R.id.button_posli_sms2);
            bPosliSms2.setOnClickListener(this);
            mestoId=1;
        }else if(mesto.equals("ke")){
            setContentView(R.layout.activity_listok_ke);
            mestoId=2;
        }else if(mesto.equals("po")){
            setContentView(R.layout.activity_listok_po);
            mestoId=3;
        }else if(mesto.equals("zn")){
            setContentView(R.layout.activity_listok_zn);
            mestoId=4;
        }else if(mesto.equals("bb")){
            setContentView(R.layout.activity_listok_bb);
            bPosliSms2=(Button) findViewById(R.id.button_posli_sms2);
            bPosliSms2.setOnClickListener(this);
            mestoId=5;
        }else if(mesto.equals("tt")){
            setContentView(R.layout.activity_listok_tt);
            mestoId=6;
        }

        bInfo=(Button)findViewById(R.id.button_info);
        bPosliSms=(Button) findViewById(R.id.button_posli_sms);
        bInfo.setOnClickListener(this);
        bPosliSms.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.listok, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
