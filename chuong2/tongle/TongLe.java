/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap.chuong2.tongle;

/**
 *
 * @author pc
 */
public class TongLe {
    public static void main(String[] args) {
        int tong = 0;
        
        for (int i = 1; i <= 100; i += 2) {
            tong += i;
        }
        
        System.out.println("Tong cac so le tu 1 den 100 la: " + tong);
    }
}
