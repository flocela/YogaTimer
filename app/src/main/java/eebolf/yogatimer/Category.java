package eebolf.yogatimer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Macklin on 02/02/2018.
 */

public class Category {
  private String name;
  private List<Subcategory> subcategories = new LinkedList<>();

  public Category(String name, List<Subcategory> subcategories) {
    this.name = name;
    this.subcategories = subcategories;
  }

  public String getName() {
    return name;
  }

  public List<Subcategory> getSubcategories () {
    return subcategories;
  }
}
