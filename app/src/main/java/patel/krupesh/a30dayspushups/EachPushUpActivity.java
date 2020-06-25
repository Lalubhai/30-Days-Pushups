package patel.krupesh.a30dayspushups;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EachPushUpActivity extends Activity {
    private static int pos;

    public static void setPosition(int position) {
        pos = position;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_pushups_var);

     //   ImageView imageView = (ImageView) findViewById(R.id.test_image);
        TextView textView=(TextView)findViewById(R.id.text);


       if(pos==1) {
           textView.setText(R.string.box_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.boxpushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==2){
           textView.setText(R.string.decline_pushup);
      //     Glide.with(this).asGif().load(R.mipmap.declinepushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==3){
           textView.setText(R.string.diamond_pushup);
          // Glide.with(this).asGif().load(R.mipmap.diamondpushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==4){
           textView.setText(R.string.hindu_pushup);
       //    Glide.with(this).asGif().load(R.mipmap.hindu).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==5){
           textView.setText(R.string.incline_pushup);
         //  Glide.with(this).asGif().load(R.mipmap.incline).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==6){
           textView.setText(R.string.opp_arm_pushup);
         // ************************** Glide.with(this).asGif().load(R.mipmap.).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==7){
           textView.setText(R.string.plank_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.plankpushups).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       } else if(pos==8){
           textView.setText(R.string.side_rotation_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.side_rotation).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==9){
           textView.setText(R.string.side_to_side_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.sidetosidepushups).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==10){
           textView.setText(R.string.spider_mans_pushup);
         //  Glide.with(this).asGif().load(R.mipmap.spidermanpushups).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==11){
           textView.setText(R.string.staggered_pushup);
         //  Glide.with(this).asGif().load(R.mipmap.staggeredarmpushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==12){
           textView.setText(R.string.traditional_pushup);
         //  Glide.with(this).asGif().load(R.mipmap.traditionalpushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       } else if(pos==13){
           textView.setText(R.string.v_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.vpushups).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       } else if(pos==14){
           textView.setText(R.string.wall_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.wallpushup).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }
       else if(pos==15){
           textView.setText(R.string.widearm_pushup);
        //   Glide.with(this).asGif().load(R.mipmap.widepushups).apply(new RequestOptions().placeholder(R.drawable.playerr)).into(imageView);

       }








    }

}
