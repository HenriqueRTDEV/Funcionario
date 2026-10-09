package funcionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    public static void main(String[] args) {
        
//Cadastrando Funcionarios
        Cadastrando f1 = new Cadastrando(1, "henrique", 2500);
        Cadastrando f2 = new Cadastrando (2, "guilherme", 2700);
        Cadastrando f3 = new Cadastrando (3, "aldemir", 3700);
        Cadastrando f4 = new Cadastrando (4, "lauren", 5700);
     
                
               
//somando o salario anual do funcionario:
        System.out.println("o salario anual do funcionario é este aqui" + f1.SomandoSalarioAnual());
        
        
//Descobrindo quem tem o maior Salario dos funcionarios
                List<Cadastrando> Lista = new ArrayList<>();
                Lista.add(f1);
                Lista.add(f2);
                Lista.add(f3);
                Lista.add(f4);
                
                Cadastrando maiorsalario =  Lista.get(0);
                
                for (Cadastrando func : Lista) { //"Para cada Cadastrando (que eu vou chamar de func) dentro da minha Lista, faça o seguinte:"
                    if (func.getSalario() > maiorsalario.getSalario()){ //se meu func SALARIO for maior que meu 'maior salario' ele se torna o proximo mais alto, dentro da LIST passada
                        maiorsalario = func;
                    }
                }
                System.out.println("O funcionario com maior salario e : " + maiorsalario.getNome());
                System.out.println("o salario e " + maiorsalario.getSalario());   
                


//Fazendo a media dos salarios
                double somaSalarios = 0.0;
                for (Cadastrando func : Lista) {
                 somaSalarios = func.getSalario() + somaSalarios;
                }
                
        double dividindo = somaSalarios / Lista.size();
        
        System.out.println("a media dos salarios e esta: " + dividindo);
        
        
 // Dando um aumento de 10% para todos os funcionari           
            for (Cadastrando func : Lista) {
                func.aumentarSalario(10);
            }
            
// mostrando na tela este aumento!
            for ( Cadastrando func :Lista) {
                System.out.println(func.getNome() + "agora ganha R$ " + func.getSalario());
            }          
}
}