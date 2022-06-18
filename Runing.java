/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp04;

/*Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/

import static java.lang.System.out;


public class Runing {
    public static void main(String[] args) {
        Data data = new Data();
        
        out.println("Data: " + data.Mostra1());
        out.println("Data: " + data.Mostra2());
        
        if (data.Bissexto(data.getAno()))
            out.println("O ano é bissexto");
        else
            out.println("O ano não é bissexto");
        
        out.println("Dias Transcorridos: " + data.DiasTranscorridos());
        data.ApresentaData();
    }    
}