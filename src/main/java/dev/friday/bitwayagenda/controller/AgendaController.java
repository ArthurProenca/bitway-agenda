package dev.friday.bitwayagenda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/public/v1/agenda")
public class AgendaController {

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> root() {
        return ResponseEntity.ok(Map.of("message", "Hello World!"));
    }

    @GetMapping("/{nome}/hoje")
    public ResponseEntity<?> getHoje(@PathVariable String nome, @RequestParam String key) {
        if(key.equals("123")) {
            return ResponseEntity.ok(Map.of("message", "Olá " + nome + "!"));
        }
        return ResponseEntity.ok(Map.of("message", "Hello " + nome + "!"));
    }

}