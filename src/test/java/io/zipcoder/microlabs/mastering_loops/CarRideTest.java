package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void oneToTenTest(){
        //: Given
        CarRide ride = new CarRide();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual =ride.areWeThereYet();

        //: Then
        Assert.assertEquals("The two strings should be equal", expected, actual);
    }

}
