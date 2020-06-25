/*
Copyright 2012 Brian Romanowski. All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are
permitted provided that the following conditions are met:

   1. Redistributions of source code must retain the above copyright notice, this list of
      conditions and the following disclaimer.

   2. Redistributions in binary form must reproduce the above copyright notice, this list
      of conditions and the following disclaimer in the documentation and/or other materials
      provided with the distribution.

THIS SOFTWARE IS PROVIDED BY BRIAN ROMANOWSKI ``AS IS'' AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BRIAN ROMANOWSKI OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

The views and conclusions contained in the software and documentation are those of the
authors.
*/



package patel.krupesh.a30dayspushups;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;

import java.util.Objects;


/**
 * Main activity run by this application, serves only to start and host the {@link SQLChecklistListFragment}.
 * @author romanows
 */
public class SQLChecklistFragmentActivity extends AppCompatActivity {
    private static final String LOG_TAG = SQLChecklistFragmentActivity.class.getName();


    private static String string1;

    public static void setString1(String string) {
        string1 = string;
    }


    private static final float BLUR_RADIUS = 25f;

    public Drawable drawable;

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
     */
    @TargetApi(Build.VERSION_CODES.KITKAT)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "onCreate()");
        super.onCreate(savedInstanceState);
     //   this.setContentView(R.layout.activity_main);


        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"grey\">" + string1 + "</font>"));

        if(savedInstanceState == null) {
        	Log.d(LOG_TAG, "programatically adding fragment to activity");
			getSupportFragmentManager().beginTransaction().add(android.R.id.content, new SQLChecklistListFragment()).commit();
		}


     /*   Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                R.drawable.playerr);

        drawable = new BitmapDrawable(blur(toGrayscale(icon)));
*/
/*
        ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.background);
        layout.setBackground(drawable);

*/
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public Bitmap blur(Bitmap image) {
        if (null == image) return null;

        Bitmap outputBitmap = Bitmap.createBitmap(image);
        final RenderScript renderScript = RenderScript.create(getApplicationContext());
        Allocation tmpIn = Allocation.createFromBitmap(renderScript, image);
        Allocation tmpOut = Allocation.createFromBitmap(renderScript, outputBitmap);

//Intrinsic Gausian blur filter
        ScriptIntrinsicBlur theIntrinsic = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        theIntrinsic.setRadius(BLUR_RADIUS);
        theIntrinsic.setInput(tmpIn);
        theIntrinsic.forEach(tmpOut);
        tmpOut.copyTo(outputBitmap);
        return outputBitmap;
    }

    public Bitmap toGrayscale(Bitmap bmpOriginal)
    {
        int width, height;
        height = bmpOriginal.getHeight();
        width = bmpOriginal.getWidth();

        Bitmap bmpGrayscale = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmpGrayscale);
        Paint paint = new Paint();
        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
        paint.setColorFilter(f);

        c.drawBitmap(bmpOriginal, 0, 0, paint);

        return darkenBitMap(bmpGrayscale);
    }


    private Bitmap darkenBitMap(Bitmap bm) {

        Canvas canvas = new Canvas(bm);
        Paint p = new Paint(Color.RED);
        //ColorFilter filter = new LightingColorFilter(0xFFFFFFFF , 0x00222222); // lighten
        ColorFilter filter = new LightingColorFilter(0xFF7F7F7F, 0x00000000);    // darken
        p.setColorFilter(filter);
        canvas.drawBitmap(bm, new Matrix(), p);

        return bm;
    }


}
