package dev.friday.bitwayagenda.controller.impl;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.service.Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/agenda")
@Api(tags = "AgendaController")
@CrossOrigin
@Log4j2
public class AgendaController implements dev.friday.bitwayagenda.controller.AgendaController {
    Service service;

    public AgendaController(Service service) {
        this.service = service;
    }

    @Override
    @GetMapping(path = "/sit")
    @ApiOperation(value = "Retorna a situação da agenda", response = String.class)
    public ResponseEntity<?> root() {
        return ResponseEntity.status(200).body((Map.of("message", "root page")));
    }

    @GetMapping("/{nome}/hoje")
    public ResponseEntity<?> getHoje(@PathVariable String nome, @RequestParam String key) {
        if (key.equals("123")) {
            return ResponseEntity.ok(Map.of("message", "Olá " + nome + "!"));
        }
        return ResponseEntity.ok(Map.of("message", "Hello " + nome + "!"));
    }

    @PostMapping("/colaborador/insert")
    public ResponseEntity<?> insertColaborador(@RequestBody ColaboradorDTO colaboradorDTO) {
        return service.insertColaborador(colaboradorDTO);
    }
}