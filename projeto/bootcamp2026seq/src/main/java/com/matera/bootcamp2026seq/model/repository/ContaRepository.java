package com.matera.bootcamp2026seq.model.repository;

import com.matera.bootcamp2026seq.model.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta,Long> {

    Optional<Conta> findByNumConta(Integer numConta);

    @Query("SELECT conta FROM Conta  conta WHERE conta.numConta = :numConta")
    Optional<Conta> jFindByNumConta(Integer numConta);

    @Query(value = "SELECT * FROM Conta  conta WHERE NUMERO_CONTA = :numConta",nativeQuery = true)
    Optional<Conta> sFindByNumConta(Integer numConta);

    void salvarConta(Conta conta);
}
