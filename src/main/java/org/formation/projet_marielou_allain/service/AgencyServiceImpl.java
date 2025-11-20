package org.formation.projet_marielou_allain.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.Agency;
import org.formation.projet_marielou_allain.repository.AgencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AgencyServiceImpl implements AgencyService {
    private final AgencyRepository repository;

    @PostConstruct
    private void initDb(){
        repository.saveAll(
                List.of(
                        new Agency(),
                        new Agency(),
                        new Agency(),
                        new Agency(),
                        new Agency()
                )
        );
    }

    @Override
    public List<Agency> getAgencies() {
        return repository.findAll();
    }

    @Override
    public Agency createAgency(Agency agency) {
        return repository.save(agency);
    }

    @Override
    public Optional<Agency> getAgency(Long id) {
        return repository.findById(id);
    }


    @Override
    public Optional<Agency> updateAgency(Long id, Agency newData) {
        Agency agency = repository.findById(id).orElseThrow();
        return Optional.of(repository.save(agency));
    }


}
