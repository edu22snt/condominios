package com.br.condominio.services;

import org.springframework.stereotype.Service;

import com.br.condominio.repositories.DestinationRepository;

/**
 * @since 1.0.0
 */
@Service
public class DestinationService {

    private final DestinationRepository destinationRepository;

    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

}
