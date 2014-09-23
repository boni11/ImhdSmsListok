package com.imhdsmslistok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

//    private View view;

    Button bBa,bKe,bPo,bZn,bBB,bTt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        /**
        final ImageView splashImageView = (ImageView) findViewById(R.id.image_bus_header);
        //splashImageView.setBackgroundResource(R.anim.splash);
        // We load the slide animation and apply it to the ImageView
        Animation slide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_left);
        splashImageView.startAnimation(slide);
        */

        bBa=(Button)findViewById(R.id.ba);
        bKe=(Button)findViewById(R.id.ke);
        bPo=(Button)findViewById(R.id.po);
        bZn=(Button)findViewById(R.id.zn);
        bBB=(Button)findViewById(R.id.bb);
        bTt=(Button)findViewById(R.id.tt);

        bBa.setOnClickListener(this);
        bKe.setOnClickListener(this);
        bPo.setOnClickListener(this);
        bZn.setOnClickListener(this);
        bBB.setOnClickListener(this);
        bTt.setOnClickListener(this);

        //vyberiem mesto, ulozim do pref a pokracujem, pridam aj tlacidlo keby chcel zmenit mesto
        //https://www.o2.sk/pre-vas/sluzby-a-podpora/doplnkove-sluzby/sluzby-mobilnej-zabavy/sms-listok-mhd
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ba:
                Intent intent = new Intent(MainActivity.this,Listok.class);
                intent.putExtra("mesto","ba");
                startActivity(intent);
                break;

            case R.id.ke:
                Intent intent1 = new Intent(MainActivity.this,Listok.class);
                intent1.putExtra("mesto","ke");
                startActivity(intent1);
                break;

            case R.id.po:
                Intent intent2 = new Intent(MainActivity.this,Listok.class);
                intent2.putExtra("mesto","po");
                startActivity(intent2);
                break;

            case R.id.zn:
                Intent intent3 = new Intent(MainActivity.this,Listok.class);
                intent3.putExtra("mesto","zn");
                startActivity(intent3);
                break;

            case R.id.bb:
                Intent intent4 = new Intent(MainActivity.this,Listok.class);
                intent4.putExtra("mesto","bb");
                startActivity(intent4);
                break;

            case R.id.tt:
                Intent intent5 = new Intent(MainActivity.this,Listok.class);
                intent5.putExtra("mesto","tt");
                startActivity(intent5);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
