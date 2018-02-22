package eebolf.yogatimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

  List<Workout> workouts;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    RecyclerView rvWorkouts = findViewById(R.id.rvWorkouts);
    Repository repo = new Repository();
    this.workouts = repo.getWorkouts();
    WorkoutsAdapter adapter = new WorkoutsAdapter(this, workouts);
    rvWorkouts.setAdapter(adapter);
    rvWorkouts.setLayoutManager(new LinearLayoutManager(this));
  }
}
