//28.Crie uma classe denominada Elevador para armazenar as informações de um
//elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
//0), total de andares no prédio (desconsiderando o térreo), capacidade do
//elevador e quantas pessoas estão presentes nele. A classe deve também
//disponibilizar os seguintes métodos:
//● inicializa : que deve receber como parâmetros a capacidade do elevador
//e o total de andares no prédio (os elevadores sempre começam no térreo
//7
//e vazio);
//● entra : para acrescentar uma pessoa no elevador (só deve acrescentar se
//ainda houver espaço);
//● sai : para remover uma pessoa do elevador (só deve remover se houver
//alguém dentro dele);
//● sobe : para subir um andar (não deve subir se já estiver no último andar);
//● desce : para descer um andar (não deve descer se já estiver no térreo).
//Escreva um aplicativo de teste que demonstra as capacidades da classe criada.

//codigo testado

public class testaElevador {
    
    public static void main(String[] args) {
        Elevador elev1 = new Elevador();    // cria o elevador no estado em que tudo eh zero

        elev1.inicializa(11, 9);            // inicializo meu elevador para determinada capacidade, e antender a determinado prédio

        elev1.statusElevador();             // mostro meu status de inicio de sua funcionalidade.
        System.out.printf("\n");

        elev1.sobe();                       // tento atingir o numero maximo de andares + 1
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();
        elev1.sobe();

        elev1.sai();                        // tento remover uma pessoa, mas o elevador está vazio

        elev1.entra();                      // tento estrapolar a capacidade maxima + 1 de pessoas no elevador
        elev1.entra();  
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();
        elev1.entra();

        elev1.desce();                      // tento fazer com que o elevador desça além do terreo
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
        elev1.desce();
       
        System.out.printf("\n");
        elev1.statusElevador();             // mostro meu status após os tesste, e o resultado sai como esperado
    }

}
