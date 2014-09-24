package com.imhdsmslistok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class Listok extends ActionBarActivity implements View.OnClickListener{

    Button bInfo;
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Listok.this,InfoListok.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        Intent intent=getIntent();
        String mesto=intent.getStringExtra("mesto");
        Toast.makeText(getApplicationContext(),mesto,Toast.LENGTH_SHORT).show();

        if (mesto.equals("ba")){
            setContentView(R.layout.activity_listok);
        }else if(mesto.equals("ke")){
            setContentView(R.layout.activity_listok_ke);

        }

        bInfo=(Button)findViewById(R.id.button_info);
        bInfo.setOnClickListener(this);

//
//        Intent intent=getIntent();
//        String mesto=intent.getStringExtra("mesto");
//        Toast.makeText(getApplicationContext(),mesto,Toast.LENGTH_SHORT).show();

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
