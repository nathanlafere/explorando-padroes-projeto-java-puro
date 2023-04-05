package subsistema01;

public class CrmService {
    private CrmService() {
        super();
    }
    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Informações salvas no sistema CRM.");
        System.out.println(nome+": "+cidade+"/"+estado+" - "+cep);
    }
}
