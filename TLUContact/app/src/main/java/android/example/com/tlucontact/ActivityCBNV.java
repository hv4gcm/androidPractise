package android.example.com.tlucontact;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityCBNV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbnv);

        setupList();
    }

    private void setupList() {
        CBNV[] canbo = {
                new CBNV("Nguyễn Văn A","Head","0999999999","anv@gmail.com","Công nghệ thông tin"),
                new CBNV("Nguyễn Văn B","Staff","0888888888","bnv@gmail.com","Công trình"),
                new CBNV("Nguyễn Văn C","Staff","0777777777","cnv@gmail.com","Cơ khí"),
                new CBNV("Nguyễn Văn D","Staff","0666666666","dnv@gmail.com","Hóa và Môi trường"),
        };
        RecyclerView rcvCBNV = findViewById(R.id.rcv_cb_nv);
        CBNVAdapter adapter = new CBNVAdapter(canbo);
        rcvCBNV.setAdapter(adapter);
    }
}