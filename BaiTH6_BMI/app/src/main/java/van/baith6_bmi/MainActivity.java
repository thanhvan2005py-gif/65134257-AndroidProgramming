package van.baith6_bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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
    }
    public void XuLyBMI(View view){
        // Tìm và tham chiếu đến các điều khiển
        EditText editTextCanNang = findViewById(R.id.edtCanNang);
        EditText editTextChieuCao = findViewById(R.id.edtChieuCao);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        // Lấy dữ liệu
        String strCanNang = editTextCanNang.getText().toString();
        String strChieuCao = editTextChieuCao.getText().toString();

        // Chuyển sang số
        float canNang = Float.parseFloat(strCanNang);
        float chieuCao = Float.parseFloat(strChieuCao);

        // Nếu nhập cm thì đổi sang mét
        chieuCao = chieuCao / 100;

        // Tính BMI
        float bmi = canNang / (chieuCao * chieuCao);

        // Đổi sang String
        String strBMI = String.valueOf(bmi);

        // Hiển thị kết quả
        editTextKetQua.setText(strBMI);
}
}