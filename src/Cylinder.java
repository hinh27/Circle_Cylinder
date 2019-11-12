public class Cylinder extends Circle {
 private int height;
    public Cylinder( double radius,String color,int height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public  double getVolume(){
        return super.getAreaCircle()*this.height;

    }

    @Override
    public String toString() {
        return "A Cylinder with:\n Radius"
                + getRadius()
                + "\n Color:"
                + getColor()
                +"\nHeight:"
                +getHeight()
                +  "\n Volume:"
                + getVolume();

    }
}
