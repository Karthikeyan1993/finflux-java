package com.finflux.challenge.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long member_id;

	private Double loan_amnt;
	private Double funded_amnt_inv;
	private String term;
	private Double int_rate;
	private Double installment;

	@Enumerated(EnumType.STRING)
	private Grade grade;

	private String emp_title;
	private String emp_length;
	private String home_ownership;
	private Double annual_inc;
	private String verification_status;
	private String issue_d;
	private String loan_status;

	private String desc;
	private String purpose;
	private String title;
	private String addr_state;
	private String last_pymnt_d;
	private Double last_pymnt_amnt;

	public long getMember_id() {
		return member_id;
	}

	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}

	public Double getLoan_amnt() {
		return loan_amnt;
	}

	public void setLoan_amnt(Double loan_amnt) {
		this.loan_amnt = loan_amnt;
	}

	public Double getFunded_amnt_inv() {
		return funded_amnt_inv;
	}

	public void setFunded_amnt_inv(Double funded_amnt_inv) {
		this.funded_amnt_inv = funded_amnt_inv;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Double getInt_rate() {
		return int_rate;
	}

	public void setInt_rate(Double int_rate) {
		this.int_rate = int_rate;
	}

	public Double getInstallment() {
		return installment;
	}

	public void setInstallment(Double installment) {
		this.installment = installment;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getEmp_title() {
		return emp_title;
	}

	public void setEmp_title(String emp_title) {
		this.emp_title = emp_title;
	}

	public String getEmp_length() {
		return emp_length;
	}

	public void setEmp_length(String emp_length) {
		this.emp_length = emp_length;
	}

	public String getHome_ownership() {
		return home_ownership;
	}

	public void setHome_ownership(String home_ownership) {
		this.home_ownership = home_ownership;
	}

	public Double getAnnual_inc() {
		return annual_inc;
	}

	public void setAnnual_inc(Double annual_inc) {
		this.annual_inc = annual_inc;
	}

	public String getVerification_status() {
		return verification_status;
	}

	public void setVerification_status(String verification_status) {
		this.verification_status = verification_status;
	}

	public String getIssue_d() {
		return issue_d;
	}

	public void setIssue_d(String issue_d) {
		this.issue_d = issue_d;
	}

	public String getLoan_status() {
		return loan_status;
	}

	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddr_state() {
		return addr_state;
	}

	public void setAddr_state(String addr_state) {
		this.addr_state = addr_state;
	}

	public String getLast_pymnt_d() {
		return last_pymnt_d;
	}

	public void setLast_pymnt_d(String last_pymnt_d) {
		this.last_pymnt_d = last_pymnt_d;
	}

	public Double getLast_pymnt_amnt() {
		return last_pymnt_amnt;
	}

	public void setLast_pymnt_amnt(Double last_pymnt_amnt) {
		this.last_pymnt_amnt = last_pymnt_amnt;
	}

}
