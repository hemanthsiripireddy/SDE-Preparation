 class Shape{
    private double area;
    private String color;
    private double perimeter;
    private String type;
    public Shape(String type,String color){
        this.color=color;
        this.type=type;
    }
    public String getColor(){
        return this.color;

    }
   
   
    public String getType(){
        return this.type;
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
   
    void calcArea(int x,int y){
        
        area= x*y;
       

    }
    void calcPerimeter(int x,int y){
       
        perimeter= 2*x+2*y;
       
    }
    void calcArea(int x){
        
        area= x*x;
        
    }
    void calcPerimeter(int x){
       
        perimeter= 4*x;
       
    }
    void calcArea(double x){
       
        area= 3.14*x*x;
       
    }
    void  calcPerimeter(double x){
       
        perimeter= 2*3.14*x;
        
    }
    
  
     
    
     
    
    

}
class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(String type,String color,int width,int height){
        super(type,color);
        this.height=height;
        this.width=width;
        calcArea(this.height,this.width);
        calcPerimeter(width, height);
        
    }
    
    public void displayDetails(){
        System.out.println("Type: "+getType()+" Color: "+getColor()+" Area: "+getArea()+"Perimeter: "+getPerimeter());
    }

}
class Square extends Shape{
    int side;
    public Square(String type,String color,int side){
        super(type,color);
        this.side=side;
        calcArea(side);
        calcPerimeter(side);
    }
    public void displayDetails(){
        System.out.println("Type: "+getType()+" Color: "+getColor()+" Area: "+getArea()+"Perimeter: "+getPerimeter());
    }
    
}
class Circle extends Shape{
    double radius;
    public Circle(String type,String color,double radius){
        super(type,color);
        this.radius=radius;
        calcArea(radius);
        calcPerimeter(radius);
    }
    public void displayDetails(){
        System.out.println("Type: "+getType()+" Color: "+getColor()+" Area: "+getArea()+" Perimeter: "+getPerimeter());
    }
   
}
public class OOPsDemonstration{
    public static void main(String[] args){
        Rectangle rectangle=new Rectangle("Rectange","Blue",5, 4);
     rectangle.displayDetails();
    }

}