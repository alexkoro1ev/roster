package net.mservice.roster.repository;

import net.mservice.roster.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {

}
