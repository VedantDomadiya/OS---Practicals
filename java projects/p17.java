import java.util.*;

class NoMatchException extends Exception
{
    public NoMatchException(String str)
    {
        super(str);
    }
}


class p17 {
    static int check(String x)
    {
        int c = 0;
        char[]a = new char[x.length()];
        char[]b = {'I','n','d','i','a'};
        a = x.toCharArray();
        for(int i=0;i<5;i++)
        {
            if(a[i]!=b[i])
            {
                c =1;
            }
        }
        return c;

        
    }
    static void validate(int c)throws NoMatchException{
        if(c==1)
        {
            throw new NoMatchException("Out of Not from India");
        }
        else
        {
            System.out.println("Wellcom");
        }
    }
    public static void main(String [] arg)
    {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        try
        {
            validate(check(x));
        }
        catch(NoMatchException e)
        {
            System.out.println("Check your input\n");
            System.out.println("Exeption : "+e);
        }
        
    }    
}
