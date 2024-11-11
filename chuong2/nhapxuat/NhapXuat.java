/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.nhapxuat;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NhapXuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nhap mot so nguyen: ");
    int soNguyen = scanner.nextInt();
    
    System.out.print("Nhap mot so thuc: ");
    double soThuc = scanner.nextDouble();
    
    System.out.print("Nhap mot ky tu: ");
    char kyTu = scanner.next().charAt(0);
    
    scanner.nextLine(); // Xoa dong newline con lai
    
    System.out.print("Nhap mot chuoi ky tu: ");
    String chuoiKyTu = scanner.nextLine();
    
    System.out.println("So nguyen: " + soNguyen);
    System.out.println("So thuc: " + soThuc);
    System.out.println("Ky tu: " + kyTu);
    System.out.println("Chuoi ky tu: " + chuoiKyTu);
    
    scanner.close();
}
}
