package com.rab2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int weight, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = weight;
        this.y2 = height;
    }

    public boolean collidesWidth(Ball ball){
        float a=x2-x1;
        float b=y2-y1;
        if(Math.sqrt((a*a)+(b*b))>2*ball.getRadius()){
            return true;
        }else return false;
    }
}
