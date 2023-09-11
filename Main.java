
import java.util.*;

public class Main
{
    // Using 2 for loops to arrange the array
    static void sort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            boolean swap = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {23,34,21,3,12,56,4,33,65,88};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}