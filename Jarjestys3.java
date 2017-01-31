import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.ListIterator;

public class Jarjestys3 {

    static int n;
    static int c;
    static List list;
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int uno = 0;
        list = new ArrayList();
        
        for(int i = 0; i < n; i++)
        {
	    int a = scan.nextInt();
            list.add(a);

            if(a == 1)
                uno = i + 1;
        }
        
        String fin = uno + " ";        
        reverse(list, uno);
        for(int i = 2; i < n; i++)
        {
            fin += deleting(i);
        }

        fin += (n-1);
	System.out.println((c+2) + " " + fin);
    }
     
    public static String deleting(int i)
    {
        int a = list.indexOf(i);
        list.remove(a);
        c += 2;
        return (a + i - 2) + " " + (a + i - 1) + " ";
    }

    public static void reverse(List<?> l, int n)
    {
    ListIterator i1 = l.listIterator();
    int pos1 = 1;
    int pos2 = n;
    ListIterator i2 = l.listIterator(pos2);
    while (pos1 < pos2)
        {
         Object o1 = i1.next();
        Object o2 = i2.previous();
        i1.set(o2);
        i2.set(o1);
        ++pos1;
        --pos2;
        }
    }
}
