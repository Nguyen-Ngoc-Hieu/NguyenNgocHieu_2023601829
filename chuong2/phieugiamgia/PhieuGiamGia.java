/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.phieugiamgia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PhieuGiamGia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao gia ban: ");
        double giaBan = scanner.nextDouble();
        System.out.print("Nhap vao phan tram giam gia: ");
        double phanTramGiam = scanner.nextDouble();

        double giaSauGiam = giaBan - (giaBan * phanTramGiam / 100);
        System.out.println("Gia sau khi giam gia la: " + giaSauGiam);
    }
}
