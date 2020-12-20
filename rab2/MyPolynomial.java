package com.rab2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        int d = 0;
        for( int i = 1; i < coeffs.length; i++ )
            if( coeffs[ i ] != 0 ) d = i;
        return d;
    }

    public double evaluate( double x ){
        double p = 0;
        for( int i = getDegree(); i >= 0; i-- )
            p = coeffs[ i ] + ( x * p );
        return p;
    }

    public String sig(double x){
        return x == 0 ? "" : x > 0 ? "+":"";
    }

    @Override
    public String toString() {
        String a="";
        for(int i=0;i<coeffs.length;i++){
            if(coeffs.length-i>2) {
                a = a + coeffs[i] + "x^" + (coeffs.length - (i+1))+" ";
            }else if(coeffs.length-i==2){
                a = a +sig(coeffs[i])+ coeffs[i] + "x"+" ";
            }
            else {
                a = a +sig(coeffs[i])+ coeffs[i];}
        }
        return a;
    }

    public MyPolynomial add(MyPolynomial right){
        if(this.getDegree()>right.getDegree()){
            MyPolynomial c = new MyPolynomial(this.coeffs);
            for( int i = 0; i < right.coeffs.length; i++ ) {
                c.coeffs[ i ] += right.coeffs[ i ];}
            return c;
        }else {
            MyPolynomial c = new MyPolynomial(right.coeffs);
            for (int i = 0; i < right.coeffs.length; i++) {
                c.coeffs[i] += right.coeffs[i];
            }
            return c;
        }
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] poly = new double[this.coeffs.length+right.coeffs.length-1];
        MyPolynomial z = new MyPolynomial(poly);
        for(int i=0;i<this.coeffs.length+right.coeffs.length-1;i++){
            z.coeffs[i]=0;
        }
        for(int i=0;i<this.coeffs.length;i++){
            for (int j =0;j<right.coeffs.length;j++){
                z.coeffs[i+j]+=(this.coeffs[i]*right.coeffs[j]);
            }
        }
        return z;
    }
}
