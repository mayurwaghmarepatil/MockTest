public interface Drawable {
    void draw();
}
class Circle1 implements Drawable{

    @Override
    public void draw() {
        System.out.println("circle is drawing");
    }
}
class Rectangle1 implements Drawable{

    @Override
    public void draw() {
        System.out.println("rectangle is drawing");
    }
}
class Main76{
    public static void main(String[] args) {
        Circle1 cl1=new Circle1();
        cl1.draw();

        Rectangle1 rec1=new Rectangle1();
        rec1.draw();
    }
}
