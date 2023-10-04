package com.exam;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        String name;
        int num1;
        int num2;
        int num3;
         
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
         
        System.out.print("숫자 3개를 입력하세요 (공백 구분) : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
         
        System.out.println(">> 당신의 이름은 " + name + " 입니다.");
        System.out.printf(">> 당신이 입력한 숫자는 %d, %d, %d 입니다.\n", num1, num2, num3);
    }
}