/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo;

import java.util.Scanner;
/**
 *
 * @author defaultuser0
 */
public class ifdalamif {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai = masukan.nextInt();
        

        if (nilai <= 55) {
            System.out.println("Nilai Anda adalah E"); }
        
        else if (nilai <= 65) {
            System.out.println("Nilai Anda adalah D"); }
        
        else if (nilai <= 75) {
            System.out.println("Nilai Anda C"); }       
        
        else if (nilai <= 85) {
            System.out.println("Nilai Anda B"); }
      
        else if (nilai <= 100) {
            System.out.println("Nilai Anda A");}
       
        else if ((nilai <= 0) || (nilai > 100)) {    
            System.out.println("ERROR"); }
    }
}
