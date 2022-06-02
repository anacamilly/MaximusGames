package dominio;

//Encapsulamento
public class Jogadores{ //heran�a
    private int idJogador;
    private String nomeJogador;
    private String nacionalidadeJogador;
    private String emailJogador;
    private String senhaJogador;
    private String categoriaFavJogador;
    private String generoJogador;


    public Jogadores(){
    
    }
    
    public Jogadores(int idJogador, String nomeJogador, String generoJogador, String nacionalidadeJogador, String emailJogador, String senhaJogador, String categoriaFavJogador) {
        this.idJogador = idJogador;
        this.nomeJogador = nomeJogador;
        this.generoJogador = generoJogador;
        this.nacionalidadeJogador = nacionalidadeJogador;
        this.emailJogador = emailJogador;
        this.senhaJogador = senhaJogador;
        this.categoriaFavJogador = categoriaFavJogador;
    }
    public Jogadores( String nomeJogador, String generoJogador, String nacionalidadeJogador,  String emailJogador, String senhaJogador, String categoriaFavJogador) {
        this.nomeJogador = nomeJogador;
        this.generoJogador = generoJogador;
        this.nacionalidadeJogador = nacionalidadeJogador;
        this.emailJogador = emailJogador;
        this.senhaJogador = senhaJogador;
        this.categoriaFavJogador = categoriaFavJogador;
    }
    
    //M�todos Acessores e Modificadores
    public int getIdJogador() {
    	return idJogador;
    }
    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }
    	
    public String getNomeJogador() {
    	return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    	
    public String getNacionalidadeJogador() {
     	return nacionalidadeJogador;
    }
    public void setNacionalidadeJogador(String nacionalidadeJogador) {
        this.nacionalidadeJogador = nacionalidadeJogador;
    }
    public String getEmailJogador() {
        return emailJogador;
    }
    public void setEmailJogador(String emailJogador) {
        this.emailJogador = emailJogador;
    }
    public String getSenhaJogador() {
       	return senhaJogador;
    }
    public void setSenhaJogador(String senhaJogador) {
        this.senhaJogador = senhaJogador;
    }
    public String getCategoriaFavJogador() {
        return categoriaFavJogador;
    }
    public void setCategoriaFavJogador(String categoriaFavJogador) {
        this.categoriaFavJogador = categoriaFavJogador;
    }
    public String getGeneroJogador() {
        return generoJogador;
    }
    public void setGeneroJogador(String generoJogador) {
        this.generoJogador = generoJogador;
    }
}













