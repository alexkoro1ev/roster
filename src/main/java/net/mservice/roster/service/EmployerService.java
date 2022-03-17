package net.mservice.roster.service;

import net.mservice.roster.model.Employer;
import net.mservice.roster.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    public Employer findById(Integer id) {
        return employerRepository.findById(id).orElse(null);
    }

    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

    public Employer saveEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    public void deleteById(Integer id) {
        employerRepository.deleteById(id);
    }

}
