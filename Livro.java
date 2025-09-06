package Lojas;

public class Livro extends Produto {
    private String autor;

    public Livro (){

    }
    public Livro(String nomeLoja, Double preco, String descricao, String autor) {
        super(nomeLoja, preco, descricao);
        this.autor = autor;
        descricao = "Esse livro foi escrito pelo autor " + this.autor;
    }

    @Override
    public String getDescricao() {
        return this.descricao + " - " + super.getDescricao();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
