package patel.krupesh.a30dayspushups;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class SixLevelActivity  extends AppCompatActivity {


    @TargetApi(Build.VERSION_CODES.KITKAT)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        String string1 = "Level";
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"grey\">" + string1 + "</font>"));

        Button button1= findViewById(R.id.level1);
        Button button2= findViewById(R.id.level2);
        Button button3= findViewById(R.id.level3);
        Button button4= findViewById(R.id.level4);
        Button button5= findViewById(R.id.level5);
        Button button6= findViewById(R.id.level6);


      final SQLChecklistListFragment sqlChecklistListFragment = new SQLChecklistListFragment();

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("A");
                SQLChecklistFragmentActivity.setString1("Begginer Level 1");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("B");
                SQLChecklistFragmentActivity.setString1("Begginer Level 2");
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("C");
                SQLChecklistFragmentActivity.setString1("Intermediate Level 1");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("D");
                SQLChecklistFragmentActivity.setString1("Intermediate Level 2");
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("E");
                SQLChecklistFragmentActivity.setString1("Advance Level 1");
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                Intent intent = new Intent(view.getContext(), SQLChecklistFragmentActivity.class);
                sqlChecklistListFragment.setLevel1("F");
                SQLChecklistFragmentActivity.setString1("Advance Level 2");
                startActivity(intent);
            }
        });

    }
    }
