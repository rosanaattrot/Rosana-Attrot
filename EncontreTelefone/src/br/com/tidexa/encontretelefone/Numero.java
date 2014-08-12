/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.tidexa.encontretelefone;

/**
 *
 * @author Rosana Attrot
 */
public class Numero {

        private String letras;
        private String numero;

        public Numero(String letras, String numero) {
            this.letras = letras;
            this.numero = numero;
        }

        String troca(String num) {
            for (int i = 0; i < letras.length(); i++) {
                num = num.replace(String.valueOf(letras.charAt(i)), numero);
            }
            return num;
        }

    }

