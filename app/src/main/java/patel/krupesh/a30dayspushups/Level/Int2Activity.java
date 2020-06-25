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
public class Int2Activity extends AppCompatActivity {

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
            values = new String[]{"50 PUSH UPS", "5 SIDE TO SIDE PUSH UPS","4 STAGGERED PUSH UPS"};
        }else if(pos==2){
            values= new String[] {"54 PUSH UPS","7 SIDE TO SIDE PUSH UPS","5 STAGGERED PUSH UPS"};
        }
        else if(pos==3){
            values= new String[] {"58 PUSH UPS","8 SIDE TO SIDE PUSH UPS","7 STAGGERED PUSH UPS"};
        }
        else if(pos==4){
            values= new String[] {"60 PUSH UPS","4 V PUSH UPS","3 DIAMOND PUSH UPS"};
        }
        else if(pos==5){
            values= new String[] {"62 PUSH UPS","7 V PUSH UPS","5 DIAMOND PUSH UPS"};
        }
        else if(pos==6){
            values= new String[] {"REST DAY"};
        }
        else if(pos==7){
            values= new String[] {"65 PUSH UPS","10 SIDE TO SIDE PUSH UPS","7 DIAMOND PUSH UPS"};
        }
        else if(pos==8){
            values= new String[] {"68 PUSH UPS","12 SIDE TO SIDE PUSH UPS","9 DIAMOND PUSH UPS"};
        }
        else if(pos==9){
            values= new String[] {"70 PUSH UPS","14 SIDE TO SIDE PUSH UPS","10 DIAMOND PUSH UPS"};
        }else if(pos==10){
            values= new String[] {"72 PUSH UPS","15 SIDE TO SIDE PUSH UPS","12 DIAMOND PUSH UPS"};
        }
        else if(pos==11){
            values= new String[] {"74 PUSH UPS","16 SIDE TO SIDE PUSH UPS","14 DIAMOND PUSH UPS"};
        }
        else if(pos==12){
            values= new String[] {"REST DAY"};
        }
        else if(pos==13){
            values= new String[] {"76 PUSH UPS","6 SPIDER MANS PUSH UPS","5 STAGGERED PUSH UP"};
        }
        else if(pos==14){
            values= new String[] {"77 PUSH UPS","7 SPIDER MANS PUSH UPS","8 STAGGERED PUSH UP"};
        }
        else if(pos==15){
            values= new String[] {"78 PUSH UPS","8 SPIDER MANS PUSH UPS","10 STAGGERED PUSH UP"};
        } else if(pos==16){
            values= new String[] {"80 PUSH UPS","9 SPIDER MANS PUSH UPS","12 STAGGERED PUSH UP"};
        } else if(pos==17){
            values= new String[] {"82 PUSH UPS","10 SPIDER MANS PUSH UPS","15 STAGGERED PUSH UP"};
        }
        else if(pos==18){
            values= new String[] {"REST DAY"};
        }
        else if(pos==19){
            values= new String[] {"83 PUSH UPS","10 SIDE TO SIDE PUSH UPS","10 SPIDER MANS PUSH UPS","10 STAGGERED PUSH UP","10 V PUSH UPS","10 DIAMOND PUSH UPS"};
        } else if(pos==20){
            values= new String[] {"84 PUSH UPS","12 SIDE TO SIDE PUSH UPS","12 SPIDER MANS PUSH UPS","12 STAGGERED PUSH UP","12 V PUSH UPS","12 DIAMOND PUSH UPS"};
        } else if(pos==21){
            values= new String[] {"86 PUSH UPS","14 SIDE TO SIDE PUSH UPS","14 SPIDER MANS PUSH UPS","14 STAGGERED PUSH UP","14 V PUSH UPS","14 DIAMOND PUSH UPS"};
        }
        else if(pos==22){
            values= new String[] {"REST DAY"};
        }
        else if(pos==23){
            values= new String[] {"88 PUSH UPS","16 SIDE TO SIDE UPS","16 SPIDER MANS PUSH UPS","16 STAGGERED PUSH UP","16 V PUSH UPS","16 DIAMOND PUSH UPS"};
        } else if(pos==24){
            values= new String[] {"89 PUSH UPS","18 SIDE TO SIDE  UPS","18 SPIDER MANS PUSH UPS","18 STAGGERED PUSH UP","18 V PUSH UPS","18 DIAMOND PUSH UPS"};
        } else if(pos==25){
            values= new String[] {"90 PUSH UPS","20 SIDE TO SIDE  UPS","20 SPIDER MANS PUSH UPS","20 STAGGERED PUSH UP","20 V PUSH UPS","20 DIAMOND PUSH UPS"};
        }
        else if(pos==26){
            values= new String[] {"REST DAY"};
        }else if(pos==27){
            values= new String[] {"91 PUSH UPS","22 SIDE TO SIDE  UPS","22 SPIDER MANS PUSH UPS","18 STAGGERED PUSH UP"};
        }else if(pos==28){
            values= new String[] {"92 PUSH UPS","25 V PUSH UPS","25 DIAMOND PUSH UPS"};
        }else if(pos==29){
            values= new String[] {"REST DAY"};
        }
        else if(pos==30){
            values= new String[] {"95 PUSH UPS","20 SIDE TO SIDE  UPS","22 SPIDER MANS PUSH UPS","20 STAGGERED PUSH UP","15 V PUSH UPS","20 DIAMOND PUSH UPS"};
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
