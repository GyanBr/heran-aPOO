package model;

public class Cliente extends Pessoa{
    private double renda;
    private double limiteCredito;

    public Cliente() {

    }
    public Cliente(Integer id, String nome, Integer idade, String endereco, String criadoEm, double renda, double limiteCredito) {
        super(id, nome, idade, endereco, criadoEm);
        this.renda = renda;
        this.limiteCredito = limiteCredito;
    }

    public Cliente(double renda, double limiteCredito) {
        this.renda = renda;
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Renda: " + renda + "Limite de Credito: " + limiteCredito);
    }

}
