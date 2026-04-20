package thigk2.nguyenthanhvan.giuaki2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Cau1Fragment extends Fragment {
    EditText getEditTextChieuDai, editTextChieuRong, editTextKetQua;
    Button nutChuVi, nutDienTich;
    void TimDieuKhien(View view){
        getEditTextChieuDai = view.findViewById(R.id.edtChieuDai);
        editTextChieuRong = view.findViewById(R.id.edtChieuRong);
        editTextKetQua= view.findViewById(R.id.edtKetQua);
        nutChuVi= view.findViewById(R.id.btnChuVi);
        nutDienTich= view.findViewById(R.id.btnDienTich);
    }

    public Cau1Fragment() {
        // Required empty public constructor
    }


    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau1, container, false);
        TimDieuKhien(view);
        nutChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi hàm xử lý tính BMI
                XULY_ChuVi();
            }
        });
        nutDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gọi hàm chia
                XULY_DienTich();
            }
        });
        return view;
    }
    void XULY_ChuVi(){
        //Lấy dữ liệu từ 2 điều khiển trên
        String chieuDai = getEditTextChieuDai.getText().toString();
        String chieuRong = editTextChieuRong.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(chieuDai);
        float soB = Float.parseFloat(chieuRong);
        //tính toán
        float ChuVi = (soA +soB)/2;
        //Hiện kết quả

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(ChuVi);
        //gắn kết quả lên điều khiển
        editTextKetQua.setText(chuoiKQ);
    }
    void XULY_DienTich(){
        //Lấy dữ liệu từ 2 điều khiển trên
        String chieuDai = getEditTextChieuDai.getText().toString();
        String chieuRong = editTextChieuRong.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(chieuDai);
        float soB = Float.parseFloat(chieuRong);
        //tính toán
        float DienTich = soA *soB;
        //Hiện kết quả

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(DienTich);
        //gắn kết quả lên điều khiển
        editTextKetQua.setText(chuoiKQ);
    }
}