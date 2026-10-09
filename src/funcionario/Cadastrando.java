package funcionario;


public class Cadastrando {

    private int id;
    private String nome;
    private double salario;

    public Cadastrando(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public double SomandoSalarioAnual(){
        double anual = this.salario * 12;
        return anual;
    };
    
    public void aumentarSalario(double percentual) {
        double aumento = this.salario *(percentual / 100.0);
        this.salario = this.salario + aumento;
    };
}