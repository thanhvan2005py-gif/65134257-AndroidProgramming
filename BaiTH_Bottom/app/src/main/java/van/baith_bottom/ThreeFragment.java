package van.baith_bottom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThreeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThreeFragment extends Fragment {

    ListView lvDSMonAn;
    ArrayList<MonAn> dsMonAn;
    public static ThreeFragment newInstance(String param1, String param2) {
        ThreeFragment fragment = new ThreeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Chuẩn bị dữ liệu
        dsMonAn = new ArrayList<MonAn>();

        dsMonAn.add(new MonAn("Cơm Tấm Sườn",25000,"Mô tả  đây",R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm Sườn Trứng",27000,"Mô tả  đây",R.drawable.cstrung));
        dsMonAn.add(new MonAn("Gà Xối mở",30000,"Mô tả  đây",R.drawable.cg));
        dsMonAn.add(new MonAn("Sườn Bì Chả",32000,"Mô tả  đây",R.drawable.sbc));
        dsMonAn.add(new MonAn("Cơm Tấm Đặc Biệt",35000,"Mô tả  đây",R.drawable.db));
        //

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_three, container, false);

        lvDSMonAn = view.findViewById(R.id.lvDSMonAn);

        MonAnAdapter adapter = new MonAnAdapter(getContext(), dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        return view;

    }
}