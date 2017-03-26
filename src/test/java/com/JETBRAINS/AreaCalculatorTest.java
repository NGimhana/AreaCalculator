package com.JETBRAINS;

import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 * Created by Gimhana on 3/24/2017.
 */
public class AreaCalculatorTest {

    @Test
    public void testTestAreaRectangle() throws Exception {
        Assert.assertEquals(AreaCalculator.getAreaRectangle(3, 4), 12.0);
    }

    @org.testng.annotations.Test
    public void testTestAreaTriangle() throws Exception {
        Assert.assertEquals(AreaCalculator.getAreaTriangle(2, 3), 3.0);
    }

    @org.testng.annotations.Test
    public void testTestAreaCircle() throws Exception {
        Assert.assertEquals(AreaCalculator.getAreaCircle(7), 153.93804002589985);
    }

}
