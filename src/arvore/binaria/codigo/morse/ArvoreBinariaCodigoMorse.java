package arvore.binaria.codigo.morse;

public class ArvoreBinariaCodigoMorse {

    public static void main(String[] args) {
        /*A árvore é formado pelo código morse
        Cada nó tem o símbolo e a letra
        A cada momento que percorre um nó, se ele não existe, então apenas...
        insere o símbolo. Quando o símbolo for igual ao da letra durante o...
        momento de prepopulação da árvore, então armazenamos a letra.
        Para evitar um loop infinito, isso será correspondente ao tamanho
        */
        
        ArvoreBinariaMorse arvoreBinariaMorse = new ArvoreBinariaMorse();
        arvoreBinariaMorse.inicializar();
        
        arvoreBinariaMorse.inserir(".", "E");
        arvoreBinariaMorse.inserir("-", "T");
        arvoreBinariaMorse.inserir("..", "I");
        arvoreBinariaMorse.inserir(".-", "A");
        arvoreBinariaMorse.inserir("-.", "N");
        arvoreBinariaMorse.inserir("--", "M");
        arvoreBinariaMorse.imprimir(arvoreBinariaMorse.raiz);
        
    }
    
}
