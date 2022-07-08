public class Fatura {
    
    int id;
    int quantidade;
    double precoUnit;
    String descricao;

    public Fatura(int id, int quantidade, double precoUnit, String descricao){

        this.id = id;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
        this.descricao = descricao;

        if(this.quantidade < 0 ){       // caso a quantidade fornecida seja negativa, é atribuido ZERO
            this.quantidade = 0;
        }
        if(this.precoUnit < 0){         // caso o valor fornecido seja negativo , é atribuido ZERO
            this.precoUnit = 0.0;
        }
    
    }

    public double calculaTotal(){       // calculo solicitado na questao
        return quantidade * precoUnit; 
    }

    public void mostraFatura(){         // impressao da fatura
        System.out.println("id: "+ id);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Preco Und.: "+ precoUnit);
        System.out.println("Descricao: "+ descricao);
    
        System.out.println("Fatura : " + calculaTotal());
    }


}
