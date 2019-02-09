package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance01(){

    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    Assert.assertEquals(p1.distance(p2), 0.0);

  }

  @Test
  public void testDistance02(){

    Point p1 = new Point(0,0);
    Point p2 = new Point(0,100.001);
    Assert.assertEquals(p1.distance(p2), 100.001);

  }

  @Test
  public void testDistance03(){

    Point p1 = new Point(-10.5,0);
    Point p2 = new Point(0.5,0.0);
    Assert.assertEquals(p1.distance(p2), 11.0);

  }

  @Test
  public void testDistance04(){

    Point p1 = new Point(-1000000000.1,-1000000000.1);
    Point p2 = new Point(-0,-1000000000.1);
    Assert.assertEquals(p1.distance(p2), 1000000000.1);

  }

  @Test
  public void testDistance05(){

    Point p1 = new Point(1,2);
    Point p2 = new Point(-2,6);
    Assert.assertEquals(p1.distance(p2), 5.0);

  }

  @Test
  public void testDistance06(){

    Point p1 = new Point(-1,-1);
    Point p2 = new Point(-1,-1);
    Assert.assertEquals(p1.distance(p2), 0.0);

  }

  @Test
  public void testDistance07(){

    Point p1 = new Point(5,10);
    Point p2 = new Point(2,6);
    Assert.assertEquals(p1.distance(p2), 5.0);

  }

  @Test
  public void testDistance08(){

    Point p1 = new Point(1,1.5);
    Point p2 = new Point(-2,-2.5);
    Assert.assertEquals(p1.distance(p2), 5.0);

  }

  @Test
  public void testDistance09(){

    Point p1 = new Point(-1.25,14.99999);
    Point p2 = new Point(-4.25,10.99999);
    Assert.assertEquals(p1.distance(p2), 5.0);

  }

  @Test
  public void testDistance10(){

    Point p1 = new Point(1234567890,9876543210.0);
    Point p2 = new Point(-1000000.0000001,0);
    Assert.assertEquals(p1.distance(p2), 9.953528710452196E9);

  }
}
