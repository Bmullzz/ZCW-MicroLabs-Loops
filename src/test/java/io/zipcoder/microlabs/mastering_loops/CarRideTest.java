package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void carRideTest(){
        //: Given
        Shapes shape = new Shapes();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual =shape.triangle(6);
        Assert.assertEquals("The two strings should be equal", expected, actual);
    }

}
