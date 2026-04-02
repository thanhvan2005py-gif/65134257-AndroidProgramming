package van.baith_bottom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class OneFragment extends Fragment {
EditText editText_Met;
EditText editText_Km;
Button btnDoi;





    public static OneFragment newInstance(String param1, String param2) {
        OneFragment fragment = new OneFragment();
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
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        //Tìm điều khiên
        editText_Met = view.findViewById(R.id.editSoMet);
        editText_Km = view.findViewById(R.id.editSoKiLoM);
        btnDoi = view.findViewById(R.id.btnDoi);
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soMet = editText_Met.getText().toString();
                String soKM = editText_Km.getText().toString();
                if(soMet.isEmpty())
                {
                    Toast.makeText(view.getContext(), "m->km", Toast.LENGTH_SHORT).show();


            }
                else
                {
                    Toast.makeText(view.getContext(), "km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}