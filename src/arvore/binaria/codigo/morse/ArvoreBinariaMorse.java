package arvore.binaria.codigo.morse;

public class ArvoreBinariaMorse {
    
    Node raiz;
    
    public ArvoreBinariaMorse(){
        this.raiz = null;
    }
    
    public void inicializar(){
        raiz = new Node("");
        raiz.setEstruturaCaractere("Start");
    }
    
    public void inserir(String codigo_morse, String caractere){
        String codigo_atual = "";

        raiz = preOrdem(raiz, codigo_morse, caractere, codigo_atual, 0);
        
    }
    
    public Node preOrdem(Node atual, String codigo_morse, String caractere, String codigo_atual, int posicao){
        if (atual != null){
            
            if (atual.getEstruturaCaractere().equals("") && codigo_atual.equals(codigo_morse))
                atual.setEstruturaCaractere(caractere);

           
            Node esquerda = preOrdem(atual.getEsquerda(), codigo_morse, caractere, codigo_atual + ".", posicao + 1);
            atual.setEsquerda(esquerda); 
            
            Node direita = preOrdem(atual.getDireita(), codigo_morse, caractere, codigo_atual + "-", posicao + 1);
            atual.setDireita(direita);
            
            return atual;
        } 
        
        if (posicao == 6){
            return null; 
        } else {
            atual = new Node(codigo_atual);
            
            if (codigo_atual.equals(codigo_morse)){
                atual.setEstruturaCaractere(caractere);
            } else {
               atual.setEstruturaCaractere("");
            }
            
            Node esquerda = preOrdem(atual.getEsquerda(), codigo_morse, caractere, codigo_atual + ".", posicao + 1);
            atual.setEsquerda(esquerda); 
            
            Node direita = preOrdem(atual.getDireita(), codigo_morse, caractere, codigo_atual + "-", posicao + 1);
            atual.setDireita(direita);
            
        }
        
        return atual;
    }
    
    public void imprimir(Node node){
        if (node != null){
            System.out.print(" " + node.getEstruturaCaractere());
            
            imprimir(node.getEsquerda());
            imprimir(node.getDireita());
        }
    }
}
