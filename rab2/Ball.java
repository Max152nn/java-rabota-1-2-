package com.rab2;

public class Ball {
     private float y;
     private float x;
     private int radius;
     private float xDelta;
     private float yDelta;

    public Ball(float y, float x, int radius, int speed,int direction) {
        this.y = y;
        this.x = x;
        this.radius = radius;
        this.xDelta = (float) (speed*Math.cos(direction));
        this.yDelta = (float) (-speed*Math.sin(direction));
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + y +
                ")," + x +
                "speed=(" + xDelta +
                "," + yDelta +
        ')'+']';
    }
}
