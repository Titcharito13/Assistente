package assistente;

public class Assistente {

    public static void main(String[] args) {
        
        TEcnico tec = new TEcnico();
        Administrativo adm = new Administrativo();
        
        adm.setNumMatricula(1);
        adm.setNome("Maria");
        adm.setPeriodo("Noite");
        adm.setSalario(2500);        
        adm.acrescimo();
        adm.dados();
        
        tec.setNome("Victor");
        tec.setSalario(2000);
        tec.setNumMatricula(2);        
        tec.adicional();
        tec.dados();

        
    }
    
}
