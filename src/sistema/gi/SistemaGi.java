/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.gi;
import java.util.Scanner;

/**
 *
 * @author brasa
 */
public class SistemaGi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        int o;
        double d;
        
        Scanner ler = new Scanner(System.in);
        
        //Entrada1 
        System.out.println("Escolha a opcao:\n 1: Calcular quanto voce precisa tirar na AP2.\n 2: Calcular media (AP1+AP2).");
        o = ler.nextInt();
        
        //Processamento1 
        
        while (o  >= 3){
            
            System.out.println("\nOpcao invalida.\nTente novamente:\n");  
         System.out.println("Escolha a opcao:\n 1: Calcular quanto voce precisa tirar na AP2.\n 2: Calcular media (AP1+AP2).");
         o = ler.nextInt();
        }
        
        //Processamento2
        if(o==1){
        
        System.out.println("Digite sua nota da AP1:");
        x = ler.nextDouble(); 
        
     
        if (x >10){
        
        System.out.println("Para de graca bobona");
        
        } else{  
        
        double ap1 = x*2;
        double y = 30-ap1;
        double ap2 = y/3;
        double pesoap1 = ap1/5;
        double pesoap2 = ap2*3/5;
        
        //Saida 1
        
        
        System.out.printf("O peso da sua AP1 foi: %.2f\n", pesoap1);
        System.out.printf("Voce precisa tirar %.2f na sua AP2\n", ap2);
        System.out.printf("O peso da sua AP2 vai ser: %.2f\n", pesoap2);
          } 
        
        //Entrada2
        
        }else if (o==2){
        
        System.out.println("Digite sua nota da AP1:");
        x = ler.nextDouble(); 
         
        System.out.println("Digite sua nota da AP:");
        d = ler.nextDouble(); 
        
        //Processamento2
        
        if (x >10||d >10){
        
        System.out.println("Para de graca bobona");
        
        } else{
             
        double AP1 = x*2;     
        double AP2 = d*3;
        double Res = (AP1 + AP2)/5;
        
        //Saida2
        
       
        System.out.printf("Sua nota final vai ser: %.2f\n", Res);
        if (Res >= 6){
            System.out.println("Parabens, voce passou!!");    
            
        }else{
            System.out.println("Reprovada :(");
            
             }
           }
          }
         }
    
    }
    

