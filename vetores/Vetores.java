/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author alanhidra
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        int vetor[] = new int[n];
        
        for (int i = 0; i < vetor.length; ++i) {//alimentar vetor
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " ∞ valor do vetor:"));

        }
        for (int i = 0; i < n; ++i) {//Imprimir em sua ordem conforme foram digitados
            System.out.println("N˙meros conforme foram digitados: " + vetor[i]);
        }
        
        for(int i = vetor.length-1; i >= 0; i--){//Imprimir Ordem Inversa
            System.out.println("N˙meros conforme foram digitados em ordem inversa: "+vetor[i]);   
       
    }
    
    }}
