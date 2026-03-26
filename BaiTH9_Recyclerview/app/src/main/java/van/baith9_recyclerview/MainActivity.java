package van.baith9_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape>recyclerViewData;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //
        recyclerViewData= getDataForrecyclerView();
    //
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
    // chieu doc
        // RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
       // recyclerViewLandScape.setLayoutManager(layoutLinear);
    // thay doi theo chieu ngang
        // RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        // recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);
    //thay doi theo grid
        RecyclerView.LayoutManager layouGrid = new GridLayoutManager(this,2);
         recyclerViewLandScape.setLayoutManager(layouGrid);
    //
        landScapeAdapter = new LandScapeAdapter(this,recyclerViewData);
    //
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape>getDataForrecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flaghanoi","Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("eiffel","Tháp Eiffel"));
        dsDuLieu.add(new LandScape("buckingham","Cung điện Buckingham"));
        dsDuLieu.add(new LandScape("nhatrang","Nha Trang"));
        return dsDuLieu;
    }
}