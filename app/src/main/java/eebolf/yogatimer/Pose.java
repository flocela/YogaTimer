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
