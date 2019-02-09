package ru.stqa.pft.sandbox;

public class MySecondTask {

  public static void main(String[] args) {

    Point p1 = new Point(-1.0,1.0);
    Point p2 = new Point(12.0,-3.5);
    System.out.println("Расстояние между точками A(" + p1.x + "," + p1.y + ") и B(" + p2.x + "," + p2.y + ") = " + distance(p1, p2));
    System.out.println("Расстояние между точками A(" + p1.x + "," + p1.y + ") и B(" + p2.x + "," + p2.y + ") = " + p1.distance(p2));

  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }

}
