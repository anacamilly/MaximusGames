package dominio;

//Encapsulamento
public class Game {
    private String nomeGame;
    private int idGame;
    private int faixaEtariaGame;
    //private int dataLancamentoGame;
    private String  categoriaGame;

    public Game() {
        
    }
    
    //Construtores
    public Game( int idGame, String nomeGame, String categoriaGame,  int faixaEtariaGame) { 
        this.nomeGame = nomeGame;
        this.idGame = idGame;
        this.faixaEtariaGame = faixaEtariaGame;
        //this.dataLancamentoGame = dataLancamentoGame;
        this.categoriaGame = categoriaGame;
    }
    public Game(String nomeGame, int faixaEtariaGame,  String categoriaGame ) { 
        this.nomeGame = nomeGame;
        this.faixaEtariaGame = faixaEtariaGame;
        //this.dataLancamentoGame = dataLancamentoGame;
        this.categoriaGame = categoriaGame;
    }

    //M�todos Acessores e Modificadores
    public String getNomeGame() {
        return nomeGame;
    }
    public void setNomeGame(String nomeGame) {
        this.nomeGame = nomeGame;
    }
    public int getidGame() {
        return idGame;
    }
    public void setidGame(int idGame) {
        this.idGame = idGame;
    }
    public int getFaixaEtariaGame() {
        return faixaEtariaGame;
    }
    public void setFaixaEtariaGame(int faixaEtariaGame) {
        this.faixaEtariaGame = faixaEtariaGame;
    }
    /*public int getDataLancamentoGame() {
        return dataLancamentoGame;
    }
    public void setDataLancamentoGame(int dataLancamentoGame) {
        this.dataLancamentoGame = dataLancamentoGame;
    }*/
    public String getCategoriaGame() {
        return categoriaGame;
    }
    public void setCategoriaGame(String categoriaGame) {
        this.categoriaGame = categoriaGame;
    }
    
}