/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.tonggiay;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TongGiay {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap vao so gio: ");
	        int hours = scanner.nextInt();

	        System.out.print("Nhap vao so phut: ");
	        int minutes = scanner.nextInt();

	        System.out.print("Nhap vao so giay: ");
	        int seconds = scanner.nextInt();

	        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

	        System.out.println("Tong so giay la: " + totalSeconds);
	    }
}
