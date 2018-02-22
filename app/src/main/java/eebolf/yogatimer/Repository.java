package eebolf.yogatimer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Macklin on 02/07/2018.
 */

public class Repository {
  public List<Workout> getWorkouts (){
    Pose p1a = new Pose("P1a", 1, 1, 10, "P1a Icon", "P1a Song", new LinkedList<Subcategory>());
    Pose p2a = new Pose("P2a", 1, 1, 10, "P2a Icon", "P2a Song", new LinkedList<Subcategory>());
    Pose p3a = new Pose("P3a", 1, 1, 10, "P3a Icon", "P3a Song", new LinkedList<Subcategory>());
    Pose p4a = new Pose("P4a", 1, 1, 10, "P4a Icon", "P4a Song", new LinkedList<Subcategory>());
    Pose p5a = new Pose("P5a", 1, 1, 10, "P5a Icon", "P5a Song", new LinkedList<Subcategory>());
    LinkedList<Pose> poseListA = new LinkedList<>();
    poseListA.add(p1a);
    poseListA.add(p2a);
    poseListA.add(p3a);
    poseListA.add(p4a);
    poseListA.add(p5a);
    Workout wA = new Workout("Morning workout", poseListA);

    Pose p1b = new Pose("P1b", 1, 1, 10, "P1b Icon", "P1b Song", new LinkedList<Subcategory>());
    Pose p2b = new Pose("P2b", 1, 1, 10, "P2b Icon", "P2b Song", new LinkedList<Subcategory>());
    Pose p3b = new Pose("P3b", 1, 1, 10, "P3b Icon", "P3b Song", new LinkedList<Subcategory>());
    Pose p4b = new Pose("P4b", 1, 1, 10, "P4b Icon", "P4b Song", new LinkedList<Subcategory>());
    Pose p5b = new Pose("P5b", 1, 1, 10, "P5b Icon", "P5b Song", new LinkedList<Subcategory>());
    LinkedList<Pose> poseListB = new LinkedList<>();
    poseListB.add(p1b);
    poseListB.add(p2b);
    poseListB.add(p3b);
    poseListB.add(p4b);
    poseListB.add(p5b);
    Workout wB = new Workout("Afternoon workout", poseListB);

    LinkedList<Workout> workouts = new LinkedList<>();
    workouts.add(wA);
    workouts.add(wB);
    return workouts;

  }
}
