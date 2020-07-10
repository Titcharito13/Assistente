package assistente;

public class Assist extends Funcionario {
    
    public void dados(){
            System.out.println("Informações do assistente:\n"                  
                    + "\nMatrícula: " + getNumMatricula()
                    + "\nNome: " + getNome()
                    + "\nSalário: " + getSalario());
     }
    
}
