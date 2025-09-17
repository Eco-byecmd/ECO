/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.sample2;

/**
 *
 * @author ludwi
 */

public class Sample2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }  Scanner read = new Scanner(System.in);
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
                Systenm.out.println("Nice meeting you! Ms. " + name + ", " + age);
            }
        }
}
