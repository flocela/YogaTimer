package eebolf.yogatimer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Macklin on 02/07/2018.
 */

public class WorkoutsAdapter extends RecyclerView.Adapter<WorkoutsAdapter.ViewHolder> {

  private List<Workout> workouts;
  private Context mContext;

  public WorkoutsAdapter(Context context, List<Workout> workouts) {
    mContext = context;
    this.workouts = workouts;
  }

  @Override
  public WorkoutsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    Context context = parent.getContext();
    LayoutInflater inflater = LayoutInflater.from(mContext);
    View workoutView = inflater.inflate(R.layout.item_workout, parent, false);
    ViewHolder viewHolder = new ViewHolder(workoutView);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder (WorkoutsAdapter.ViewHolder viewHolder, int position) {
    Workout workout = workouts.get(position);
    viewHolder.nameTextView.setText(workout.getName());
  }

  @Override
  public int getItemCount () {
    return workouts.size();
  }

  private Context getContext() {
    return mContext;
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTextView;

    public ViewHolder (View itemView) {
      super (itemView);
      this.nameTextView = itemView.findViewById(R.id.wkRow);

    }
  }

}
