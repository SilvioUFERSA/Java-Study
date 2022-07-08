public class DataHora {

    private int dia;
    private int mes;
    private int ano;
    private String hora;

    public DataHora( int dia, int mes, int ano, String  hora){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    @Override
    public String toString() {
        String res = "Data: " + dia + "/" + mes + "/" + ano + " |  Hora:" + hora + " |   ";
        return res;
    }

}