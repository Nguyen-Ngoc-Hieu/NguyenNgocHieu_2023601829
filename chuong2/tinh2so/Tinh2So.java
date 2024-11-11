/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.tinh2so;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Tinh2So {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();
        
        System.out.print("Tong: ");
        System.out.println(a + b);
        
        System.out.print("Hieu: ");
        System.out.println(a - b);
        
        System.out.print("Tich: ");
        System.out.println(a * b);
        
        System.out.print("Thuong: ");
        if (b != 0) {
            System.out.println((double) a / b);
        } else {
            System.out.println("Khong the chia cho 0");
        }
        
        scanner.close();
    }
}
