/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.tp04;

/*Crie a classe Data conforme especificado abaixo:

Data
- dia: int
- mes: int
- ano: int
+ Data()
+ Data(int d, int m, int a)
+ entraDia(int d)
+ entraMes(int m)
+ entraAno(int a)
+ entraDia()
+ entraMes()
+ entraAno()
+ retDia(): int
+ retMes(): int
+ retAno(): int
+ mostra1(): String
+ mostra2(): String
+ bissexto(): boolean
+ diasTranscorridos(): int
+ apresentaDataAtual ():void

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/

import static java.lang.System.out;
import java.text.DateFormat;
import static java.text.DateFormat.getDateInstance;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private static int dia, mes, ano;
    private Scanner scan = new Scanner(System.in);
    private String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        dia = d;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        mes = m;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        ano = a;
    }
    
    Data(){     
        int d, m, a;
        
        try{
            do {
                out.print("Informe o ano: ");
                a = scan.nextInt();            
            } while (a < 0);

            if(Bissexto(a))
                dias[1] = 29;

            do {
                out.print("Informe o mês: ");
                m = scan.nextInt();            
            } while (m < 0 || m > 12);

            do{
                out.print("Informe o dia (<= " + dias[m - 1] + "): ");
                d = scan.nextInt();
            }while (d < 1 || d > dias[m - 1]);
            
            new Data(d, m, a);
        }
        catch(Exception e){
            out.println("Erro\n" + e.getMessage());
        }
    }
    
    Data(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAno(a);
    }
    
    public String Mostra1(){
        String ret;
        
        ret = String.format("%02d", getDia()) + "/" + String.format("%02d", getMes()) + "/" + getAno();
        
        return ret;
    }
    
    public String Mostra2(){
        String ret;
        
        ret = String.format("%02d", getDia()) + "/" + meses[getMes() - 1] + "/" + getAno();
        
        return ret;
    }
    
    boolean Bissexto(int ano){
        if((ano%4 == 0 && ano%100 != 0) || (ano%4 != 0 && ano%400 == 0))
            return true;
        else
            return false;
    }
    
    public int DiasTranscorridos(){
        int ret = 0, i = 0;
        
        while(i < getMes() - 1){
            ret += dias[i];
            i++;
        }
        
        ret += getDia();
        
        return ret;
    }
    
    public void ApresentaData(){
        out.println("Data Atual: " + getDateInstance(DateFormat.FULL).format(new Date()));
    }
}
