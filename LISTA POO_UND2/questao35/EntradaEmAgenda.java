public class EntradaEmAgenda {

    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private String assunto;

    public EntradaEmAgenda (){

       if(this.setHora(hora) < 0 && this.setHora(hora) > 23 ){
           this.setHora(0);
       }
       
       if(this.setDia(dia) < 1 && this.setDia(dia) > 31){
           this.setDia(0)
       }
       
       if(this.setMes(mes) < 1 && this.setMes(mes)> 12){
           this.setMes(0);
       }

       if(this.setAno(ano) < 2022){
           this.setAno(0);
       }

       if(this.setAssunto(assunto) == null){
           this.setAssunto(" ");
       }

       
    }

    public boolean ehNoDia( int dia, int mes, int ano ){

        if(getDia() == dia && getMes() == mes && getAno() == ano){
            return true;
        }else{
            return false;
        }
    
    }

    public int setDia (int dia){
        return this.dia = dia;
    }
    public int setMes (int mes){
        return this.mes = mes;
    }
    public int setAno (int ano){
        return this.ano = ano;
    }
    public int setHora(int hora){
        return this.hora = hora;
    }
    public String setAssunto (String assunto){
        return this.assunto = assunto;
    }
    

    public int getDia (){
        return this.dia;
    }
    public int getMes (){
        return this.mes;
    }
    public int getAno (){
        return this.ano;
    }
    public int getHora(){
        return this.hora;
    }
    public String getAssunto(){
        return this.assunto;
    }
    
    
    
    public String toString (){

    }

}
