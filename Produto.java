package Lojas;

public class Produto {
    private String nomeLoja;
    private Double preco;
    protected String descricao;

    public Produto() {
    }

    public Produto(String nomeLoja, Double preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de informática";
    }

}
