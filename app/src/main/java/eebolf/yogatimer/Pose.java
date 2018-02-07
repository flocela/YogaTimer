package eebolf.yogatimer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Macklin on 02/02/2018.
 */

public class Pose {
  private BasePose basePose;
  private String song;
  private List<Subcategory> subCategories = new LinkedList<Subcategory>();

  public Pose(BasePose basePose, String song, List<Subcategory> subcategories) {
    this.basePose = basePose;
    this.song = song;
    this.subCategories = subCategories;
  }

  public Pose(String name, int startTrans, int endTrans, int time, String icon, String song, List<Subcategory> subcategories) {
    this.basePose = new BasePose(name, startTrans, endTrans, time, icon);
    this.song = song;
    this.subCategories = subcategories;
  }

  public BasePose getBasePose() {
    return basePose;
  }

  public String getSong() {
    return song;
  }

  public List<Subcategory> getSubCategories() {
    return subCategories;
  }
}
