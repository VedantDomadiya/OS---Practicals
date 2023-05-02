interface Shape2D{
    void getArea();
}

abstract class Shape{
    abstract void display();
}

class circle extends Shape implements Shape2D
{
    double r,ar;
    circle(double x)
    {
        r = x;
    }
    public void getArea()
    {
        ar = (22/7)*r*r;
    }
    void display()
    {
        getArea();
        System.out.println("Area : "+ar);
    }
}
class p14 {
    public static void main(String [] args)
    {
        circle c1 = new circle(7);
        c1.display();
    }
    
}
