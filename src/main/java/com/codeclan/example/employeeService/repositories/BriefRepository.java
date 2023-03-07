package com.codeclan.example.employeeService.repositories;

import com.codeclan.example.employeeService.models.Brief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BriefRepository extends JpaRepository<Brief, Long> {
}
