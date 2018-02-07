package eebolf.yogatimer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Macklin on 02/07/2018.
 */

public class WorkoutsAdapter extends RecyclerView.Adapter<WorkoutsAdapter.ViewHolder>{
  private List<Workout> workouts;
  private Context mContext;

  public WorkoutsAdapter(Context context, List<Workout> workouts) {
    mContext = context;
    this.workouts = workouts;
  }
  @Override
  public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    Context context = parent.getContext();
    LayoutInflater inflater = LayoutInflater.from(mContext);
    View workoutView = inflater.inflate(R.layout.item_workout, parent, false);
    RecyclerView.ViewHolder viewHolder = new ViewHolder(workoutView);
  }

  
}
