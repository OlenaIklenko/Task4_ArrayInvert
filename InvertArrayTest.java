/**
 * Created by Леночка on 10.09.2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class InvertArrayTest {
    @Test
    public void testInvertArray(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int[] expectedArray = {2, 9, 9, 3, 4, 2, 6, 5, 4, 2};
        Assert.assertArrayEquals(expectedArray, InvertArrayTask.doInvertArray(array));
    }
}
