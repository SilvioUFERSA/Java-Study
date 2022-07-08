import java.util.ArrayList;
import java.util.Scanner;
public class testaCliente {
    
    public static void main(String[] args) {
        int i=0;

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();     // array list cliente  do tipo da classe
        
        do{
            System.out.print("Id: ");                               // coleta de dados para colocar no meu new Cliente.
            int id = sc.nextInt();          
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Telefone: ");
            String telefone = sc.next();

            Cliente c = new Cliente(id, nome, idade, telefone);  // intanciando o novo cliente com os dados que eu coletei

            c.setId(id);            // atribuindo os dados coletados
            c.setNome(nome);
            c.setIdade(idade);
            c.setTelefone(telefone);

            clientes.add(c);        // aqui eu adiciono ao arrayList meu usuário( Objeto ) criado

            System.out.println();

            i = id;                 // variavel de controle que executa o laõ até q meu id seja negativo, tentei usar o breack mas n estava dando muito certo. algum erro de sintaxe

         }while ( i >= 0);

         for (int j = 0; j < clientes.size(); j++){         // assim q saio do laço, meus objetos criados são mostrados
             
            Cliente aux = clientes.get(j);                  // pega meu objeto da posição J, e guarda na minha variavel aux.         
            System.out.println("Id : " + aux.getId());      // aqui eu pego (GET) atribuito por atributo do meu objeto criado por meio de aux.
            System.out.println("Nome : " + aux.getNome());
            System.out.println("Idade : " + aux.getIdade());
            System.out.println("Telefone : " + aux.getTelefone());
            System.out.println();
         
        }
    
    }   
}
