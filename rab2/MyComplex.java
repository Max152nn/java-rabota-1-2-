package com.rab2;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    public String sig(double x){
        return x == 0 ? "" : x > 0 ? "+":"";
    }

    @Override
    public String toString() {
        return "(" + real + sig(imag)+" "+
                 imag +"i"+')';
    }

    public boolean isReal(){
        return real==0;
    }

    public boolean Imaginary(){
        return imag==0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex complex = (MyComplex) o;
        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imag, imag) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
    
    public boolean equals(double real,double imag) {
        Double rel = real;
        Double im = imag;

        if(rel.compareTo(real)==0 && im.compareTo(imag)==0){
            return true;
        }else {
            return false;
        }

    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument(){
        return Math.atan2(real, imag);
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.real,this.imag+right.imag);
    }

    public MyComplex subtract (MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.real,this.imag-right.imag);
    }

    public MyComplex multiply(MyComplex right){
        real = real*right.real-imag*right.imag;
        imag = imag*right.real+real*right.imag;
        return this;
    }

    public MyComplex divided(MyComplex right){
        real =(real*right.real+imag*right.imag)/(right.real*right.real+right.imag*right.imag);
        imag =(imag*right.real-real*right.imag)/(right.real*right.real+right.imag*right.imag);
        return this;
    }

    public MyComplex conjugate() {
        if (Double.isNaN(real) || Double.isNaN(imag)) {
            return new MyComplex(Double.NaN,Double.NaN);
        }
        return new MyComplex(real, -imag);
    }
}
