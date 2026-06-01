package com.matera.bootcamp2026seq.model.service;

import com.matera.bootcamp2026seq.model.dto.ContaDTO;
import com.matera.bootcamp2026seq.model.entity.Conta;
import com.matera.bootcamp2026seq.model.repository.ContaRepository;

import java.util.List;

public class ContaService {
    
    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }
    

    public ContaDTO getConta(Long id){

        Conta conta = contaRepository.getConta(id);
        
        return entityToDTO(conta);
    }

    private ContaDTO entityToDTO(Conta conta) {
        return null;
    }

    public List<ContaDTO> getContas(){
        List<Conta> contas = contaRepository.getContas();
    }
}
