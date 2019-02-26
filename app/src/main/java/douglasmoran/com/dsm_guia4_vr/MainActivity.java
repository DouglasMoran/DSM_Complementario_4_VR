package douglasmoran.com.dsm_guia4_vr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewimagenes();

    }

    private void recyclerViewimagenes() {

        List<Images> images = new ArrayList<>();
        images.add(new Images(1,R.drawable.img1));
        images.add(new Images(2,R.drawable.img2));
        images.add(new Images(3,R.drawable.img3));
        images.add(new Images(4,R.drawable.img4));
        images.add(new Images(5,R.drawable.img5));
        images.add(new Images(5,R.drawable.imgvruno));
        images.add(new Images(5,R.drawable.imgvrdos));
        images.add(new Images(5,R.drawable.imgvrtres));



        RecyclerView recyclerView = findViewById(R.id.recyclerImages);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ImagesAdapter(images,this));


       // recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
