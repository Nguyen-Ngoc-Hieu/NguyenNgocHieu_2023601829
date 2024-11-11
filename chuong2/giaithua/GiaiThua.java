/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.giaithua;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class GiaiThua {
   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("nhap vao mot so nguyen: ");
	        int n = scanner.nextInt();

	        long giaiThua = 1;
	        for (int i = 1; i <= n; i++) {
	            giaiThua *= i;
	        }

	        System.out.println("giai thua cua n " + n + " la: " + giaiThua);
	    } 
}
