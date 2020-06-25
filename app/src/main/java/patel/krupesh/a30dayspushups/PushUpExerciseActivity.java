package patel.krupesh.a30dayspushups;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PushUpExerciseActivity extends Activity {

    // Array of strings...
    String[] mobileArray = {"Box Push Up","Decline Push Up","Diamond Push Up","Hindu Push Up",
            "Incline Push Up","Opposite Arm & Leg Raise Press Ups","Plank Push Up",
            "Push Up With Side Rotations","Side to Side Push Up","Spider Mans Push Up",
            "Staggered Push Up","Traditional Push Up","V Push Up","Wall Push Up","Wide Arm Push Up"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_pushups_var);
        setContentView(R.layout.activity_pushups_var);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listitem, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> l, View v, int position, long id) {
                // Create details fragment based on clicked item's position
            /*    TwoFragment details = new TwoFragment();
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, details)
                        .addToBackStack(null)
                        .commit();  */

                Intent intent = new Intent(PushUpExerciseActivity.this, EachPushUpActivity.class);
                intent.putExtra("loadsPosition",position);
                startActivity(intent);

                EachPushUpActivity.setPosition(position+1);

            }
        });

    }





}
