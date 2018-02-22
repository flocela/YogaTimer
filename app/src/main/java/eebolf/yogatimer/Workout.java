package eebolf.yogatimer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Macklin on 02/02/2018.
 */

public class Workout {
  private List<Pose> poses = new LinkedList<>();
  private List<Category> categories = new LinkedList<>();
  private String name = new String();

  public Workout(String name, List<Pose> poses) {
    this.name = name;
    this.poses = poses;
  }

  public List<Pose> getPoses() {
    return poses;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public String getName () {
    return name;
  }
}
