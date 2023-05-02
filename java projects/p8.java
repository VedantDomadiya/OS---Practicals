
/*3. Create a String Buffer with some default string. Append any string
to ith position of original string and display the modified string. Also 
display the reverse of modified string.*/
import java.util.Scanner;

class p8 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String nString, sString;
        int i;
        nString = sc.nextLine();
        sString = sc.nextLine();
        System.out.print("Enter location after : ");
        i = sc.nextInt();
        StringBuffer subString = new StringBuffer(nString.length() + sString.length() + 10);
        subString.append(nString, 0, i-1);
        subString.append(sString);
        subString.append(nString, i, nString.length());
        System.out.println(subString);
        subString.reverse();
        System.out.println("Reverse of String : " + subString);

    }
}
