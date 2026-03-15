/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labactivity2st10503964;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class LABACTIVITY2st10503964 {

    public static void main(String[] args) {
        // propting the user with joptionpane to select two numbers
        int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first Number/Interger"));
        int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Number/Interger"));
        
        //Using Operators to compare two number and output a true or false to CLI and Joption
        JOptionPane.showMessageDialog(null,"(" + Num1 + ">" + Num2 + ")" + "=" + (Num1 > Num2), "Greater Than?",1);
        System.out.println("(" + Num1 + ">" + Num2 + ")" + "=" + (Num1 > Num2));
        
        JOptionPane.showMessageDialog(null,"(" + Num1 + "<" + Num2 + ")" + "=" + (Num1 < Num2), "Less Than?",1);
        System.out.println("(" + Num1 + "<" + Num2 + ")" + "=" + (Num1 < Num2));
        
        JOptionPane.showMessageDialog(null,"(" + Num1 + ">=" + Num2 + ")" + "=" + (Num1 >= Num2), "Greater or Equal To" ,1);
        System.out.println("(" + Num1 + ">=" + Num2 + ")" + "=" + (Num1 >= Num2));
        
        JOptionPane.showMessageDialog(null,"(" + Num1 + "<=" + Num2 + ")" + "=" + (Num1 <= Num2), "Less or Equal To" ,1);
        System.out.println("(" + Num1 + "<=" + Num2 + ")" + "=" + (Num1 <= Num2));
        
        JOptionPane.showMessageDialog(null,"(" + Num1 + "!=" + Num2 + ")" + "=" + (Num1 != Num2), "Not Equal To" ,2);
        System.out.println("(" + Num1 + "!=" + Num2 + ")" + "=" + (Num1 != Num2));
        
        JOptionPane.showMessageDialog(null,"(" + Num1 + "==" + Num2 + ")" + "=" + (Num1 == Num2), "Equivelent" ,1);
        System.out.println("(" + Num1 + "==" + Num2 + ")" + "=" + (Num1 == Num2));
        
        
        
        
        
        
    }
}
