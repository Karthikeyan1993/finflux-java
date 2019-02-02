package com.finflux.challenge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finflux.challenge.domain.Loan;
import com.finflux.challenge.payload.ApiResponse;
import com.finflux.challenge.repository.LoanRepository;

@RestController
@RequestMapping("api/loan/")
@CrossOrigin("http://localhost:4200")
public class LoanController {

	@Autowired
	private LoanRepository loanRepository;

	@GetMapping("all")
	public ResponseEntity<?> getAllDetails() {
		ApiResponse response = null;
		try {
			List<Loan> data = this.loanRepository.findAll();
			response = new ApiResponse(data, true, "Success");

		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable("id") long id) {
		ApiResponse response = null;
		try {
			Optional<Loan> loan = this.loanRepository.findById(id);
			response = new ApiResponse(loan, true, "Success");
		} catch (Exception e) {
			response = new ApiResponse(null, false, "failure");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
