public class RegistroAcademico {
    
        private String nome;
        private int matricula;
        private static int numeroDeMatriculas; // seu meu atributo não fosse estático, todas as instancias possuiriam o mesmo numero de matricula.
        private int codigoCurso;
        private double percentualDeCobranca;
    
        public RegistroAcademico () {
            
            numeroDeMatriculas = 0;

        }

        public void inicializaRegistro(String n, int c, double p) {
            nome = n;
            codigoCurso = c;
            percentualDeCobranca = p;
            numeroDeMatriculas += 1;                    // a cada matricula criada este campo é incrementado

            matricula = 202200 + numeroDeMatriculas;     // Fabrica de matriculas unicas;
        }
    
        public double calculaMensalidade() {
            return 100*codigoCurso*percentualDeCobranca;
        }

        public String toString () {
            return "[NOME: " + nome + " - MATRICULA: " + matricula + " - CODIGO CRUSO: " + codigoCurso + "]"; 
        }   // para melhorar eu poderia concatenar o código do curso em algum ponto do campo matricula.
    
}
