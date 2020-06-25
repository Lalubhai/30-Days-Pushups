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
public class Beg2Activity extends AppCompatActivity {

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


   /*     Intent i= getIntent();
        i.getStringExtra("pos");
*/
        Toast.makeText(this,pos +"",Toast.LENGTH_LONG).show();


        // Defined Array values to show in ListView
        if(pos==1) {
            values = new String[]{"8 PUSH UPS", "5 WALL PUSH UPS","4 BOX PUSH UPS"};
            dayString="Day "+""+pos+"";
        }else if(pos==2){
            values= new String[] {"10 PUSH UPS","6 WALL PUSH UPS","5 BOX PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==3){
            values= new String[] {"12 PUSH UPS","8 WALL PUSH UPS","7 BOX PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==4){
            values= new String[] {"14 PUSH UPS","10 WALL PUSH UPS","10 BOX PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==5){
            values= new String[] {"16 PUSH UPS","12 WALL PUSH UPS","12 BOX PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==6){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==7){
            values= new String[] {"20 PUSH UPS","2 PLANK PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==8){
            values= new String[] {"22 PUSH UPS","3 PLANK PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==9){
            values= new String[] {"23 PUSH UPS","4 PLANK PUSH UPS"};
            dayString="Day "+""+pos+"";
        }else if(pos==10){
            values= new String[] {"24 PUSH UPS","5 PLANK PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==11){
            values= new String[] {"25 PUSH UPS","6 PLANK PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==12){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==13){
            values= new String[] {"31 PUSH UPS","4 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==14){
            values= new String[] {"32 PUSH UPS","5 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==15){
            values= new String[] {"33 PUSH UPS","6 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==16){
            values= new String[] {"34 PUSH UPS","7 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==17){
            values= new String[] {"35 PUSH UPS","8 WIDE ARM PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==18){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==19){
            values= new String[] {"36 PUSH UPS","6 HINDU PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==20){
            values= new String[] {"37 PUSH UPS","8 HINDU PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==21){
            values= new String[] {"38 PUSH UPS","10 HINDU PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==22){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==23){
            values= new String[] {"40 PUSH UPS","5 DECLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==24){
            values= new String[] {"41 PUSH UPS","6 DECLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        } else if(pos==25){
            values= new String[] {"42 PUSH UPS","7 DECLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==26){
            values= new String[] {"43 PUSH UPS","8 DECLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==27){
            values= new String[] {"REST DAY"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==28){
            values= new String[] {"44 PUSH UPS","5 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==29){
            values= new String[] {"45 PUSH UPS","7 INCLINE PUSH UPS"};
            dayString="Day "+""+pos+"";
        }
        else if(pos==30){
            values= new String[] {"REST DAY"};
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
