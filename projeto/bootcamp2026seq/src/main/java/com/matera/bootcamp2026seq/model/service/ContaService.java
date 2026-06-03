package com.matera.bootcamp2026seq.model.service;

import com.matera.bootcamp2026seq.model.dto.ContaDTO;
import com.matera.bootcamp2026seq.model.entity.Conta;
import com.matera.bootcamp2026seq.model.entity.StatusConta;
import com.matera.bootcamp2026seq.model.repository.ContaRepository;
import com.matera.bootcamp2026seq.model.repository.ContaRepositoryOLD;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;

import java.time.LocalDate;
import java.util.List;

@Async
public class ContaService {
    
    private final ContaRepository contaRepository;

    public ContaService(ContaRepositoryOLD contaRepositoryOLD) {
        this.contaRepository = contaRepositoryOLD;
    }
    

    public ContaDTO getConta(Long id){

        Conta conta = contaRepository.findById(id).get();
        
        return entityToDTO(conta);
    }
    public void criarConta(ContaDTO dto) throws  InterruptedException{
        Thread.sleep(10000);
        Conta conta = dtoToEntity(dto);
        conta.setStatusConta(StatusConta.ABERTA);
        if(dto.getAbertura() != null && dto.getAbertura().isAfter(LocalDate.now())){
            throw new ContaException("Data de abertura não pode ser futura", HttpStatus.BAD_REQUEST);
        }
        contaRepository.salvarConta(conta);
        System.out.println("Criando conta...");
        return entityToDTO(salva);
    }

    private Conta dtoToEntity(ContaDTO dto) {
    }

    private ContaDTO entityToDTO(Conta conta) {
        return new ContaDTO(
                conta.getNome(),
                conta.getNumConta(),
                conta.getSaldo(),
                conta.getAbertura()
        );
    }

    public List<ContaDTO> getContas(){
        List<ContaDTO> contas = contaRepository.findAll();
        return contas;
    }
    
}
