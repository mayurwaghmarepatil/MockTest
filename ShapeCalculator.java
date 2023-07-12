import java.sql.SQLOutput;

abstract class Shape{
    abstract double calculateArea();

}
class Rectangle extends Shape{
    private double length;
   private double breadth;

   public Rectangle(double length,double breadth){
       this.length=length;
       this.breadth=breadth;
   }
    @Override
    double calculateArea() {

        double RecResult=length*breadth;
        return RecResult;

    }
}
class Circle extends Shape{
private double r;
public Circle(double r){
    this.r=r;
}
    @Override
    double calculateArea() {
        double CirResult=3.14*r*r;
        return CirResult;
    }
}
class Triangle extends Shape{
private  double b;
   private double h;

   public Triangle(double b,double h){
       this.b=b;
       this.h=h;
   }
    @Override
    double calculateArea() {
        double TriResult=0.5*b*h;
        return TriResult;
    }
}
class ShapeCalculator{
    public static void main(String[] args){

            Rectangle rec=new Rectangle(10,56);
        System.out.println("Area of Rectangle is "+rec.calculateArea());
            Circle cl=new Circle(63);
        System.out.println("Area of Circle is "+cl.calculateArea());
            Triangle tl=new Triangle(25 ,50);
        System.out.println("Area of Triange is "+tl.calculateArea());

        }
    }



