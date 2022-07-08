public class Aluno {
    
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double trabalho;

    public Aluno( int matricula, String nome, double n1, double n2, double trabalho){

        this.matricula = matricula;
        this.nome = nome;
        nota1 = n1;
        nota2 = n2;
        this.trabalho = trabalho;
        
        if(n1 < 0.0){
            this.nota1 = 0.0;
        }
        if( n2 < 0.0 ){
            this.nota2 = 0.0;
        }
        if( trabalho < 0.0){
            this.trabalho = 0.0;
        }
    
    }

    public double mediaFinal(){
        return ((nota1 * 2.5) + (nota2 * 2.5) + (trabalho * 2.0)) / 7; // 7 eh a soma dos pesos.
    }

    public double provaFinal(){
        
        double aux = mediaFinal();
        
        if(aux < 7.0){
            return (7.0 - aux);
        }else{
            return 0.0;
        }

    }
    
    public void mostraResultado (){
        System.out.println("Nome: " + nome + "      Matricula: " + matricula);
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("trabalho: " + trabalho );
        System.out.printf("media: %.2f \n" , mediaFinal()) ;
        System.out.printf("Prova final: %.2f  \n" , provaFinal());
    }
}
