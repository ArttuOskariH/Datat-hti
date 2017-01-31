import java.util.*;
import java.util.stream.Collectors;

public class Pakkaus {
    
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        //String scam = "12fe4he";
        String sc = scam + "*";
      	String n = "";
        String s = "";
        String fin = "";
        String[] arr = sc.split("");
        
        for(int i = 1; i < arr.length; i++)
        {
            if(Num(arr[i]) && !Num(arr[i-1]))
            {
                arr[i-1] += "*";
            }
        }
        
        sc = Arrays.stream(arr).collect(Collectors.joining(""));
        arr = sc.split("");
        for(int i = 0; i < arr.length; i++)
        {
            if(Num(arr[i])) {
                n += arr[i];
            } else if(!Num(arr[i]) && !"*".equals(arr[i])) {
                s += arr[i];
            } else if("*".equals(arr[i])) {
                int nn = Integer.parseInt(n);
                for(int j = 0; j < nn; j++){
                        fin += s;
                }
                s = "";
                n = "";
                System.out.println(fin);
            }
            System.out.println(n);
            System.out.println(s);
        }
    System.out.println(fin);
    }

    public static boolean Num(String str) {
            return str.matches("-?\\d+");
    }	
}

