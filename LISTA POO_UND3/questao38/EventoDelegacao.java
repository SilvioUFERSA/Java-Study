public class EventoDelegacao{

    private String evento;
    private DataHora data;

    EventoDelegacao( int dia, int mes, int ano, String  hora, String evento){
        data = new DataHora(dia, mes, ano, hora);
        this.evento = evento;
    }

    EventoDelegacao (DataHora data, String evento) {
        this.data = data;
        this.evento = evento;
    }

    @Override
    public String toString () {
        String res = data.toString();
        res += ("Descricao: " + evento + "\n");
        return res;
    }
}