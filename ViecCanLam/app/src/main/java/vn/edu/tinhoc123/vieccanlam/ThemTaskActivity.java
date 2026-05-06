package vn.edu.tinhoc123.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_task);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lấy dữ liệu
                EditText editTextName = findViewById(R.id.editTextTenCV);
                EditText editTextMessage = findViewById(R.id.editTextMesage);
                EditText editTextPrio = findViewById(R.id.editTextPrio);
                EditText editTextDate = findViewById(R.id.editTextDate);

                String tenCV = editTextName.getText().toString();
                String message = editTextMessage.getText().toString();
                String prio = editTextPrio.getText().toString();
                String date = editTextDate.getText().toString();
                // Gói vào
                TASKS task = new TASKS(tenCV,message,prio,date);
                //Kết noi DB
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("tasks");
                String key = databaseReference.push().getKey();
                HashMap<String,Object> item = new HashMap<String,Object>();
                item.put(key,task.toFirebaseObject());
                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if(error == null){
                            finish();
                        }
                    }
                });


            }
        });

    }
}