/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exchange;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ma tien te thu nhat: ");
        String code1 = sc.next();
        System.out.print("nhap vao ma tien te thu hai: ");
        String code2 = sc.next();
        System.out.print("nhap luong tien can chuyen doi: ");
        double amount = sc.nextDouble();
        
        Exchange ex = new Exchange();
        double money = ex.convert(code1, code2, amount);
        System.out.println("luong tien sau khi doi: " + Math.round(money));
    }
}
