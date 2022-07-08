public class EventoHeranca extends DataHora {

    private String evento;
    
    EventoHeranca(int dia, int mes, int ano, String hora, String evento){
        super(dia, mes, ano, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return super.toString() + "Descricao: " + evento;
    }

}
