package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shape = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****\n******\n*******";

        //: When
        String actual = shape.triangle(7);

        //: Then
        Assert.assertEquals("The two strings should be equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        Shapes shape = new Shapes();
        String expected = "tableSquare()\n*** Output ***\n\n| 1 | 2 | 3 | 4 |\n| 2 | 4 | 6 | 8 |\n" +
                "| 3 | 6 | 9 | 12|\n| 4 | 8 | 12| 16|";

        //: When
        String actual = shape.tableSquare();

        //: Then
        Assert.assertEquals("The two strings should be equal", expected, actual);
    }
}
