package van.testgiuaki;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Cau4Fragment extends Fragment {

    EditText editTextMon1;
    EditText editTextMon2;
    EditText editTextMon3;
    EditText editTextKQ;
    Button nutTinh;
    void TimDieuKhien(View view){
        editTextMon1 =view.findViewById(R.id.edtMon1);
        editTextMon2 =view.findViewById(R.id.edtMon2);
        editTextMon3 =view.findViewById(R.id.edtMon3);
        editTextKQ =view.findViewById(R.id.edtKetQua);
        nutTinh = view.findViewById((R.id.btnDTB));
    }


    public Cau4Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Cau4Fragment newInstance(String param1, String param2) {
        Cau4Fragment fragment = new Cau4Fragment();
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
        View view = inflater.inflate(R.layout.fragment_cau4, container, false);
        TimDieuKhien(view);

        nutTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_TINH_DIEM();
            }
        });

        return view;
    }
    void XULY_TINH_DIEM(){
        String mon1 = editTextMon1.getText().toString();
        String mon2 = editTextMon2.getText().toString();
        String mon3 = editTextMon3.getText().toString();

            float m1 = Float.parseFloat(mon1);
            float m2 = Float.parseFloat(mon2);
            float m3 = Float.parseFloat(mon3);

            float dtb = (m1 + m2 + m3) / 3;

            // làm tròn
            dtb = Math.round(dtb * 100) / 100f;

            String xepLoai;

            if(dtb >= 8){
                xepLoai = "Giỏi";
            } else if(dtb >= 6.5){
                xepLoai = "Khá";
            } else if(dtb >= 5){
                xepLoai = "Trung bình";
            } else {
                xepLoai = "Yếu";
            }

            editTextKQ.setText("ĐTB: " + dtb + " - " + xepLoai);

        }
    }