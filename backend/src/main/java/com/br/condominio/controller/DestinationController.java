package com.br.condominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.condominio.entities.Destination;
import com.br.condominio.repositories.DestinationRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/destinations")
public class DestinationController {

    @Autowired
    private DestinationRepository destinationRepository;

    @GetMapping()
    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destination> findById(@PathVariable Long id) {
        Optional<Destination> destination = destinationRepository.findById(id);
        return destination.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<Destination> insert(@RequestBody Destination destination) {
        destination.setId(null);
        try {
            return ResponseEntity.ok(destinationRepository.save(destination));
        } catch(Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping()
    public ResponseEntity<Destination> update(@RequestBody Destination destination) {
        try {
            return ResponseEntity.ok(destinationRepository.save(destination));
        } catch(Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Destination> delete(@PathVariable Long id) {
        try {
            destinationRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch(Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
