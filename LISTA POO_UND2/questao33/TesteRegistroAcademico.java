//33. Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo numeroDeMatriculas declarado como static, 
//e que incremente o valor deste campo cada vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas 
//para definir o atributo matricula automaticamente com um valor diferente para cada instância. Escreva também uma aplicação que 
//crie algumas instâncias da classe para demonstrar seu funcionamento.


public class TesteRegistroAcademico {

	public static void main(String[] args) {
		RegistroAcademico michael = new RegistroAcademico();
		RegistroAcademico roberto = new RegistroAcademico();
        RegistroAcademico rodrigo = new RegistroAcademico();
        RegistroAcademico marcio = new RegistroAcademico();
        RegistroAcademico alysson = new RegistroAcademico();
        RegistroAcademico italo = new RegistroAcademico();


		michael.inicializaRegistro("Michael", 2, 100.0);
        roberto.inicializaRegistro("Roberto", 2, 50.0);
        rodrigo.inicializaRegistro("Rodrigo", 2, 100.0);
        marcio.inicializaRegistro("Marcio", 2, 100.0);
        alysson.inicializaRegistro("Alysson", 2, 100.0);
        italo.inicializaRegistro("italo", 2, 50.0);

       System.out.println(michael);
       System.out.println(roberto);
       System.out.println(rodrigo);
       System.out.println(marcio);
       System.out.println(alysson);
       System.out.println(italo);
		
	}

}