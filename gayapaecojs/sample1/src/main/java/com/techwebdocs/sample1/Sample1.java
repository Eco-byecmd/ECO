
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.sample1;

/**
 *
 * @author ludwi
 */
import java.util.Scanner;
public class Sample1 {

    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
            System.out.println("Full Name:");
            String name = read.nextLine();
            System.out.println("Age:");
            int age = read.nextInt();
            read.nextLine();
            System.out.println("Sex(Male/Female):");
            String sex = read.nextLine();
            if (sex.equalsIgnoreCase("Male")) {
                System.out.println("Nice meeting you! Mr. " + name + ", " + age);
            } else if (sex.equalsIgnoreCase("Female")) {
                System.out.println("Nice meeting you! Ms. " + name + ", " + age);
            }
        }
}


