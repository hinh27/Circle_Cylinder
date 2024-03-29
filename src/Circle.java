public class Circle {
     double radius;
    String color;

    public Circle () {

    }

    public Circle (double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color){
        this.radius= radius;
        this.color= color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAreaCircle() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with \n Radius="
                + getRadius()
                + "\n Color:"
                + getColor()
                + "\nArea:"
                + getAreaCircle();
}
}
