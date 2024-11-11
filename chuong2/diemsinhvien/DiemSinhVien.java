/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.diemsinhvien;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DiemSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap diem cua sinh vien: ");
        double diem = scanner.nextDouble();
        String xepLoai;
        
        if (diem >= 90 && diem <= 100) {
            xepLoai = "A";
        } else if (diem >= 80 && diem < 90) {
            xepLoai = "B";
        } else if (diem >= 70 && diem < 80) {
            xepLoai = "C";
        } else if (diem >= 60 && diem < 70) {
            xepLoai = "D";
        
        } else {
            xepLoai = "F";
        }
        
        System.out.println("Xep loai: " + xepLoai);
        
        scanner.close();
    }
}
