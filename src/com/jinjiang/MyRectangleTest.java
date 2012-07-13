package com.jinjiang;

import junit.framework.Assert;
import org.junit.Test;

public class MyRectangleTest {

    @Test
    public void should_be_false_when_rectangle_is_isolate() {
        MyRectangle myRectangle1 = new MyRectangle(2, 2, 3, 3);
        MyRectangle myRectangle2 = new MyRectangle(4, 4, 6, 6);
        Assert.assertFalse("rectangles is intersect", myRectangle1.intersect(myRectangle2));
    }

    @Test
    public void should_be_true_when_rectangle_is_same() {
        MyRectangle myRectangle1 = new MyRectangle(2, 2, 3, 3);
        Assert.assertTrue("rectangles is intersect", myRectangle1.intersect(myRectangle1));
    }

    @Test
    public void should_be_true_when_rectangle_is_include() {
        MyRectangle myRectangle1 = new MyRectangle(2, 2, 5, 5);
        MyRectangle myRectangle2 = new MyRectangle(3, 3, 4, 4);
        Assert.assertTrue("rectangles is intersect", myRectangle1.intersect(myRectangle2));
    }

    @Test
    public void should_be_true_when_rectangle_is_intersect() {
        MyRectangle myRectangle1 = new MyRectangle(2, 2, 3, 3);
        MyRectangle myRectangle2 = new MyRectangle(2, 2, 3, 3);
        Assert.assertTrue("rectangles is intersect", myRectangle1.intersect(myRectangle2));
    }

}
