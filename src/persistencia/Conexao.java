package persistencia;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {
  private static final String user = "root";
  private static final String senha = "#MILLA2003";
  private static final String caminho = "jdbc:mysql://localhost:3306/MaximusGamesPOO";
  static Connection connection;

public Connection conectar(){
    try{
        connection = DriverManager.getConnection(caminho, user, senha);
        System.out.println ("Conex„o Efetuada!");
        
    } catch(SQLException e){
        
        System.out.println("Erro na conex√£o: "+ e.getMessage());
    } 
    return connection;
}
    public void desconectar(){
        try{
            connection.close();
        
        }catch (SQLException ex){
            System.err.println(ex);
            ex.printStackTrace();
    }
}
    public Connection getConexao(){
        return connection;
    }
}