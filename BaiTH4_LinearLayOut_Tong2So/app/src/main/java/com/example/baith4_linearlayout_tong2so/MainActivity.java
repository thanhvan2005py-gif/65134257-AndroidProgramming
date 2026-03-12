package com.example.baith4_linearlayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
// khai báo các đối tượng gắn với điều khiển ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
    }
    void TimDieuKhien(){
         editTextSo1 =(EditText)findViewById(R.id.edtSo1);
         editTextSo2 =(EditText)findViewById(R.id.edtSo2);
         editTextKQ =(EditText)findViewById(R.id.edtKetQua);
         nutCong = (Button) findViewById((R.id.btnCong));
        nutTru = (Button) findViewById((R.id.btnTru));
        nutNhan = (Button) findViewById((R.id.btnNhan));
        nutChia = (Button) findViewById((R.id.btnChia));
    }
    //xu ly cong
    public void XuLyCong(View v){
        //b.1 Lấy dữ liệu 2 số
        //tìm editext 1 và 2

       //Lấy dữ liệu từ 2 điều khiển trên
       String soThu1 = editTextSo1.getText().toString();
       String soThu2 = editTextSo2.getText().toString();
       //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tong = soA +soB;
        //Hiện kết quả

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }
    //xu lý trừ
    public void XuLyTru(View v){
        //b.1 Lấy dữ liệu 2 số
        //tìm editext 1 và 2

        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tong = soA - soB;
        //Hiện kết quả

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        //b.1 Lấy dữ liệu 2 số
        //tìm editext 1 và 2

        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tong = soA * soB;
        //Hiện kết quả

        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        //b.1 Lấy dữ liệu 2 số
        //tìm editext 1 và 2

        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //tính toán
        float Tong = soA / soB;
        //Hiện kết quả
        //chuẩn bị dữ liệu xuất biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }

}