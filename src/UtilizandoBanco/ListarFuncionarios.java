package UtilizandoBanco;
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarFuncionarios {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/empresa";
        String usuario = "postgres";
        String senha = "Java123!";

        String sql = "SELECT * FROM funcionarios";

        try (Connection conexao =
                     DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {
                System.out.println("ID: " + resultado.getLong("id"));
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Salario: " + resultado.getBigDecimal("salario"));
                System.out.println("----------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}