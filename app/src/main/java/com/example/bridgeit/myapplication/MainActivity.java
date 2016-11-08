package com.example.bridgeit.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  LinearLayout lm = (LinearLayout) findViewById(R.id.linear);
      //create the layout tat will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // create four
        for(int i=0;i<=4;i++)
        {
            //create linearlayout
            LinearLayout ll =new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            //create textview
            TextView textView=new TextView(this);
            textView.setText("Hi");
            ll.addView(textView);
            //create textview
            TextView textView1=new TextView(this);
            textView1.setText("Bye");
            ll.addView(textView1);
            //create button
            final Button button =new Button(this);
            //give the id for button
            button.setId(i+1);
            button.setText("Add");
            //set the layput params on the button
            button.setLayoutParams(params);
            final int index=i;
            // set click listerner for button
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("TAG","iondex:"+index);
                    Toast.makeText(getApplicationContext(),"selected button:"+index,Toast.LENGTH_SHORT).show();
                }
            });
            //Add button to linearlayout
            ll.addView(button);
            //adding textview to the linear layout

            //Add button to linearlayout in the xml
            lm.addView(ll);
        }
    }


}
