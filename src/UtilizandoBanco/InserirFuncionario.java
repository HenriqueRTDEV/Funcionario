package UtilizandoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirFuncionario {

    public static void main(String[] args) {

        //Fazendo a Conexão
        String url = "jdbc:postgresql://localhost:5432/empresa";
        String usuario = "postgres";
        String senha = "Java123!";

        String sql = "INSERT INTO funcionarios (nome, salario) VALUES (?, ?)";

        try (Connection conexao =
                     DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, "Henrique");
            stmt.setDouble(2, 3000.00);
            
            stmt.setString(1, "Lauren");
            stmt.setDouble(2, 2500);
            

            stmt.executeUpdate();

            System.out.println("Funcionário cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar funcionário:");
            e.printStackTrace();
        }
    }
}