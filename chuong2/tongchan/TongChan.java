/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.tongchan;

/**
 *
 * @author pc
 */
public class TongChan {
     public static void main(String[] args) {
	        int tong = 0;
	        
	        for (int i = 2; i <= 100; i += 2) {
	            tong += i;
	        }
	        
	        System.out.println("Tong cac so chan tu 1 den 100 la: " + tong);
	    }
}
