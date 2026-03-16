package van.baith5_xulysukien1;

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
    void TimDieuKhien(){
        editTextSo1 =(EditText)findViewById(R.id.edtSo1);
        editTextSo2 =(EditText)findViewById(R.id.edtSo2);
        editTextKQ =(EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById((R.id.btnCong));
        nutTru = (Button) findViewById((R.id.btnTru));
        nutNhan = (Button) findViewById((R.id.btnNhan));
        nutChia = (Button) findViewById((R.id.btnChia));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //gắn bộ lắng nghe sự kện và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gọi hàm xử lý cộng
                XULY_CONG();

            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gọi hàm xử lý 
                XULY_TRU();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm xử lý nhân
                XULY_NHAN();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gọi hàm chia
                XULY_CHIA();
            }
        });
    }

    void XULY_CONG(){
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
    void XULY_TRU(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA - soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);

    }
    void XULY_NHAN(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA * soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA / soB;
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }

}