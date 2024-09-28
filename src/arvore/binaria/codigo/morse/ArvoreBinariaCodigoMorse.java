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
        
    String[][] alfabetoMorse = {
                //Alfabeto
                {"A", ".-"},   {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, 
                {"E", "."},    {"F", "..-."}, {"G", "--."},  {"H", "...."}, 
                {"I", ".."},   {"J", ".---"}, {"K", "-.-"},  {"L", ".-.."}, 
                {"M", "--"},   {"N", "-."},   {"O", "---"},  {"P", ".--."}, 
                {"Q", "--.-"}, {"R", ".-."},  {"S", "..."},  {"T", "-"}, 
                {"U", "..-"},  {"V", "...-"}, {"W", ".--"},  {"X", "-..-"}, 
                {"Y", "-.--"}, {"Z", "--.."},
                // Números
                {"0", "-----"},{"1", ".----"},{"2", "..---"},{"3", "...--"},
                {"4", "....-"},{"5", "....."},{"6", "-...."},{"7", "--..."},
                {"8", "---.."},{"9", "----."}
            };

        ArvoreBinariaMorse arvoreBinariaMorse = new ArvoreBinariaMorse();
        arvoreBinariaMorse.inicializar();
        
        // Exibindo o array lado a lado
        for (String[] item : alfabetoMorse) {
            arvoreBinariaMorse.inserir(item[1], item[0]);
        }
        
        arvoreBinariaMorse.inicializarImpressao();
        
        FormsArvoreBinariaCodigoMorse formsArvoreBinariaCodigoMorse = 
                new FormsArvoreBinariaCodigoMorse(arvoreBinariaMorse);
        
        //Inicia o loop do forms
        formsArvoreBinariaCodigoMorse.responder();
    }
    
}
