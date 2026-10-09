package UtilizandoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoSQL {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/empresa";
        String usuario = "postgres";
        String senha = "Java123!";

        try (Connection conexao =
                DriverManager.getConnection(url, usuario, senha)) {

            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
        }    
    }
}