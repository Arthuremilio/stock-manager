package Model;

import java.util.Scanner;

public class Estoque {
    private int codigo;
    private String descricao;
    private float preco;


    public Estoque(int Codigo, String descricao, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Estoque(){
        codigo = 0;
        descricao = new String();
        preco = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void Cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ID: ");
        codigo = entrada.nextInt();
        System.out.println("Digite a descrição: ");
        descricao = entrada.next();        
        System.out.println("Digite o preço: ");
        preco = entrada.nextFloat();  
    }  
    public void Mostrar(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("preço: "+getPreco());
    }

    @Override
    public String toString() {
        return "[codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ",";
    }
    
}