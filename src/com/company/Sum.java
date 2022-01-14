package com.company;


public class Sum {
    int n1;
    int n2;
    public static void main(String[]args){
        Sum instantiate = new Sum();
        instantiate.fortest();
    }
    public Sum() {

    }

    public int summation(int x, int y){
        return x+y;
    }
    public void fortest(){
        int n3 =30;
        int n4 =40;
        System.out.println(n1 + "" +n2 +""+n3+""+n4);
    }
}
