/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desa;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class MatzabalinAlex {
    
    public static void main(String[] args){
        float a=0,b=0,temp=0;
        Scanner tecla= new Scanner(System.in);
        System.out.print("a= ");
        a=Float.valueOf(tecla.nextLine());
        System.out.print("b= ");
        b=Float.valueOf(tecla.nextLine());
        System.out.println("        suma de dos número  = "+(a+b));
        System.out.println("        resta de dos número = "+(a-b));
        System.out.println("multiplicacion de dos número= "+(a*b));
        
    }   
    
}
