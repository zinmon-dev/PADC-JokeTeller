package com.example.asus.padc_ex3.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.padc_ex3.R;
import com.example.asus.padc_ex3.fragments.MainActivityFragment;

public class MainActivity extends AppCompatActivity {
    private  int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        Fragment Fragdetail = new MainActivityFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container,Fragdetail)
                .commit();

        Button btnNext = (Button) findViewById(R.id.btn_next);
        Button btnPrevious = (Button) findViewById(R.id.btn_previous);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i<2){
                    i=i+1;
                    changeContentData();
                }
                else{
                    Toast.makeText(MainActivity.this,"No Record to display", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i>0){
                    i--;
                    changeContentData();

                }
                else{
                    Toast.makeText(MainActivity.this,"No Record to display", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
    public void changeContentData(){
        TextView jokeTitle = (TextView) findViewById(R.id.tv_joke_title);
        ImageView jokeImage = (ImageView) findViewById(R.id.iv_joke_image);
        TextView jokeContent = (TextView) findViewById(R.id.tv_joke_content);
        switch (i)
        {
            case 0:
                jokeTitle.setText(R.string.joke_title_1);
                jokeImage.setImageResource(R.drawable.joke_1);
                jokeContent.setText(R.string.main_content);
                break;
            case 1:
                jokeTitle.setText(R.string.joke_title_2);
                jokeImage.setImageResource(R.drawable.joke_2);
                jokeContent.setText(R.string.main_content_2);
                break;
            default:
                jokeTitle.setText(R.string.joke_title_3);
                jokeImage.setImageResource(R.drawable.joke_3);
                jokeContent.setText(R.string.main_content_3);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
