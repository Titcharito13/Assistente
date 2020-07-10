
package assistente;

public class Administrativo extends Assist {

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getAcrecimo() {
        return acrecimo;
    }

    public void setAcrecimo(double acrecimo) {
        this.acrecimo = acrecimo;
    }
    
    private String periodo;
    private double acrecimo;
    
    public double acrescimo(){
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
