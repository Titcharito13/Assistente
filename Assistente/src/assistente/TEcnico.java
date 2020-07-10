package assistente;

public class TEcnico extends Assist {
    
    private double acrecimo = 500;

    public double getAcrecimo() {
        return acrecimo;
    }

    public void setAcrecimo(double acrecimo) {
        this.acrecimo = acrecimo;
    }
    
    public double adicional(){
        this.salario = this.salario + this.acrecimo;
        return this.salario;
    }
    
    @Override
    public void dados(){
        System.out.println("Dados do assistente Tecnico:\n"                  
                + "\nMatrícula: " + getNumMatricula()
                + "\nNome: " + getNome()
                + "\nSalário: R$" + getSalario());
    }
}
