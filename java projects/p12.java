/*2. WAP that illustrates method overriding. Class A3 is extended by Class B3. Each 
of these classes defines a hello(string s) method that outputs the string “A3: Hello From” 
or “B3: Hello From” respectively. Use the concept Dynamic Method Dispatch and keyword super.*/

class  A3{
    void hello(String s)
    {
        System.out.println("A3 : Hello from "+ s);
    }
}

class B3 extends A3
{
    void hello(String s)
    {
        super.hello(s);
        System.out.println("B3 : Hello from "+ s);
    }
}


class p12 {
    public static void main(String []arg)
    {
        B3 supObj = new B3();
        supObj.hello("Hllo");
    }
    
}
