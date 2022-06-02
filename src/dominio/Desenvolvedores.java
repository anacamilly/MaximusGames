package dominio;

//Encapsulamento
public class Desenvolvedores {
    private String nomeDesenvolvedor;
    private int idDesenvolvedor;
    private String localDesenvolvedor;

    public Desenvolvedores() {
        
    }
    
    //Construtores
    public Desenvolvedores( int idDesenvolvedor, String nomeDesenvolvedor, String localDesenvolvedor) {
        this.idDesenvolvedor = idDesenvolvedor;
    	this.nomeDesenvolvedor = nomeDesenvolvedor;
        this.localDesenvolvedor = localDesenvolvedor;
    }
    
    //M�todos Acessores e Modificadores
    public String getNomeDesenvolvedor() {
        return nomeDesenvolvedor;
    }
    public void setNomeDesenvolvedor(String nomeDesenvolvedor) {
        this.nomeDesenvolvedor = nomeDesenvolvedor;
    }
    public int getidDesenvolvedor() {
        return idDesenvolvedor;
    }
    public void setidDesenvolvedor(int idDesenvolvedor) {
        this.idDesenvolvedor = idDesenvolvedor;
    }
    public String getLocalDesenvolvedor() {
        return localDesenvolvedor;
    }
    public void setLocalDesenvolvedor(String localDesenvolvedor) {
        this.localDesenvolvedor = localDesenvolvedor;
    } 
}