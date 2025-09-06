package Lojas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compra {

    private List<Produto> carrinho = new ArrayList<>();

    public Compra() {
    }

    public Compra(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public void addCarrinho(){
        carrinho.add();
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    private String lerString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
