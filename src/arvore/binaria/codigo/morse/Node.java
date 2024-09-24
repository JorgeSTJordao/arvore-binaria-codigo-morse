package arvore.binaria.codigo.morse;

public class Node {
    
    final private Estrutura estrutura;
    private Node esquerdo;
    private Node direito;
    
    public Node(String simbolo){
        this.estrutura = new Estrutura(simbolo);
        this.esquerdo = null;
        this.direito = null;
    }
    
    public void setEstruturaCaractere(String caractere){
        estrutura.setCaractere(caractere);    
    }
    
    public String getEstruturaCaractere(){
        return estrutura.getCaratere();    
    }
    
    public void setEstruturaSimbolo(String simbolo){
        estrutura.setSimbolo(simbolo);    
    }
    
    public String getEstruturaSimbolo(){
        return estrutura.getSimbolo();    
    }
    
    public Node getEsquerda(){
        return esquerdo;
    }
    
    public void setEsquerda(Node node){
        esquerdo = node;
    }
    
    public Node getDireita(){
        return direito;
    }
    public void setDireita(Node node){
        direito = node;
    }
}
