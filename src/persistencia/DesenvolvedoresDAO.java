package persistencia;

import dominio.Desenvolvedores;
import dominio.Jogadores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DesenvolvedoresDAO {
    private Conexao minhaConexao = new Conexao();
    private final String BUSCAR = "select * from tb_desenvolvedores where idDesenvolvedor=?";
    private final String INCLUIR = "insert into tb_desenvolvedores  ( nomeDesenvolvedor, localDesenvolvedor) values (?,?)";
    private final String EXCLUIR = "delete * from tb_desenvolvedores where idDesenvolvedor=?";
    private final String ALTERAR = "update tb_desenvolvedores set nomeDesenvolvedor=?, localDesenvolvedor=? where idDesenvolvedor=?";

    public DesenvolvedoresDAO(){
      minhaConexao = new Conexao();
    }
  
    public Desenvolvedores buscar(int idDesenvolvedor){
        Desenvolvedores desenvolvedores = null;
/*try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(BUSCAR);
          instrucao.setInt(1, idDesenvolvedor);
          ResultSet rs = instrucao.executeQuery();
          if(rs.next()){
              desenvolvedores = new Desenvolvedores (rs.getString("nomeDesenvolvedor"), rs.getInt("idDesenvolvedor"),
                        rs.getString("localDesenvolvedor"));
          }
          minhaConexao.desconectar();*/
     
          try{
              minhaConexao.conectar();
             //PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(BUSCAR);
              Statement statement = minhaConexao.getConexao().createStatement();
              //instrucao.setInt(1, idJogador);
              //ResultSet rs = instrucao.executeQuery();
              ResultSet rs = statement.executeQuery("select * from tb_desenvolvedores where idDesenvolvedor=" + idDesenvolvedor);
              if(rs.next()){
                  desenvolvedores = new Desenvolvedores  (rs.getInt("idDesenvolvedor"), rs.getString("nomeDesenvolvedor"), rs.getString("localDesenvolvedor"));
              }
              
      }catch(SQLException e){
          System.out.println("Erro na Busca: " + e.getMessage());
      }
      return desenvolvedores;
   }
      
  public void incluir(Desenvolvedores desenvolvedores){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(INCLUIR);
          //instrucao.setInt(1, desenvolvedores.getidDesenvolvedor());
          instrucao.setString(1, desenvolvedores.getNomeDesenvolvedor());
          instrucao.setString(2, desenvolvedores.getLocalDesenvolvedor());
          instrucao.execute();
          minhaConexao.desconectar();
      } catch (Exception e){
          System.out.println("Erro na inclusão: " + e.getMessage());
      }
  }
  
  public void excluir(int idDesenvolvedor){
      try{
          minhaConexao.conectar();
          
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement("delete from tb_desenvolvedores where idDesenvolvedor=?");
          instrucao.setInt(1, idDesenvolvedor);
          instrucao.executeUpdate();
          
          /*PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(EXCLUIR);
          instrucao.setInt(1, idDesenvolvedor);
          instrucao.executeUpdate();*/
          minhaConexao.desconectar();
      } catch (SQLException e){
          //System.out.println("Erro na exclusão: " + e.getMessage());
      }
  }
  
  public void alterar(Desenvolvedores d, String idDesenvolvedor){
      try{
          minhaConexao.conectar();
          PreparedStatement instrucao = 
                  minhaConexao.getConexao().prepareStatement(ALTERAR);
          instrucao.setString(1, d.getNomeDesenvolvedor());
          instrucao.setString(2, d.getLocalDesenvolvedor());
          instrucao.setString(3, idDesenvolvedor);
          instrucao.executeUpdate();
          minhaConexao.desconectar();
      } catch (SQLException e){
          System.out.println("Erro na alteracão de Game: " + e.getMessage());
      }
  }

}
