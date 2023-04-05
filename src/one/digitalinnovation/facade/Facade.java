package one.digitalinnovation.facade;

import subsistema01.CrmService;
import subsistema02.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidadeRecuperada = CepApi.getInstancia().recuperarCidade(cep);
        String estadoRecuperado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, estadoRecuperado, cidadeRecuperada);
    }
}
