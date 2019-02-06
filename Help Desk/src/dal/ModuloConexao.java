package dal;

import java.sql.*;

public class ModuloConexao {

    // Metodo de conexão com o banco de dados
    public static Connection conector() {

        java.sql.Connection conexao = null;
        // Driver d o banco de dados que esta sendo utilizado
        String driver = "com.mysql.jdbc.Driver";
        //Armazenar informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbhelp";
        String user = "root";
        String password = "";
        
        //Estabele a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            
        } catch (Exception e) {
            // Linha de apoio ao usuario , informa o erro
            //System.out.println(e);
            return null;
        }

    }

}
