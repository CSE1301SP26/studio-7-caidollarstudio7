import org.w3c.dom.css.Rect;

public class Rectangle {

    private double length;
    private double width;
    private double Area;
    private double perimeter;
    
    public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    Area = length * width;
    perimeter = (2 * length) + (2 * width);
    }
     public boolean isSquare(double length, double width){
        if(length == width){
            return true;
        } else {
            return false;
        }

     }

     public boolean areaComp(Rectangle object2){
       double area1 = this.Area;
        double area2 = object2.Area;
        if (area1 < area2){
            return true;
        } else {
            return false;
        }

     }

    public double getArea(){
        return Area;
    }
    public double getPerimeter(){
        return perimeter;
    }

    public void print(){
        System.out.println("Area: " + getArea() ); 
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Is a Square? " + isSquare(length, width));

    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 5);
        r1.print();
        Rectangle r2 = new Rectangle(5, 10);
        r2.print();

        System.out.println(r1.areaComp(r2));
    }








}
