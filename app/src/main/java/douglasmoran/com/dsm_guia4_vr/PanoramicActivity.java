package douglasmoran.com.dsm_guia4_vr;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class PanoramicActivity extends AppCompatActivity {

    private VrPanoramaView.Options panoOptions = new VrPanoramaView.Options();

    private VrPanoramaView panoramaView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panoramic);

        initPanoramaActivity();

    }

    @Override
    protected void onPause() {
        panoramaView.pauseRendering();
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        panoramaView.resumeRendering();

    }

    @Override
    protected void onDestroy() {
        panoramaView.shutdown();
        super.onDestroy();

    }

    private void initPanoramaActivity() {

        panoramaView = findViewById(R.id.pano_view);

        Images panoImages = (Images) getIntent().getSerializableExtra("images");


        final ImageView tmpImageView = new ImageView(this);

        tmpImageView.setImageResource(panoImages.getImg());
        Bitmap bitmap = ((BitmapDrawable)tmpImageView.getDrawable()).getBitmap();
        panoramaView.loadImageFromBitmap(bitmap,panoOptions);
        panoOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        PackageManager packageManager = getPackageManager();
        boolean gzroExist = packageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_GYROSCOPE);



        if (!gzroExist){
            panoramaView.setPureTouchTracking(true);
        }
    }
}
