/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.so3chuso;

/**
 *
 * @author pc
 */
public class So3ChuSo {
    public static void main(String[] args) {
	        for (int a = 1; a <= 9; a++) {
	            for (int b = 0; b <= 9; b++) {
	                for (int c = 0; c <= 9; c++) {
	                    int number = a * 100 + b * 10 + c;
	                    if (number == a * a * a + b * b * b + c * c * c) {
	                        System.out.println("so thoa man la: " + number);
	                    }
	                }
	            }
	        }
	    }
}
