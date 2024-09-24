package arvore.binaria.codigo.morse;

public class Estrutura {
    
    private String caractere;
    private String simbolo;
    
    public Estrutura(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getCaratere(){
        return caractere;
    }
    
    public void setCaractere(String caractere){
        this.caractere = caractere;
    }
    
        public String getSimbolo(){
        return simbolo;
    }
    
    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }
}

