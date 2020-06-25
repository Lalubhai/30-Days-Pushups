package patel.krupesh.a30dayspushups.Level;
//Beg1Activity


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Objects;

import patel.krupesh.a30dayspushups.R;



// X Y Z A B C
public class Adv2Activity extends AppCompatActivity {

    ListView listView ;
    private static int pos;
    private String[] values;
    private static String dayString;

    public static void setPosition(int position) {
        pos = position;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_exersice);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);


      /*  Intent i= getIntent();
        i.getStringExtra("pos");
*/
        Toast.makeText(this,pos +"",Toast.LENGTH_LONG).show();


        // Defined Array values to show in ListView

        if(pos==1) {
            values = new String[]{"120 PUSH UPS", "10 V PUSH UPS","5 DIAMOND PUSH UPS","12 PLANK PUSH UPS"};
        }else if(pos==2){
            values= new String[] {"122 PUSH UPS","12 V PUSH UPS","10 DIAMOND PUSH UPS","14 PLANK PUSH UPS"};
        }
        else if(pos==3){
            values= new String[] {"125 PUSH UPS","14 V PUSH UPS","12 DIAMOND PUSH UPS","14 PLANK PUSH UPS"};
        }
        else if(pos==4){
            values= new String[] {"127 PUSH UPS","15 V PUSH UPS","15 DIAMOND PUSH UPS","15 PLANK PUSH UPS"};
        }
        else if(pos==5){
            values= new String[] {"130 PUSH UPS","16 V PUSH UPS","18 DIAMOND PUSH UPS","18 PLANK PUSH UPS"};
        }
        else if(pos==6){
            values= new String[] {"REST DAY"};
        }
        else if(pos==7){
            values= new String[] {"132 PUSH UPS","12 SPIDERMAN PUSH UPS","10 STAGGERED PUSH UPS","10 WIDE ARM PUSH UPS","10 SIDE TO SIDE ROTATION PUSH UPS"};
        }
        else if(pos==8){
            values= new String[] {"135 PUSH UPS","13 SPIDERMAN PUSH UPS","12 STAGGERED PUSH UPS","12 WIDE ARM PUSH UPS","12 SIDE TO SIDE ROTATION PUSH UPS"};
        }
        else if(pos==9){
            values= new String[] {"137 PUSH UPS","14 SPIDERMAN PUSH UPS","14 STAGGERED PUSH UPS","14 WIDE ARM PUSH UPS","14 SIDE TO SIDE ROTATION PUSH UPS"};
        }else if(pos==10){
            values= new String[] {"139 PUSH UPS","15 SPIDERMAN PUSH UPS","15 STAGGERED PUSH UPS","15 WIDE ARM PUSH UPS","15 SIDE TO SIDE ROTATION PUSH UPS"};
        }
        else if(pos==11){
            values= new String[] {"140 PUSH UPS","8 SPIDERMAN PUSH UPS","18 STAGGERED PUSH UPS","16 WIDE ARM PUSH UPS","18 SIDE TO SIDE ROTATION PUSH UPS"};
        }
        else if(pos==12){
            values= new String[] {"REST DAY"};
        }
        else if(pos==13){
            values= new String[] {"141 PUSH UPS","14 WIDE ARM PUSH UPS","15 INCLINE PUSH UPS","10 STAGGERED PUSH UPS"};
        }
        else if(pos==14){
            values= new String[] {"143 PUSH UPS","15 INCLINE PUSH UPS","15 INCLINE PUSH UPS","14 STAGGERED PUSH UPS"};
        }
        else if(pos==15){
            values= new String[] {"145 PUSH UPS","16 WIDE ARM PUSH UPS","15 INCLINE PUSH UPS","16 STAGGERED PUSH UPS"};
        } else if(pos==16){
            values= new String[] {"147 PUSH UPS","17 INCLINE PUSH UPS","15 INCLINE PUSH UPS","18 STAGGERED PUSH UPS"};
        } else if(pos==17){
            values= new String[] {"150 PUSH UPS","18 WIDE ARM PUSH UPS","8 INCLINE PUSH UPS","20 STAGGERED PUSH UPS"};
        }
        else if(pos==18){
            values= new String[] {"REST DAY"};
        }
        else if(pos==19){
            values= new String[] {"151 PUSH UPS","10 HINDU PUSH UPS","10 DECLINE PUSH UPS","10 PUSH UPS WITH SIDE ROTATIONS"};
        } else if(pos==20){
            values= new String[] {"153 PUSH UPS","12 HINDU PUSH UPS","12 DECLINE PUSH UPS","12 PUSH UPS WITH SIDE ROTATIONS"};
        } else if(pos==21){
            values= new String[] {"154 PUSH UPS","14 HINDU PUSH UPS","14 DECLINE PUSH UPS","14 PUSH UPS WITH SIDE ROTATIONS"};
        }
        else if(pos==22){
            values= new String[] {"155 PUSH UPS","15 HINDU PUSH UPS","16 DECLINE PUSH UPS","15 PUSH UPS WITH SIDE ROTATIONS"};
        }
        else if(pos==23){
            values= new String[] {"REST DAY"};
        } else if(pos==24){
            values= new String[] {"157 PUSH UPS","10 PLANK PUSH UPS","10 INCLINE PUSH UPS","10 WIDE ARM PUSH UPS","10 DIAMOND PUSH UPS"};
        } else if(pos==25){
            values= new String[] {"158 PUSH UPS","12 PLANK PUSH UPS","12 INCLINE PUSH UPS","12 WIDE ARM PUSH UPS","12 DIAMOND PUSH UPS"};
        }
        else if(pos==26){
            values= new String[] {"160 PUSH UPS","15 PLANK PUSH UPS","15 INCLINE PUSH UPS","15 WIDE ARM PUSH UPS","15 DIAMOND PUSH UPS"};
        } else if(pos==27){
            values= new String[] {"REST DAY"};
        }
        else if(pos==28){
            values= new String[] {"162 PUSH UPS","10 SPIDERMAN PUSH UPS","9 DECLINE PUSH UPS","15 HINDU PUSH UPS","10 V PUSH UPS"};
        } else if(pos==29){
            values= new String[] {"165 PUSH UPS","12 SPIDERMAN PUSH UPS","9 DECLINE PUSH UPS","17 HINDU PUSH UPS","12 V PUSH UPS"};
        }
        else if(pos==30){
            values= new String[] {"170 PUSH UPS","15 SPIDERMAN PUSH UPS","9 DECLINE PUSH UPS","20 HINDU PUSH UPS","15 V PUSH UPS"};
        }



        dayString="Day "+""+pos+"";
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"grey\">" + dayString + "</font>"));







        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}
