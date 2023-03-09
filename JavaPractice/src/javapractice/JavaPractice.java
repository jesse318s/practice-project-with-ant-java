/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

import javapractice2.Hello6;

/**
 *
 * @author jesse
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // create hello object
        Hello5 hello = new Hello5();
        // use hello object to print classNumber
        hello.getClassNumber();
        // create outside package object    
        Hello6 hello6 = new Hello6();
        // use outside package object to print isHello and packageNumber
        hello6.getIsHello();
    }

    public static class Hello5 {

        private static int classNumber = 5;

        public void getClassNumber() {
            System.out.println("classNumber: " + classNumber);
        }
    }

}
