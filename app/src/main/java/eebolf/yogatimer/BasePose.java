package eebolf.yogatimer;

/**
 * Created by Macklin on 02/02/2018.
 */

public class BasePose {
  private String name;
  private int startTrans = 0;
  private int endTrans = 0;
  private int time = 0;
  private String icon;

  public BasePose(String name, int startTrans, int endTrans, int time, String icon) {
    this.name = name;
    this.startTrans = startTrans;
    this.endTrans = endTrans;
    this.time = time;
    this.icon = icon;
  }

  public String getName() {
    return name;
  }

  public int getStartTrans() {
    return startTrans;
  }

  public int getEndTrans() {
    return endTrans;
  }

  public int getTime() {
    return time;
  }

  public String getIcon() {
    return icon;
  }
}
