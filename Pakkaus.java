
import java.util.Scanner;

public class Pakkaus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = "12fe24he956634ug59456edgbxv";
        String input = sc.next();
        
        int ind = 1;
        String fin = "", n = String.valueOf(input.charAt(0)), c = "";
        
        while(ind < input.length())
        {
            if(Num(input.charAt(ind)) && !Num(input.charAt(ind-1)))
            {
                fin += repeat(Integer.parseInt(n), c);
                n = "";
                c = "";
            }

            if(Num(input.charAt(ind)))
                n += String.valueOf(input.charAt(ind));
            else
                c += String.valueOf(input.charAt(ind));
            ind++;
        }
        fin += repeat(Integer.parseInt(n), c);
        System.out.println(fin);
    }

    public static boolean Num(int c) {
            return (c >= '0' && c <= '9');
    }
    
    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }
    
    
}
