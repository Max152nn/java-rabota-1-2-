package com.rab1;

public class MyPoint {
    private int x =0;
    private int y =0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int [] a = new int[2];
         a[0] = getX();
         a[1] = getY();
         return a;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                "x" + x +
                ", y" + y +
                ')';
    }

    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }

    public double distance(MyPoint another){
        return Math.sqrt((this.x-another.getX())*(this.x-another.getX())) + Math.sqrt((this.y-another.getY())*(this.y-another.getY()));
    }

    public double distance(){
        return Math.sqrt((this.x-0)*(this.x-0)) + Math.sqrt((this.y-0)*(this.y-0));
    }
}
