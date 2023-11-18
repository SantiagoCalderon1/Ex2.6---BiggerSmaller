/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2_smaller;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Activity2_Smaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small=0, big=0, variable_1, variable_2, variable_3;
        //inicialicé small y big en 0

        System.out.println("This program can give you the biggest and smallest number of three");

        System.out.print("Write a number: ");
        variable_1 = scanner.nextInt();

        System.out.print("Write another number: ");
        variable_2 = scanner.nextInt();

        System.out.print("Write the third number: ");
        variable_3 = scanner.nextInt();

        //reorganicé toda la escructura
        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;
        } else if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2;
        } else if (variable_3 > variable_2 && variable_3 > variable_1) {
            big = variable_3;
        } 
        
        if (variable_1 < variable_2 && variable_1 < variable_3) {
            small = variable_1;
        } else if (variable_2 < variable_1 && variable_2 < variable_3) {
            small = variable_2;
        } else if (variable_3 < variable_2 && variable_3 < variable_1) {
            small = variable_3;
        }
        
        System.out.println("The biggest number is: " + big + " and the smallest number is: " + small);
    }
}
