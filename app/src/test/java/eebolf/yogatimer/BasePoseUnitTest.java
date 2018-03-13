package eebolf.yogatimer;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Macklin on 03/07/2018.
 */

public class BasePoseUnitTest {
  @Test
  public void changeMainDurationToLess() {
    BasePose examplePose = new BasePose("Example", 45000, 45000,120000, null);
    examplePose.changeTotAllowMainToChange(180000);
    assertEquals(90000, examplePose.getMainDuration());
    assertEquals(45000, examplePose.getPreDuration());
    assertEquals(45000, examplePose.getPostDuration());
  }

  @Test
  public void changeMainDurationToMore() {
    BasePose examplePose = new BasePose("Example", 45000,45000,120000, null);
    examplePose.changeTotAllowMainToChange(300000);
    assertEquals(210000, examplePose.getMainDuration());
    assertEquals(45000, examplePose.getPreDuration());
    assertEquals(45000, examplePose.getPostDuration());
  }

  @Test
  public void changeMainDurationToZero(){
    BasePose examplePose = new BasePose("Example", 45000,45000,120000, null);
    examplePose.changeTotAllowMainToChange(80000);
    assertEquals(0, examplePose.getMainDuration());
    assertEquals(45000, examplePose.getPreDuration());
    assertEquals(45000, examplePose.getPostDuration());
  }

  @Test
  public void changeTotalTimeChangeAllDurations() {
    BasePose examplePose = new BasePose("Example", 10000,20000,30000, null);
    examplePose.changeTotAllowAllToChange(100000);
    assertEquals(16667,examplePose.getPreDuration());
    assertEquals(33333,examplePose.getPostDuration());
    assertEquals(50000,examplePose.getMainDuration());
  }

  @Test
  public void changeTotalTimeOnlyPreAndPostChange() {
    BasePose examplePose = new BasePose("Example", 10000,20000,30000, null);
    examplePose.changeTotAllowPreAndPostToChange(100000);
    assertEquals(23333,examplePose.getPreDuration());
    assertEquals(46667,examplePose.getPostDuration());
    assertEquals(30000,examplePose.getMainDuration());
  }
}
