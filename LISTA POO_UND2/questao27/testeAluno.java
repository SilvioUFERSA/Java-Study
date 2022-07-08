//27.Escreva uma classe cujos objetos representam alunos matriculados em uma
//disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno:
//matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes
//métodos para esta classe:
//● media : calcula a média final do aluno (cada prova tem peso 2,5 e o
//trabalho tem peso 2)
//● provaFinal : calcula quanto o aluno precisa para a prova final (retorna
//zero se ele não for para a final)
//Escreva um aplicativo de teste que demonstra as capacidades da classe criada.


//questão Testada

public class testeAluno {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno(2020135 , "Marcos Santos" , 7.0 , 7.0 , 8.0);
        Aluno a2 = new Aluno(2020128 , "Rodrigo Rodrigues", 6.0, 6.0, 5.5);
        Aluno a3 = new Aluno(2019100 , "Roberto Campos", 0.0, -1.0 , 0.0);

        a1.mediaFinal();
        a1.mostraResultado();

            System.out.printf("\n");
        
       a2.mediaFinal();
       a2.mostraResultado();
        
            System.out.printf("\n");
        
       a3.mediaFinal();
       a3.mostraResultado();
    }

}
