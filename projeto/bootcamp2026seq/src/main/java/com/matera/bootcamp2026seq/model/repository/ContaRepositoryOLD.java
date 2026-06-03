package com.matera.bootcamp2026seq.model.repository;

import com.matera.bootcamp2026seq.model.entity.Conta;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaRepositoryOLD {
    public ContaRepositoryOLD() {
    }

    public Conta getConta(Long id){
        Conta conta = new Conta();
        //Faker faker = new faker();
        conta.setId(id);
        conta.setNumConta(122);//(faker.numer().randomDigit());
        conta.setNome("Jon");//(faker.name().firstName());
        conta.setSaldo(BigDecimal.valueOf(1000));
        conta.setAbertura(LocalDate.now());

        return conta;
    }

    public List<Conta> getContas(){
        List<Conta> contas = new ArrayList<>();
        for(long i = 0; i<10 ; i++){
            contas.add(
                    getConta(i)
            );
        }
        return contas;
    }
}
