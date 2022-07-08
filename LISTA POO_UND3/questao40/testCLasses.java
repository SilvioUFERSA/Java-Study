/*
40.Escreva a classe Politico que herda de uma classe Pessoa e tem um campo
adicional para representar o partido do político. Escreva também as classes
Prefeito e Governador que herdem da classe Politico e que contenham campos
para representar a cidade ou estado governado. Escreva também uma aplicação
que demonstre o uso de instâncias destas classes.
 */


public class testCLasses {
    public static void main(String[] args) {
        
        politico p1 = new politico("Jose", "000.555.444.33", 35, "PDT");

        System.out.println(p1);

        Prefeito pref1 = new Prefeito("Raimundo", "000.333.444.11", 55, "DDD", "Pereiro-CE", 12);

        System.out.println(pref1);

        Governador gov1 = new Governador("Camilo", "200.600.000-33", 45, "TDD", "CEARA", 13);

        System.out.println(gov1);
    }
}
