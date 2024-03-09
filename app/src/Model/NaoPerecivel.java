package Model;

import java.util.Scanner;

public class NaoPerecivel extends Estoque{
    private String localArmazenamento;
    
    public NaoPerecivel(){
        super();
        localArmazenamento = new String();
    }

    public NaoPerecivel(int codigo, String descricao, float preco, String localArmazenamento){
        super(codigo, descricao, preco);
        this.localArmazenamento = localArmazenamento;
    }

    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }
    
    public void Cadastrar() {
        super.Cadastrar();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o local deArmazenamento: ");
        localArmazenamento = entrada.next();  
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.println("local de Armazenamento:  "+getLocalArmazenamento());
    }

    @Override
    public String toString() {
        String  estoque = super.toString();
        return estoque + " localArmazenamento=" + localArmazenamento + "]";
    }

    
}
