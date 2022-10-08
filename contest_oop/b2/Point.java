package contest_oop.b2;

public class Point {

  private Double x;
  private Double y;

  public Point(Point point) {
    x = point.x;
    y = point.y;
  }

  public Point() {
  }

  public Point(Double x, Double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point secondPoint){
    return Math.sqrt(Math.pow((x - secondPoint.x), 2) +  Math.pow((y - secondPoint.y), 2));
  }

  public double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow((p1.x - p2.x), 2) +  Math.pow((p1.y - p2.y), 2));
  }


  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }
}
