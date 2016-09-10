/**
 * Created by Леночка on 10.09.2016.
 */
import java.util.Arrays;

public class InvertArrayTask {
    public static void main(String[] args) {

        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(doInvertArray( array)));

    }

    public static int[] doInvertArray( int [ ] arr)
    {
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }


}
