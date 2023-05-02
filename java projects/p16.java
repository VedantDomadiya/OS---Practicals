class p16
{
    public static void main(String [] args)
    {
        if(args.length  == 1)
        {
            try
            {
                int x = 5/0;
            }
            catch(Exception e)
            {
                System.out.println("Error : only one input");
            }
        }
        else
        {
            try
            {
                int x = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
                System.out.println(x);
            }
            catch(Exception e)
            {
                System.out.println("Error : Try again wrong input ");
            }
        }
    }
}