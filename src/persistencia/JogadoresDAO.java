package persistencia;

import dominio.Jogadores;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JogadoresDAO {
    private Conexao minhaConexao = new Conexao();
    private final String BUSCAR = "select * from tb_jogadores where idJogador=?";
    private final String INCLUIR = "insert into tb_jogadores  ( nomeJogador, emailJogador, nacionalidadeJogador, senhaJogador, categoriaFavJogador, generoJogador) values (?,?,?,?,?,?)";
    private final String EXCLUIR = "delete * from tb_jogadores where idJogador=?";
    private final String ALTERAR = "update tb_jogadores set nomeJogador=?, emailJogador=?, nacionalidadeJogador=?, senhaJogador=?"
            +  " categoriaFavJogador=?, generoJogador=? where idJogador=?" ;

  public JogadoresDAO (){
      minhaConexao = new Conexao();
  }
  
  public Jogadores buscar(int idJogador){
       Jogadores jogadores = null;
       
      try{
          minhaConexao.conectar();
         //PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(BUSCAR);
          Statement statement = minhaConexao.getConexao().createStatement();
          //instrucao.setInt(1, idJogador);
          //ResultSet rs = instrucao.executeQuery();
          ResultSet rs = statement.executeQuery("select * from tb_jogadores where idJogador=" + idJogador);
          if(rs.next()){
              jogadores = new Jogadores (rs.getInt("idJogador"),  rs.getString("nomeJogador"), 
          		  	rs.getString("nacionalidadeJogador"),
            		  rs.getString("generoJogador"),
                        rs.getString("emailJogador"), rs.getString("senhaJogador"),
                        rs.getString("categoriaFavJogador"));
          }
          minhaConexao.desconectar();
        
      }catch(SQLException e){
          System.out.println("Erro na Busca: " + e.getMessage());
      }
      return jogadores;
   }
      
  public void incluir(Jogadores jogadores){
      try{
    	  
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(INCLUIR);
          //instrucao.setInt(1, jogadores.getIdJogador());
          instrucao.setString(1, jogadores.getNomeJogador());
          instrucao.setString(2, jogadores.getEmailJogador());
          instrucao.setString(3, jogadores.getNacionalidadeJogador());
          instrucao.setString(4, jogadores.getSenhaJogador());
          instrucao.setString(5, jogadores.getCategoriaFavJogador());
          instrucao.setString(6, jogadores.getGeneroJogador());

          instrucao.execute();
          minhaConexao.desconectar();
      } catch (Exception e){
          System.out.println("Erro na inclusão: " + e.getMessage());
      }
  }
  
  public void excluir(int idJogador){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement("delete from tb_jogadores where idJogador=?");
          instrucao.setInt(1, idJogador);
          instrucao.executeUpdate();
          minhaConexao.desconectar();
      } catch (SQLException e){
          System.out.println("Erro na exclusão: " + e.getMessage());
      }
  }
  
  public void alterar(Jogadores j, String idJogador){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(ALTERAR);
          instrucao.setString(1, j.getNomeJogador());
          instrucao.setString(2, j.getEmailJogador());
          instrucao.setString(3, j.getNacionalidadeJogador());
          instrucao.setString(4, j.getSenhaJogador());
          instrucao.setString(5, j.getCategoriaFavJogador());
          instrucao.setString(6, j.getGeneroJogador());
          instrucao.setString(7, idJogador);
          instrucao.executeUpdate();
          minhaConexao.desconectar();
      } catch (SQLException e){
          System.out.println("Erro na alteracão de Jogadores: " + e.getMessage());
      }
  }

}
