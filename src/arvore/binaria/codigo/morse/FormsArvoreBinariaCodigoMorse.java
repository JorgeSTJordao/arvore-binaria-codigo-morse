package arvore.binaria.codigo.morse;

import java.util.Scanner;


public class FormsArvoreBinariaCodigoMorse {

    final private ArvoreBinariaMorse arvoreBinariaMorse;
    
    public FormsArvoreBinariaCodigoMorse(ArvoreBinariaMorse arvoreBinariaMorse){
        this.arvoreBinariaMorse = arvoreBinariaMorse;
    }
    
    public void responder() {
        int item;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Árvore Binária de Código Morse");
        arvoreBinariaMorse.inicializarImpressao();
        System.out.println("------------------------");

        System.out.println("Digite os itens da lista (digite '0' para imprimir):");
    

        while (true) {
            System.out.println("1 - Buscar:");
            System.out.println("0 - Imprimir:");

            item = scanner.nextInt();
            scanner.nextLine();  // Para consumir a nova linha

            switch (item) {
                case 1 -> {
                    System.out.println("Digite o código Morse (separado por espaços para cada letra):");

                    String codigoMorse = scanner.nextLine();

                    String[] letrasMorse = codigoMorse.split(" ");

                    StringBuilder resultado = new StringBuilder();

                    for (String letraMorse : letrasMorse) {
                        String letra = arvoreBinariaMorse.buscar(letraMorse);
                        if (letra != null && !letra.equals("...")) {
                            resultado.append(letra);
                        } else {
                            resultado.append('?'); // Se o código morse não for encontrado, coloca um '?'
                        }
                    }

                    System.out.println("Tradução: " + resultado.toString());
                    
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