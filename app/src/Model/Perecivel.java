package Model;
import java.util.Scanner;

public class Perecivel  extends Estoque{
    private String validade;

    public Perecivel() {
        super();
        validade = new String();
    }

    public Perecivel(int codigo, String descricao, float preco, String validade){
        super(codigo, descricao, preco);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public void Cadastrar() {
        super.Cadastrar();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a validade nesse formato XX/XX/XXXX: ");
        validade = entrada.next();  
    }
    
    public void Mostrar(){
        super.Mostrar();
        System.out.println("validade:  "+getValidade());
    }

    @Override
    public String toString() {
        String estoque = super.toString();
        return estoque + " validade=" + validade + "]";
    }
    
}
