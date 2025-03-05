package android.example.com.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class
MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project("Project 01","Description 1",R.drawable.getting_started),
                new Project("Project 02","Description 2",R.drawable.calculator),
                new Project("Project 03","Description 3",R.drawable.hungry_developer),
                new Project("Project 04","Description 4",R.drawable.tape),
                new Project("Project 05","Description 5",R.drawable.quote),
        };
        RecyclerView rcvProjects = findViewById(R.id.rcv_project);
        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        rcvProjects.setAdapter(adapter);

    }
}