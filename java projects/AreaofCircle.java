import java.util.*;

public class AreaofCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float Area = 3.14f * rad * rad; // here 3.14 is by default  'Double' taken by java compiler and hence to convert it to float we wrote 'f' after 3.14 
        System.out.println(Area);
    }
}