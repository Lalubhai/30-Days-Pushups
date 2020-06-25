

//Int1Activity

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



public class Int1Activity extends AppCompatActivity {

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
            values = new String[]{"30 PUSH UPS", "5 INCLINE PUSH UPS","4 DECLINE PUSH UPS"};
        }else if(pos==2){
            values= new String[] {"32 PUSH UPS","6 INCLINE PUSH UPS","5 DECLINE PUSH UPS"};
        }
        else if(pos==3){
            values= new String[] {"35 PUSH UPS","8 INCLINE PUSH UPS","7 DECLINE PUSH UPS"};
        }
        else if(pos==4){
            values= new String[] {"38 PUSH UPS","10 INCLINE PUSH UPS","10 DECLINE PUSH UPS"};
        }
        else if(pos==5){
            values= new String[] {"REST DAY"};
        }
        else if(pos==6){
            values= new String[] {"41 PUSH UPS","2 PLANK PUSH UPS"};
        }
        else if(pos==7){
            values= new String[] {"43 PUSH UPS","2 PLANK PUSH UPS"};
        }
        else if(pos==8){
            values= new String[] {"45 PUSH UPS","3 DECLINE PUSH UPS"};
        }
        else if(pos==9){
            values= new String[] {"REST DAY"};
        }else if(pos==10){
            values= new String[] {"46 PUSH UPS","5 DECLINE PUSH UPS"};
        }
        else if(pos==11){
            values= new String[] {"47 PUSH UPS","8 PLANK PUSH UPS","8 DECLINE PUSH UPS"};
        }
        else if(pos==12){
            values= new String[] {"48 PUSH UPS"};
        }
        else if(pos==13){
            values= new String[] {"49 PUSH UPS","4 WIDE ARM PUSH UPS"};
        }
        else if(pos==14){
            values= new String[] {"50 PUSH UPS","4 INCLINE PUSH UPS"};
        }
        else if(pos==15){
            values= new String[] {"REST"};
        } else if(pos==16){
            values= new String[] {"52 PUSH UPS","6 INCLINE PUSH UPS"};
        } else if(pos==17){
            values= new String[] {"54 PUSH UPS","8 WIDE ARM PUSH UPS","8 INCLINE PUSH UPS"};
        }
        else if(pos==18){
            values= new String[] {"REST DAY"};
        }
        else if(pos==19){
            values= new String[] {"55 PUSH UPS","6 HINDU PUSH UPS","9 DECLINE PUSH UPS"};
        } else if(pos==20){
            values= new String[] {"56 PUSH UPS","8 HINDU PUSH UPS","10 DECLINE PUSH UPS"};
        } else if(pos==21){
            values= new String[] {"57 PUSH UPS"};
        }
        else if(pos==22){
            values= new String[] {"REST DAY"};
        }
        else if(pos==23){
            values= new String[] {"58 PUSH UPS","9 PLANK PUSH UPS","9 DECLINE PUSH UPS","8 HINDU PUSH UPS","8 WIDE ARM PUSH UPS"};
        } else if(pos==24){
            values= new String[] {"59 PUSH UPS","10 PLANK PUSH UPS","10 DECLINE PUSH UPS","10 HINDU PUSH UPS","10 WIDE ARM PUSH UPS"};
        } else if(pos==25){
            values= new String[] {"60 PUSH UPS","12 PLANK PUSH UPS","12 DECLINE PUSH UPS","12 HINDU PUSH UPS","12 WIDE ARM PUSH UPS"};
        }
        else if(pos==26){
            values= new String[] {"REST DAY"};
        }
        else if(pos==27){
            values= new String[] {"62 PUSH UPS","9 PLANK PUSH UPS","9 DECLINE PUSH UPS","10 INCLINE PUSH UPS" ,"10 HINDU PUSH UPS"};
        }else if(pos==28){
            values= new String[] {"63 PUSH UPS","10 PLANK PUSH UPS","10 DECLINE PUSH UPS","12 INCLINE PUSH UPS","12 HINDU PUSH UPS"};
        }
        else if(pos==29){
            values= new String[] {"64 PUSH UPS","12 PLANK PUSH UPS","12 DECLINE PUSH UPS","14 INCLINE PUSH UPS","14 HINDU PUSH UPS"};
        }
        else if(pos==30){
            values= new String[] {"65 PUSH UPS","14 PLANK PUSH UPS","15 DECLINE PUSH UPS","16 INCLINE PUSH UPS","15 HINDU PUSH UPS"};
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
