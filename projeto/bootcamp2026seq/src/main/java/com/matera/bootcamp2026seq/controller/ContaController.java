package com.matera.bootcamp2026seq.controller;

import com.matera.bootcamp2026seq.model.dto.ContaDTO;
import com.matera.bootcamp2026seq.model.service.ContaService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/conta")
public class ContaController {

    private final ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContaDTO> getConta(@PathParam("id") Long id){
        ContaDTO contaDTO = contaService.getConta(id);

        return ResponseEntity.ok(contaDTO);
    }

    @GetMapping()
    public ResponseEntity<List<ContaDTO>> getContas(@PathParam("id") Long id){
        List<ContaDTO contaDTOS = contaService.getContas();

        return ResponseEntity.ok(contaDTOS);
    }
}
