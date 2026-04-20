package thigk2.nguyenthanhvan.giuaki2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;
    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandScape>();
        list.add (new LandScape("flaghanoi","Tỉnh Hà Nội","Địa điểm"));
        list.add(new LandScape("eiffel","Tỉnh Nha Trang","Địa điểm"));
        list.add(new LandScape("buckingham","Phú Yên","Địa điểm"));
        list.add(new LandScape("nhatrang","Nha Trang","Địa điểm"));
        list.add(new LandScape("haugiang","Hậu Giang","Địa điểm"));
        list.add(new LandScape("nhatrang","So Trăng","Địa điểm"));
        list.add(new LandScape("nhatrang","Nha Trang","Địa điểm"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = view.findViewById(R.id.recyclerViewCau3);
        //
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(getContext());;
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //
        LandScapeAdapter adapter = new LandScapeAdapter(view.getContext(),list);
        //gan vao recycler view
        recyclerViewLandScape.setAdapter(adapter);
        return view;
    }
}