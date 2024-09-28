package arvore.binaria.codigo.morse;

import java.util.Scanner;


public class FormsArvoreBinariaCodigoMorse {

    final private ArvoreBinariaMorse arvoreBinariaMorse;
    
    public FormsArvoreBinariaCodigoMorse(ArvoreBinariaMorse arvoreBinariaMorse){
        this.arvoreBinariaMorse = arvoreBinariaMorse;
    }
    
    public void responder(){
            
       Scanner scanner = new Scanner(System.in);

       System.out.println("Árvore Binária de Código Morse");
       arvoreBinariaMorse.inicializarImpressao();

       System.out.println("Digite os itens da lista (digite '0' para imprimir):");
       int item;

       while (true) {
           System.out.println("1 - Buscar:");
           System.out.println("0 - Imprimir:");

           item = scanner.nextInt();

           switch (item){
               case 1 -> {
                 //Método buscar
                  break;
               }
               default -> {   
                System.out.println("Árvore Binária de Código Morse");
                arvoreBinariaMorse.inicializarImpressao();
               }
           }
       }
    }
}
