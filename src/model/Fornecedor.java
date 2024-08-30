package model;

public class Fornecedor extends Pessoa {
    private String produtoFornecido;
    private String cnpj;
    public String marca;

    public Fornecedor(String produtoFornecido, String cnpj, String marca) {
        this.produtoFornecido = produtoFornecido;
        this.cnpj = cnpj;
        this.marca = marca;
    }

    public Fornecedor(Integer id, String nome) {
        super(id, nome, idade, endereco);
        this.produtoFornecido = produtoFornecido;
        this.cnpj = cnpj;
        this.marca = marca;
    }

    public String getProdutoFornecido() {
        return produtoFornecido;
    }

    public void setProdutoFornecido(String produtoFornecido) {
        this.produtoFornecido = produtoFornecido;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Produto fornecido: " + produtoFornecido + "CNPJ: " + cnpj + "Marca: " + marca);
    }
}
