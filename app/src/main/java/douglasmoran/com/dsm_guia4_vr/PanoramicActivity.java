package douglasmoran.com.dsm_guia4_vr;

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

    private void initPanoramaActivity() {

        panoramaView = findViewById(R.id.pano_view);

        Image panoramicImage = (Image) getIntent().getSerializableExtra("img");


        final ImageView tmpImageView = new ImageView(this);

        





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

}
