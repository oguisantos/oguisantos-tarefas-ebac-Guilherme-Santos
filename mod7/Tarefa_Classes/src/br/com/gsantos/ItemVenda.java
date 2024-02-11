package br.com.gsantos;

/**
 * @author guilherme
 */

public class ItemVenda {
    private int id;
    private int idVenda;
    private int idProduto;
    private double quantidade;
    private double preco;

    public ItemVenda(int id, int idVenda, int idProduto
            , double quantidade, double preco) {
        this.id = id;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
