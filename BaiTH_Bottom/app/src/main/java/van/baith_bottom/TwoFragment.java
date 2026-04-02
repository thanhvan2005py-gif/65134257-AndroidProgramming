package van.baith_bottom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TwoFragment extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;


    // TODO: Rename and change types and number of parameters
    public static TwoFragment newInstance(String param1, String param2) {
        TwoFragment fragment = new TwoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Khởi tạo dữ liệu

        list = new ArrayList<LandScape>();
        list.add (new LandScape("flaghanoi","Cột cờ Hà Nội"));
        list.add(new LandScape("eiffel","Tháp Eiffel"));
        list.add(new LandScape("buckingham","Cung điện Buckingham"));
        list.add(new LandScape("nhatrang","Nha Trang"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_two, container, false);

        recyclerViewLandScape = view.findViewById(R.id.recyclerViewCau2);
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