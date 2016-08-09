package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Imprimir loa números pares desde cero hasta un número capturado por teclado.
public class ForExample {    
    public static void main(String args[])
    {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número: ");
            int num = scanner.nextInt();
            
            for(int i=2; i< num; i++)
            {
                if(i % 2 == 0)
                {
                    System.out.println("El " + i + " es un número par.");
                }
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
