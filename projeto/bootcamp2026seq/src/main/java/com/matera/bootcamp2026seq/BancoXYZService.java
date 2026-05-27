package com.matera.bootcamp2026seq;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("Banco de Teste")
public class BancoXYZService {

    @Bean
    public String getNome(){
        return "Banco XYZ";
    }
}
