package arvore.binaria.codigo.morse;

public class Node {
    
    final private Estrutura estrutura;
    private Node esquerdo;
    private Node direito;
    
    //Nó com a estrutura (caractere e código morse, subárvore a esquerda, subárvore a direita)
    public Node(String simbolo){
        this.estrutura = new Estrutura(simbolo);
        this.esquerdo = null;
        this.direito = null;
    }
    
    //Altera o caractere
    public void setEstruturaCaractere(String caractere){
        estrutura.setCaractere(caractere);    
    }
    
    //Retorna o caractere
    public String getEstruturaCaractere(){
        return estrutura.getCaratere();    
    }
    
    //Altera o código
    public void setEstruturaSimbolo(String simbolo){
        estrutura.setSimbolo(simbolo);    
    }
    
    //Retorna o código
    public String getEstruturaSimbolo(){
        return estrutura.getSimbolo();    
    }
    
    //Retorna a subárvore da esquerda
    public Node getEsquerda(){
        return esquerdo;
    }
    
    //Altera a subárvore da esquerda
    public void setEsquerda(Node node){
        esquerdo = node;
    }
    
    //Retorna a subárvore da direita   
    public Node getDireita(){
        return direito;
    }
    
    //Altera a subárvore da direita
    public void setDireita(Node node){
        direito = node;
    }
}
