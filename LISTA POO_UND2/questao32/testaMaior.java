//32.Escreva uma classe que contenha métodos estáticos para retornar o maior de
//dois, três, quatro e cinco valores, considerando que os argumentos e retorno dos
//métodos podem ser dos tipos int e double. Escreva um aplicativo de teste que
//demonstra as capacidades da classe criada.

// código testado.

public class testaMaior {
    
    public static void main(String[] args) {
        
        System.out.println(Maior.entre(1, 2, 3));
        System.out.println(Maior.entre(1, 3, 2));
        System.out.println(Maior.entre(3, 2, 1));

        System.out.println(Maior.entre(3.5, 2.3, 4.333));

        System.out.println(Maior.entre(100.1, 2, 1, 0,1));

        System.out.println(Maior.entre(3.5, 2.3, 4, 100, 5));


    }

}
