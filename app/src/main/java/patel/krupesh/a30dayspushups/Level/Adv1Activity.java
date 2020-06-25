package patel.krupesh.a30dayspushups.Level;
//Beg1Activity


import android.annotation.TargetApi;
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
public class Adv1Activity extends AppCompatActivity {

    ListView listView ;
    private static int pos;
    private String[] values;
    private static String dayString;

    public static void setPosition(int position) {
        pos = position;

    }


    @TargetApi(Build.VERSION_CODES.KITKAT)
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
            values = new String[]{"91 PUSH UPS", "5 OPPOSITE ARM AND LEG RAISE PUSH UPS","4 PUSH UP WITH SIDE ROTATION"};
            dayString="Day "+""+pos+"";
        }else if(pos==2){
            values= new String[] {"92 PUSH UPS","6 OPPOSITE ARM AND LEG RAISE PUSH UPS","5 PUSH UP WITH SIDE ROTATION"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==3){
            values= new String[] {"93 PUSH UPS","8 OPPOSITE ARM AND LEG RAISE PUSH UPS","7 PUSH UP WITH SIDE ROTATION"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==4){
            values= new String[] {"94 PUSH UPS","10 OPPOSITE ARM AND LEG RAISE PUSH UPS","10 PUSH UP WITH SIDE ROTATION"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==5){
            values= new String[] {"95 PUSH UPS","12 OPPOSITE ARM AND LEG RAISE PUSH UPS","12 PUSH UP WITH SIDE ROTATION"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==6){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==7){
            values= new String[] {"96 PUSH UPS","11 DIAMOND PUSH UPS","5 V PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==8){
            values= new String[] {"97 PUSH UPS","12 DIAMOND PUSH UPS","7 V PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==9){
            values= new String[] {"98 PUSH UPS","13 DIAMOND PUSH UPS","10 V PUSH UPS"};
            dayString="Day "+""+pos+"";
        }else if(pos==10){
            values= new String[] {"99 PUSH UPS","14 DIAMOND PUSH UPS","12 V PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==11){
            values= new String[] {"100 PUSH UPS","15 DIAMOND PUSH UPS","15 V PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==12){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==13){
            values= new String[] {"101 PUSH UPS","8 WIDE ARM PUSH UPS","7 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==14){
            values= new String[] {"102 PUSH UPS","10 INCLINE PUSH UPS","9 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==15){
            values= new String[] {"103 PUSH UPS","10 WIDE ARM PUSH UPS","12 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==16){
            values= new String[] {"104 PUSH UPS","14 INCLINE PUSH UPS","11 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==17){
            values= new String[] {"105 PUSH UPS","14 WIDE ARM PUSH UPS","15 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==18){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==19){
            values= new String[] {"107 PUSH UPS","6 HINDU PUSH UPS","5 SPIDER PUSH UPS","9 DECLINE PUSH UPS"};
            dayString="Day "+""+pos+"";

        } else if(pos==20){
            values= new String[] {"108 PUSH UPS","8 HINDU PUSH UPS","10 DECLINE PUSH UPS","7 SPIDER PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==21){
            values= new String[] {"110 PUSH UPS","10 HINDU PUSH UPS","12 DECLINE PUSH UPS","9 SPIDER PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==22){
            values= new String[] {"111 PUSH UPS","12 HINDU PUSH UPS","14 INCLINE PUSH UPS","10 SPIDER PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==23){
            values= new String[] {"112 PUSH UPS","15 HINDU PUSH UPS","15 INCLINE PUSH UPS","12 SPIDER PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==24){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        } else if(pos==25){
            values= new String[] {"115 PUSH UPS","10 PLANK PUSH UPS","9 STAGGERED PUSH UPS","10 V PUSH UPS","8 DIAMOND PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if (pos==26){
            values= new String[] {"116 PUSH UPS","12 PLANK PUSH UPS","10 STAGGERED PUSH UPS","12 V PUSH UPS","10 DIAMOND PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if (pos==27){
            values= new String[] {"117 PUSH UPS","15 PLANK PUSH UPS","12 STAGGERED PUSH UPS","15 V PUSH UPS","12 DIAMOND PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if (pos==28){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if (pos==29){
            values= new String[] {"119 PUSH UPS","9 WIDE ARM PUSH UPS","9 SPIDERMAN PUSH UPS","10 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if (pos==30){
            values= new String[] {"120 PUSH UPS","15 WIDE ARM PUSH UPS","10 SPIDERMAN PUSH UPS","10 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }




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
