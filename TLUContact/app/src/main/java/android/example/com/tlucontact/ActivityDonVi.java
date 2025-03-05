package android.example.com.tlucontact;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityDonVi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_vi);
        setupList();
    }

    private void setupList() {
        DonVi[] donvi = {
                new DonVi("Công nghệ thông tin","02435632211","Tòa C1"),
                new DonVi("Công trình","02438522024","402 A1"),
                new DonVi("Cơ khí","0438533082","312-314 A1"),
                new DonVi("Hóa và Môi trường","02435640704","316 A5"),
        };
        RecyclerView rcvDonVi = findViewById(R.id.rcv_don_vi);
        DonViAdapter adapter = new DonViAdapter(donvi);
        rcvDonVi.setAdapter(adapter);
    }
}