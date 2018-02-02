package eebolf.yogatimer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Macklin on 02/02/2018.
 */

public class Workout {
  private List<Pose> poses = new LinkedList<>();
  private List<Category> categories = new LinkedList<>();

  public Workout(List<Pose> poses, List<Category> categories) {
    this.poses = poses;
    this.categories = categories;
  }

  public List<Pose> getPoses() {
    return poses;
  }

  public List<Category> getCategories() {
    return categories;
  }
}
