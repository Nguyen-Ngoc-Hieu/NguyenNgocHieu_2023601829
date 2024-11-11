/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.tinhdof;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TinhDoF {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap vao nhiet do C: ");
	        double celsius = scanner.nextDouble();

	        double fahrenheit = celsius * 1.8 + 32;
	        System.out.println("Nhiet do F la: " + fahrenheit);
	    }
}
