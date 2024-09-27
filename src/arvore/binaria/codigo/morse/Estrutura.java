package arvore.binaria.codigo.morse;

public class Estrutura {
    
    private String caractere;
    private String simbolo;
    
    //Estrutura de dados do nó
    public Estrutura(String simbolo){
        this.simbolo = simbolo;
    }
    
    //Retorna o caractere
    public String getCaratere(){
        return caractere;
    }
    
    //Altera o caractere
    public void setCaractere(String caractere){
        this.caractere = caractere;
    }
    
    //Retorna o código 
    public String getSimbolo(){
        return simbolo;
    }
    
    //Altera o código
    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }
}

