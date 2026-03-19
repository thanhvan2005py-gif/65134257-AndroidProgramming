package van.baith7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;// Khai báo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên listview
        //B1+:cần có dữ liệu
        // Từ cơ sở dữ liệu
        dsTenTinhThanhVN= new ArrayList<String>();// Tạo thể hiện cụ thể , xin mới
        //thêm dữ liệu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        //B2 Taạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
                );
        //B3 Gắn vào điều khiển hiển thị
        //3.1 tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhsachTT);
        //3.2 Gắn vào
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lý sự kiện người dùng tương tác
        //gắn bộ lắng nghe
        lvTenTinhThanh.setOnItemClickListener(BoLangNgheVaXL);
    }
    //Tạo bộ lắng nghe v xử lý sự kiện OnItemClick,vào một biến
    //vd BoLangNgheVaXL
    AdapterView.OnItemClickListener BoLangNgheVaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            //Hiện lên vị trí vừa chọn
            // Hiện giá trị
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this,strTenTinhChon,Toast.LENGTH_LONG).show();

        }
    };
}