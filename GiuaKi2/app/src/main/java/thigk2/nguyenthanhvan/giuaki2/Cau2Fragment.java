package thigk2.nguyenthanhvan.giuaki2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cau2Fragment extends Fragment {
    ArrayList<String> dsTinh;// Khai báo

    public Cau2Fragment() {
        // Required empty public constructor
    }


    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);
        dsTinh= new ArrayList<String>();// Tạo thể hiện cụ thể , xin mới
        //thêm dữ liệu
        dsTinh.add("Nguyễn Thành Văn");
        dsTinh.add("Hà Nội");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");
        dsTinh.add("Thành Phố HCM");


        ArrayAdapter<String> adapterMonAn;
        adapterMonAn = new ArrayAdapter<>(getContext(),
                R.layout.item_center,
                R.id.tvItem,
                dsTinh
        );
        ListView lvTenMonAn = view.findViewById(R.id.lvDanhSachTinh);
        lvTenMonAn.setAdapter(adapterMonAn);
        lvTenMonAn.setOnItemClickListener(BoLangNgheVaXL);
        return view;
    }
    AdapterView.OnItemClickListener BoLangNgheVaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            String strTenTinh = dsTinh.get(i);
           Toast.makeText(getContext(), strTenTinh, Toast.LENGTH_SHORT).show();

        }
    };
}