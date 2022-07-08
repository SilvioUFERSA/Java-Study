public class NumeroComplexo {   // z = x + y * ( i*i = -1 )(?)
    
    public float x;
    public float y;            

    public NumeroComplexo (float x , float y ){ //primeiro construtor
        this.x = x;
        this.y = y;
    }

    public NumeroComplexo (float x){        // segundo construtor
        this.x = x;
        this.y = 0.0f;
    }

    public NumeroComplexo (){               // terceiro construtor
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public String toString (){

        if( x >= 0.0f && y >= 0.0f  ){
         
            return "Numero Complexo [ z = " + x + " + " + y + "i ]"; // notação para os dois positivos
        
        }else if ( x >= 0.0f && y < 0.0f ){
        
            return "Numero Complexo [ z = " + x + " + (" + y + ")i ]"; // notação para o y negativo
        
        }else if ( x < 0.0f && y >= 0.0f ){

            return "Numero Complexo [ z = (" + x + ") + " + y + "i ]"; // notação para o x negativo

        } else {

            return "Numero Complexo [ z = (" + x + ") + (" + y + ")i ]"; // notação para x e y negativos

        }
    }

}
