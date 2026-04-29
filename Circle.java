public class Circle {
private double radius;
public void setRadius(double radius) {
    this.radius = radius;
}
public double getRadius() {
    return this.radius;

}
public double area() {
    double area = 3.14 * radius * radius;
    return area;
}
public String toString() {
    return "Radius: " + getRadius() + " , Area: " + area();
}
}
