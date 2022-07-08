//31.Escreva uma classe para representar um número complexo. Essa classe deve
//conter três construtores. Um construtor deverá receber os dois valores (parte
//real e parte imaginária) como argumentos, o outro somente o valor real,
//considerando o imaginário como sendo zero, e o terceiro construtor não recebe
//argumentos, considerando as partes real e imaginária do número complexo
//como sendo iguais a zero. Escreva um método toString e o use em um aplicativo
//de teste que demonstra as capacidades da classe criada.


// código testado

public class testaNumeroComplexo {
    
    public static void main(String[] args) {
        NumeroComplexo z1 = new NumeroComplexo(5.0f , -2.0f);
        NumeroComplexo z2 = new NumeroComplexo(-5.0f);
        NumeroComplexo z3 = new NumeroComplexo();
        
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }

}
