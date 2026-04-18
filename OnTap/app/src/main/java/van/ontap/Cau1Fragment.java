package van.ontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Cau1Fragment extends Fragment {

    EditText editTextCanNang, editTextChieuCao, editTextKetQua;
    Button nutBMI;
    void TimDieuKhien(View view){
        editTextCanNang = view.findViewById(R.id.edtCanNang);
        editTextChieuCao = view.findViewById(R.id.edtChieuCao);
        editTextKetQua= view.findViewById(R.id.edtKetQua);
        nutBMI= view.findViewById(R.id.btnBMI);
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
        nutBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi hàm xử lý tính BMI
                XULY_BMI();
            }
        });
        return view;
    }
    void XULY_BMI(){

        String strCanNang = editTextCanNang.getText().toString();
        String strChieuCao = editTextChieuCao.getText().toString();

        float canNang = Float.parseFloat(strCanNang);
        float chieuCao = Float.parseFloat(strChieuCao);

        if (chieuCao > 3) { // Giả sử nếu nhập > 3 thì người dùng đang nhập cm
            chieuCao = chieuCao / 100;
        }

        float bmi = canNang / (chieuCao * chieuCao);

        String phanLoai = "";
        if (bmi < 18.5) phanLoai = " (Gầy)";
        else if (bmi < 25) phanLoai = " (Bình thường)";
        else if (bmi < 30) phanLoai = " (Béo phì độ 1)";
        else phanLoai = " (Béo phì nặng)";

        String chuoiKQ = String.format("%.2f", bmi) + phanLoai;
        editTextKetQua.setText(chuoiKQ);
    }
}