//26.Crie uma classe chamada Fatura para que uma loja de suprimentos de
//informática a utilize para representar uma fatura de um item vendido. Uma
//Fatura deve incluir as seguintes informações sobre o item vendido: o número de
//identificação, a descrição, a quantidade comprada e o preço unitário. Se a
//quantidade não for positiva, ela deve ser configurada como 0. Se o preço por
//item não for positivo, ele deve ser configurado como 0.0. Forneça também um
//método chamado calculaTotal que calcula e retorna o valor de fatura (isto é,
//multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste que
//demonstra as capacidades da classe criada.

// questao testada

public class testeFatura {
    
    public static void main(String[] args) {
        
        //                     (id , quant, valor, descricao )
        //                     (int , int, double, String ) 
        Fatura f1 = new Fatura (1001, 3 , 2340.50, "notebook");         //instancia valida
        Fatura f2 = new Fatura (1002, 2 , 1100.00, "monitor 240hz");    //instancia valida
        Fatura f3 = new Fatura (1003, 2 , 280.00, "teclado mecanico");  //instancia valida
        Fatura f4 = new Fatura (1004, -1, -150.00, "mouse 16000 dpi");  //instancia com valores invalidos -> deve ser atribuido ZERO em quantidade, e preço
    
        f1.calculaTotal();  //calculos quantidade * preço unitário
        f2.calculaTotal();
        f3.calculaTotal();
        f4.calculaTotal();

        f1.mostraFatura();                  // verificando estados
            System.out.printf("\n");
        f2.mostraFatura();
            System.out.printf("\n");
        f3.mostraFatura();
            System.out.printf("\n");
        f4.mostraFatura();  
    }

}
