/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.tidexa.encontretelefone;

import javax.swing.JOptionPane;

/**
 *
 * @author Rosana Attrot
 */
public class EncontreTelefone {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite a expressão:");
        String numero = texto;
        
        Numero[] numeros = new Numero[8];
        numeros[0] = new Numero("abc", "2");
        numeros[1] = new Numero("def", "3");
        numeros[2] = new Numero("ghi", "4");
        numeros[3] = new Numero("jkl", "5");
        numeros[4] = new Numero("mno", "6");
        numeros[5] = new Numero("pqrs", "7");
        numeros[6] = new Numero("tuv", "8");
        numeros[7] = new Numero("wxyz", "9");
        for (Numero n : numeros) {
            numero = n.troca(numero);
        }
        
        JOptionPane.showMessageDialog(null, numero);
    }
}
