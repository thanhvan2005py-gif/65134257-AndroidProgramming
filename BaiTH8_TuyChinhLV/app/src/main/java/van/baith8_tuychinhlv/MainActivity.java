package van.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tìm listview
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        //Chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();

        dsMonAn.add(new MonAn("Cơm Tấm Sườn",25000,"Mô tả  đây",R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm Sườn Trứng",27000,"Mô tả  đây",R.drawable.cstrung));
        dsMonAn.add(new MonAn("Gà Xối mở",30000,"Mô tả  đây",R.drawable.cg));
        dsMonAn.add(new MonAn("Sườn Bì Chả",32000,"Mô tả  đây",R.drawable.sbc));
        dsMonAn.add(new MonAn("Cơm Tấm Đặc Biệt",35000,"Mô tả  đây",R.drawable.db));
        //
        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        //Bắt xử lý sự kien
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //lấy phần tử đươc chọn\
                MonAn monAnChon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}