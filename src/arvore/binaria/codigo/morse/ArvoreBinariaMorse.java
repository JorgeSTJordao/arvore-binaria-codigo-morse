package arvore.binaria.codigo.morse;

public class ArvoreBinariaMorse {
    
    Node raiz;
    
    public ArvoreBinariaMorse(){
        this.raiz = null;
    }
    
    //Inicializa o nó raiz
    public void inicializar(){
        raiz = new Node("");
        raiz.setEstruturaCaractere("Start");
    }
    
    //Inserir um item na árvore
    public void inserir(String codigo_morse, String caractere){
        String codigoAtual = "";

        //Utilizamos a pré-ordem (raiz, subárvore da esquerda, subárvore da direita)
        //O nível máximo da árvore inicia em 0 (raiz)
        raiz = preOrdem(raiz, codigo_morse, caractere, codigoAtual, 0);
        
    }
    
    //O código atual corresponde ao código criado no momento 
    private Node preOrdem(Node atual, String codigo_morse, String caractere, String codigoAtual, int nivel){
        //Verifica se o nó é diferente de nulo
        if (atual != null){
            
            //Caso não seja, mas o código é o mesmo no nó, então acrescentamos o caractere no interior
            //da estrutura de dados
            if (atual.getEstruturaCaractere().equals("...") && codigoAtual.equals(codigo_morse))
                atual.setEstruturaCaractere(caractere);

           
            //Seguimos fazendo a mesma estrutura de percorrer a árvore até o nível 6
            
            Node esquerda = preOrdem(atual.getEsquerda(), codigo_morse, caractere, codigoAtual + ".", nivel + 1);
            atual.setEsquerda(esquerda); 
            
            Node direita = preOrdem(atual.getDireita(), codigo_morse, caractere, codigoAtual + "-", nivel + 1);
            atual.setDireita(direita);
            
            return atual;
        } 
        
        //Se o nível for 6, o nó não existe e será nulo
        if (nivel == 6){
            return null; 
        //Caso contrário será gerado um novo
        } else {
            atual = new Node(codigoAtual);
            
            //Fazemos a verificação se o código é o mesmo e logo acrescentamos
            if (codigoAtual.equals(codigo_morse)){
                atual.setEstruturaCaractere(caractere);
            } else {
               atual.setEstruturaCaractere("...");
            }
            
            Node esquerda = preOrdem(atual.getEsquerda(), codigo_morse, caractere, codigoAtual + ".", nivel + 1);
            atual.setEsquerda(esquerda); 
            
            Node direita = preOrdem(atual.getDireita(), codigo_morse, caractere, codigoAtual + "-", nivel + 1);
            atual.setDireita(direita);
            
        }
        
        //Quando terminado, também retorna um nó e quando o nível 6 ainda não foi atingido
        return atual;
    }
    
    //Para mostrar os nós de espaço vazio (...), mostramos também os nós sem caractere
    //Para cada ida acrescentamos um sinal "-"
    public void inicializarImpressao(){
        imprimir(raiz, "");
    }
    
    private void imprimir(Node node, String espaco){
        if (node != null){
            System.out.println("|" + espaco + node.getEstruturaCaractere());

            imprimir(node.getEsquerda(), espaco + "-");
            imprimir(node.getDireita(), espaco + "-");
        }
    }
}
