package persistencia;

import dominio.Game;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameDAO {
    private Conexao minhaConexao = new Conexao();
    private final String BUSCAR = "select * from tb_games where idGame=?";
    private final String INCLUIR = "insert into tb_games  ( nomeGame, categoriaGame,  faixaEtariaGame) values (?,?,?)";
    //private final String EXCLUIR = "delete * from tb_games where idGame=?";
    private final String ALTERAR = "update tb_games set nomeGame=?, categoriaGame=?, faixaEtariaGame=? where idGame=?";

    public GameDAO(){
    	minhaConexao = new Conexao();
    }
    
   public Game buscar(int idGame){
       Game game = null;
       
      /*try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(BUSCAR);
          instrucao.setInt(1, idGame);
          ResultSet rs = instrucao.executeQuery();
          if(rs.next()){
              game = new Game(rs.getString("nomeGame"), rs.getInt("idGame"), rs.getInt("faixaEtariaGame"),
                       rs.getString("categoriaGame"));
          }*/
       
       try{
           minhaConexao.conectar();
           //PreparedStatement instrucao =  minhaConexao.getConexao().prepareStatement(BUSCAR);
           //instrucao.setInt(1, idGame);
           Statement statement = minhaConexao.getConexao().createStatement();
           //ResultSet rs = instrucao.executeQuery();
           ResultSet rs = statement.executeQuery("select * from tb_games where idGame=" + idGame);
           if(rs.next()){
               game = new Game( rs.getInt("idGame"), rs.getString("nomeGame"),rs.getString("categoriaGame"),
               rs.getInt("faixaEtariaGame"));
               }
       
          minhaConexao.desconectar();
        
      }catch(SQLException e){
          System.out.println("Erro na Busca: " + e.getMessage());
      }
      return game;
   }
      
  public void incluir(Game game){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(INCLUIR);
          //instrucao.setInt(1, game.getidGame());
          instrucao.setString(1, game.getNomeGame());
          //instrucao.setInt(3, game.getDataLancamentoGame());
          instrucao.setString(2, game.getCategoriaGame());
          instrucao.setInt(3, game.getFaixaEtariaGame());
          instrucao.execute();
          minhaConexao.desconectar();
      } catch (Exception e){
          System.out.println("Erro na inclusão de Game: " + e.getMessage());
      }
  }
  
  public void excluir(int idGame){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement("delete from tb_games where idGame=?");
          instrucao.setInt(1, idGame);
          instrucao.executeUpdate();
          minhaConexao.desconectar();
      } catch (SQLException e){
          System.out.println("Erro na exclusão de Game: " + e.getMessage());
      }
  }
  
  public void alterar(Game g, String idGame){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(ALTERAR);
          instrucao.setString(1, g.getNomeGame());
          instrucao.setString(2, g.getCategoriaGame());
          instrucao.setInt(3, g.getFaixaEtariaGame());
          instrucao.setString(4, idGame);
          instrucao.executeUpdate();
          minhaConexao.desconectar();
      } catch (SQLException e){
          System.out.println("Erro na alteração de Game: " + e.getMessage());
      }
  }
  

}
