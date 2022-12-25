public interface IShape{
    double area;
    String colour;
    double perimeter;
    String type;
    double calcArea();
    double calcPerimeter();
    void draShape();

}
public class Rectangle implements IShape{
 private int length;
 private int width;
 public Rectangle(int length,int width){
    this.length=length;
    this.width=width;
 }



}
public class Square implements Rectangle{
    public Square(int length){
        super(length,0);
    }

}