/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.ngaynghi;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NgayNghi {
     public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap so ngay nghi: ");
	        int soNgayNghi = scanner.nextInt();

	        int donGia;
	        if (soNgayNghi == 1) {
	            donGia = 1484;
	        } else if (soNgayNghi >= 2 && soNgayNghi <= 4) {
	            donGia = (int) (1484 * 0.8);
	        } else if (soNgayNghi >= 5 && soNgayNghi <= 10) {
	            donGia = (int) (1484 * 0.6);
	        } else {
	            donGia = (int) (1484 * 0.4);
	        }

	        System.out.println("Đon gia phong: " + donGia);
	    }
}

