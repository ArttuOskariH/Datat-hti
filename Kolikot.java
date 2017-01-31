import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Kolikot {
    
    static int n;
    static ArrayList<boolean[]> set;
    static int[] arr;

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
	int k = 1;        

        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();

        }
	set = new ArrayList();
	
	boolean[] tmp = new boolean[n];
        Arrays.fill(tmp, true);
        set.add(tmp);
        
        while(true)
        {
            boolean[] line = NextLine(k);
            if(!line[n-1])
            {
                System.out.println(k);
                break;
            }
            set.add(line);
            k++;
        }
    }
    public static boolean[] NextLine(int line)
    {
        boolean[] NewLine = new boolean[n];
        if(arr[0] == line)
            NewLine[0] = true;
        
        for(int i = 1; i < n; i++)
        {   
            if(NewLine[i-1])
            {
                NewLine[i] = true;
                continue;
            }
            if(line-arr[i] < 0)
                continue;
            if(set.get(line-arr[i])[i-1])
                NewLine[i] = true;
        }
        return NewLine;
    }
}

