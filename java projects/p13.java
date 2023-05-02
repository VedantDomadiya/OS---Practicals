/*1. Write an abstract class shape, which defines abstract method area. Derive class circle from shape. 
It has data member radius and implementation for area function. Derive class Triangle from shape. It 
has data members height, base and implementation for area function. Derive class Square from shape. It has 
data member side and implementation for area function. In main class, use dynamic method dispatch in order 
to call correct version of method.*/

abstract class shape{
    abstract void area(); 
    void print()
    {
        System.out.println("gg");
    }
}

class circle extends shape
{
    double radius;
    circle(double x)
    {
        radius = x;
    }
    void area()
    {
        System.out.println("Area of Circle is : "+ 3.14*radius*radius);
    }
}
class Triangle extends shape
{
    double height,base;
    Triangle(double x,double y)
    {
        height = x;
        base = y;
    }
    void area()
    {
        System.out.println("Area of Triangle is : "+ 0.5*height*base);
    }
}

class Square extends shape
{
    double side;
    Square(double x)
    {
        side = x;
    }
    void area()
    {
        System.out.println("Area of Square is : "+ side*side);
    }
}


class p13
{
    public static void main(String [] arg)
    {
        shape x;
        circle a = new circle(7);
        Triangle b = new Triangle(12,6);
        Square c = new Square(52);
        x = a;
        x.area();
        x = b;
        x.area();
        x = c;
        x.area();
            
    }
}