
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bittijono {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        //int n = 9;
        
        for(int i = 0; i < n; i++)
        {
            int t = 0;
            long k = input.nextLong();
            //long k = ThreadLocalRandom.current().nextLong(40L) + 1;
            //long k = 11L;
            //System.out.println(k);
            long v = k;
            while (v > 2)
            {
                v -= smallerPower(v);
                t++;
            }
            if(k == 1)
                System.out.println(0);
            else if(k == 2)
                System.out.println(1);
            else if(k % 2 == 0)
            {
                if(t % 2 == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } 
            else
            {
                if(t % 2 == 0)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
        }
        
    }
    
    public static long smallerPower (long num)
    {
        int length = (int)(Math.log10(num)+1);
        
        //System.out.println(length);
        
        long[] p2 = {1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L};

        
        switch(length)
        {
            case 1:
                if(num > p2[3])
                    return p2[3];
                else if(num > p2[2])
                    return p2[2];
                else if(num > p2[1])
                    return p2[1];
            case 2:
                if(num > p2[6])
                    return p2[6];
                else if(num > p2[5])
                    return p2[5];
                else if(num > p2[4])
                    return p2[4];
                else
                    return p2[3];
            case 3:
                if(num > p2[9])
                    return p2[9];
                else if(num > p2[8])
                    return p2[8];
                else if(num > p2[7])
                    return p2[7];
                else
                    return p2[6];
            case 4:
                if(num > p2[13])
                    return p2[13];
                else if(num > p2[12])
                    return p2[12];
                else if(num > p2[11])
                    return p2[11];
                else if(num > p2[10])
                    return p2[10];
                else
                    return p2[9];
            case 5:
                if(num > p2[16])
                    return p2[16];
                else if(num > p2[15])
                    return p2[15];
                else if(num > p2[14])
                    return p2[14];
                else
                    return p2[13];
            case 6:
                if(num > p2[19])
                    return p2[19];
                else if(num > p2[18])
                    return p2[18];
                else if(num > p2[17])
                    return p2[17];
                else
                    return p2[16];
            case 7:
                if(num > p2[23])
                    return p2[23];
                else if(num > p2[22])
                    return p2[22];
                else if(num > p2[21])
                    return p2[21];
                else if(num > p2[20])
                    return p2[20];
                else
                    return p2[19];
            case 8:
                if(num > p2[26])
                    return p2[26];
                else if(num > p2[25])
                    return p2[25];
                else if(num > p2[24])
                    return p2[24];
                else
                    return p2[23];
            case 9:
                if(num > p2[29])
                    return p2[29];
                else if(num > p2[28])
                    return p2[28];
                else if(num > p2[27])
                    return p2[27];
                else
                    return p2[26];
            case 10:
                if(num > p2[33])
                    return p2[33];
                else if(num > p2[32])
                    return p2[32];
                else if(num > p2[31])
                    return p2[31];
                else if(num > p2[30])
                    return p2[30];
                else
                    return p2[29];
            case 11:
                if(num > p2[36])
                    return p2[36];
                else if(num > p2[35])
                    return p2[35];
                else if(num > p2[34])
                    return p2[34];
                else
                    return p2[33];
            case 12:
                if(num > p2[39])
                    return p2[39];
                else if(num > p2[38])
                    return p2[38];
                else if(num > p2[37])
                    return p2[37];
                else
                    return p2[36];
            case 13:
                if(num > p2[43])
                    return p2[43];
                else if(num > p2[42])
                    return p2[42];
                else if(num > p2[41])
                    return p2[41];
                else if(num > p2[40])
                    return p2[40];
                else
                    return p2[39];
            case 14:
                if(num > p2[46])
                    return p2[46];
                else if(num > p2[45])
                    return p2[45];
                else if(num > p2[44])
                    return p2[44];
                else
                    return p2[43];
            case 15:
                if(num > p2[49])
                    return p2[49];
                else if(num > p2[48])
                    return p2[48];
                else if(num > p2[47])
                    return p2[47];
                else
                    return p2[46];
            case 16:
                if(num > p2[53])
                    return p2[53];
                else if(num > p2[52])
                    return p2[52];
                else if(num > p2[51])
                    return p2[51];
                else if(num > p2[50])
                    return p2[50];
                else
                    return p2[49];
            case 17:
                if(num > p2[56])
                    return p2[56];
                else if(num > p2[55])
                    return p2[55];
                else if(num > p2[54])
                    return p2[54];
                else
                    return p2[53];
            case 18:
                if(num > p2[59])
                    return p2[59];
                else if(num > p2[58])
                    return p2[58];
                else if(num > p2[57])
                    return p2[57];
                else
                    return p2[56];
        }
        return 0;
    }  
}

