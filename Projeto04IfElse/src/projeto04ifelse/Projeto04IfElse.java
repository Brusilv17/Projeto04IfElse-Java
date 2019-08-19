/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto04ifelse;

/**
 *
 * @author mathe
 */
public class Projeto04IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
            if (condicao){
                //codigo
            }else{
                //codigo
            }
         */
        int idade = 30;

        if (idade < 18) {
            System.out.println("Menor idade!");
        } else {
            System.out.println("MAior idade!");
        }

        //operadores logicos E && OU ||
        boolean amigoDoDono = true;

        // negação !
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Menor Idade, entrada proibida.");
        } else {
            System.out.println("Maior Idade, pode entrar.");
        }
        
        // IGUALDADE
        int mes = 1;
        if(mes == 1){
            System.out.println("Janeiro");
        }else{
            System.out.println("Tempo de trabalha");
        }
    }
}
