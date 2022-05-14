import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro extends Formato{

  public static void main(String[] args) throws IOException {
   
    Scanner scanner = new Scanner(System.in);
    String Telefone;
    String nome ;
    String cpf;
    String cep;
    String endereco;
    String numero;
    

    System.out.print("\nNome: ");
    nome = scanner.nextLine();

    System.out.print("\nCPF: ");
    cpf =  formatString(scanner.nextLine()," #########-##");

    System.out.print("Telefone: ");
    Telefone =  formatString(scanner.nextLine(),"(##) #####-####");

    System.out.print("CEP: ");
    cep =  formatString(scanner.nextLine(),"#####-###");

    System.out.print("Endereço: ");
    endereco =  scanner.nextLine();

    System.out.print("Número: ");
    numero = scanner.nextLine();


    FileWriter arq = new FileWriter("\\projetojavatxt\\dados.txt",true);
    PrintWriter gravarArq = new PrintWriter(arq);
    

    gravarArq.println("-------------------------------------------");

    gravarArq.print("Nome: " + nome.toUpperCase());
    gravarArq.print("\nCPF: " + cpf);
    gravarArq.print("\nTelefone: " + Telefone);
    gravarArq.print("\nCEP: " + cep);
    gravarArq.print("\nEndereço: " + endereco.toUpperCase());
    gravarArq.print("\nNúmero: " + numero);
    gravarArq.print("\n-------------------------------------------");



  


    arq.close();

    System.out.printf("\nOs dados foram gravados com sucesso!!\n\n");
  }



}

