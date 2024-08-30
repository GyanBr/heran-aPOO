package model;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(Integer id, String nome, Integer idade, String endereco, String criadoEm, double salario, String cargo) {
        super(id, nome, idade, endereco);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("cargo: " + cargo + "salario: " + salario);
    }
}
