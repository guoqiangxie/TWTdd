package com.jinjiang;

public class MyRectangle {

    private int beginX, beginY, endX, endY;

    public MyRectangle(int beginX, int beginY, int endX, int endY) {
        this.beginX = beginX;
        this.beginY = beginY;
        this.endX = endX;
        this.endY = endY;
    }

    public boolean intersect(MyRectangle myRectangle2) {
        return isXIntersect(myRectangle2) && isYIntersect(myRectangle2);
    }

    private int getMaxX() {
        return beginX > endX ? beginX : endX;
    }

    private int getMaxY() {
        return beginY > endY ? beginY : endY;
    }

    private int getMinX() {
        return beginX < endX ? beginX : endX;
    }

    private int getMinY() {
        return beginY < endY ? beginY : endY;
    }


    private boolean isXIntersect(MyRectangle myRectangle2) {
        if (getMinX() > myRectangle2.getMaxX() || getMaxX() < myRectangle2.getMinX()) {
            return false;
        }
        return true;
    }

    private boolean isYIntersect(MyRectangle myRectangle2) {
        if (getMinY() > myRectangle2.getMaxY() || getMaxY() < myRectangle2.getMinY()) {
            return false;
        }
        return true;
    }
}
