package com.br.condominio.services;

import com.br.condominio.entities.Company;
import com.br.condominio.framework.AbstractService;
import com.br.condominio.repositories.CompanyRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @since 1.0.0
 */
@Service
public class CompanyService extends AbstractService<CompanyRepository, Company, Long> {

    public CompanyService(CompanyRepository companyRepository) {
        super(companyRepository);
    }

    @Override
    public Company save(Company company) {
        if (company.getId() == null) {
            company.setDateRegistered(LocalDateTime.now());
        }

        return repository.save(company);
    }

}
