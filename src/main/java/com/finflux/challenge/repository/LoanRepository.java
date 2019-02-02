package com.finflux.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.finflux.challenge.domain.Loan;

@Component
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
