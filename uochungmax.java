package com.company;
import  java.util.Scanner;

public class uochungmax {

    public static  void main(String[] args)
    {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b= Math.abs(b);
        if(a == 0 && b == 0)
        {
            System.out.println("2 số không có ước chung thỏa mãn");
        }
        while (a != b)
        {
            if( a >b ){
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("Ước chung lớn nhất là :"+ a);
    }
}
