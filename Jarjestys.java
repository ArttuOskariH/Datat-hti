import java.util.Scanner;
import static java.lang.System.arraycopy;
import java.util.Arrays;
import java.util.Collections;

public class Jarjestys {

    static int[] arr;
    static int n;
    static int c;    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        
        String fin = "";
        for(int i = n; i > 0; i--)
        {
            fin += finder(i);      
        }
	System.out.println(c + " " + fin);
    }
    
    public static int[] swapA(int n2, int[] arr, int p)
    {
        int a = n2-(p+1); 
        int[] arr2 = new int[n2];
        int[] arr3 = new int[a];
        arraycopy(arr, 0, arr2, a, p+1);
        arraycopy(arr, p+1, arr3, 0, a);
        reverse(arr3, 0, a);
        arraycopy(arr3, 0, arr2, 0, a);
        return arr2;
    }
    
    public static int[] swapB(int n2, int[] arr)
    {
        int[] arr2 = new int[n2];
        reverse(arr, 0, n2);
        arraycopy(arr, 0, arr2, 0, n2);
        return arr2;
    }   
    
    public static int[] swapC(int n2, int[] arr)
    {
        int[] arr2 = new int[n2];
        arraycopy(arr, 0, arr2, 0, n2);
        return arr2;
    }
       
    static String finder(int i)
    {
        if(arr[i-1] == i)
        {
            arr = swapC(i, arr);
            return "";
        }
        if(arr[0] == i)
        {
            arr = swapB(i, arr);
            c++;
            return i + " ";
        }       
        for(int j = 1; j < i-1; j++)
        {
            if(arr[j] == i)
            {
                arr = swapA(i ,arr, j);
                c += 2;
                return j+1 + " " + i + " ";
            }       
        }
        
        return "";
    }
    
    public static void reverse(final int[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }    
}
