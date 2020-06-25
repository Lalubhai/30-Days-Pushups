package patel.krupesh.a30dayspushups;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {




    @TargetApi(Build.VERSION_CODES.KITKAT)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"grey\">" + getString(R.string.app_name) + "</font>"));

        CardView card_view = (CardView) findViewById(R.id.wallpaperButton); // creating a CardView and assigning a value.

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SixLevelActivity.class);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
               // Intent myIntent = new Intent(MainActivity.this, SQLChecklistFragmentActivity.class);
                // myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        CardView card_view2 = (CardView) findViewById(R.id.storyButton); // creating a CardView and assigning a value.

        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
                Intent myIntent = new Intent(MainActivity.this, PushUpExerciseActivity.class);
                // myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);

            }
        });
    }






}