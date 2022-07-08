public class Funcionario{
    
    private String nome;
    private String cargo;
    private String departamento;
    private double salario;
    private int horasTtrab;
    
    private double salarioFinal;


    public Funcionario (String nome){
        this.nome = nome;
        this.salario = 2.00;
        this.cargo = "Contratado";
        this.departamento = "Indefinido";
        this.horasTtrab = 0;
        
    }   

    public Funcionario(String nome, String cargo, String departamento ,double salario, int horasTtrab){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
        this.horasTtrab = horasTtrab;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public int getHorasTtrab() {
        return horasTtrab;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setHorasTtrab(int horasTtrab) {
        this.horasTtrab = horasTtrab;
    }

    public double salarioFinal(){
        salarioFinal = salario * horasTtrab;
        return salarioFinal;
    }

    @Override
    public String toString(){
        String res;
        res = "Nome: " + nome + "\n";
        res += "Cargo: " + cargo + "\n";
        res += "Departamento: " + departamento + "\n";
        res += "Valor/Hora: " + salario + "\n";
        res += "Horas Trabalhadas: " + horasTtrab + "\n";
        res += "Salario Final: " + salarioFinal() + "\n";
        return res;
    }
}