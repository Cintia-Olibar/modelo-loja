package Lojas;

public class Mouse extends Produto {
    private String tipo;

    public Mouse(){

    }

    public Mouse(String nomeLoja, Double preco, String descricao, String tipo) {
        super(nomeLoja, preco, descricao);
        this.tipo = tipo;
        descricao = "Mouse " + this.tipo + ", Saída USB. 1.600 dpi";
    }

    @Override
    public String getDescricao() {
        return this.descricao + " - " + super.getDescricao();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
