//38.Crie uma classe para representar uma data e um horário (DataHora).
//- Escreva uma classe EventoDelegacao que seja baseada na classe
//DataHora e que contenha um campo para indicar qual o evento que ela
//representa (use uma String para isto). Use o mecanismo de delegação
//para criar a classe EventoDelegacao.
//- Escreva uma classe EventoHeranca que seja baseada na classe
//DataHora e que contenha um campo para indicar qual o evento que ela
//representa (use uma String para isto). Use o mecanismo de herança para
//criar a classe EventoHeranca.
//- Escreva um aplicativo de teste que demonstre o uso das classes criadas


public class testeDelegHeranc {
    public static void main(String[] args) {
        DataHora h1 = new DataHora(15, 02, 2022, "14:30");

        EventoDelegacao evento1 = new EventoDelegacao(h1, "aniversario");

        EventoDelegacao evento2 = new EventoDelegacao(22,05,2022,"17:00", "jantar");

        EventoHeranca evento3 = new EventoHeranca(02, 02, 2023, "19:00", "Viagem");

        
        System.out.println(evento1);
        System.out.println(evento2);
        System.out.println(evento3);
    }
}
