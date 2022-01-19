package com.company.interfaces;

public class Calclulus extends Grocery implements IInterface{
    private int n1=3;
    private int n2=2;
    public String name;
    @Override
    public int calculation(int n1, int n2) {
        System.out.println(n1+n2);
        return this.n1+this.n2;
    }

    @Override
    public void sayHello() {
        System.out.println("hello obada");
    }

    @Override
    public String toString() {
        return "Calclulus{" +
                "habal=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
