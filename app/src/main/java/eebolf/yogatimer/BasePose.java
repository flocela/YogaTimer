package eebolf.yogatimer;

/**
 * Created by Macklin on 02/02/2018.
 */

public class BasePose {
  private String name;
  private int preDur = 0;
  private int postDur = 0;
  private int mainDur = 0;
  private String icon;

  public BasePose(String name, int preDur, int postDur, int mainDur, String icon) {
    this.name = name;
    this.preDur = preDur;
    this.postDur = postDur;
    this.mainDur = mainDur;
    this.icon = icon;
  }

  public void changeTotAllowMainToChange(int totalTime) {
    int prevTotalTime = postDur + preDur + mainDur;
    int timeDifference = prevTotalTime - totalTime;
    mainDur -= timeDifference;
    if (mainDur < 0) {
      mainDur = 0;
    };
  }

  public void changeTotAllowAllToChange(int totalTime){
    float prevTotalTime = postDur + preDur + mainDur;
    postDur = Math.round( (float)postDur/prevTotalTime * totalTime );
    preDur = Math.round( (float)preDur/prevTotalTime * totalTime );
    mainDur = Math.round( (float)mainDur/prevTotalTime * totalTime );
  }

  public void changeTotAllowPreAndPostToChange(int totalTime) {
    int totalTimeWithoutMain = totalTime - mainDur;
    int prevTotalTimeWithoutMain = postDur + preDur;
    postDur = Math.round( (float)postDur/prevTotalTimeWithoutMain * totalTimeWithoutMain );
    preDur = Math.round( (float)preDur/prevTotalTimeWithoutMain * totalTimeWithoutMain );
  }

  public String getName() {
    return name;
  }

  public int getPreDuration() {
    return preDur;
  }

  public int getPostDuration() {
    return postDur;
  }

  public int getMainDuration() {
    return mainDur;
  }

  public String getIcon() {
    return icon;
  }
}
