package com.matera.bootcamp2026seq;

public class PagamentoService {

    //Injeção de controle

    private BancoXYZService bancoXYZService;

    public PagamentoService(BancoXYZService bancoXYZService) {
        this.bancoXYZService = bancoXYZService;
    }
    private String getNome(){

        return bancoXYZService.getNome();
    }
}
