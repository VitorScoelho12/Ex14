
package com.mycompany.ex14;

import javax.swing.JOptionPane;


public class Ex14 {

    public static void main(String[] args) {
        int ano1, ano2, idade;
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        ano2 = 2025;
        idade = ano2 - ano1;
        
        if(ano2 >= ano1){
            JOptionPane.showMessageDialog(null,"A IDADE É REAL, E VALE: " + idade);
        }else{
            JOptionPane.showMessageDialog(null,"A IDADE NÃO EXISTE.");
        
            
        }
    }
}
