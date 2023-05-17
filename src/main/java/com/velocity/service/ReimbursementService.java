package com.velocity.service;

import java.util.List;

import com.velocity.model.Reimbursement;


public interface ReimbursementService {

	public Reimbursement saveReimbursement(Reimbursement reimbursement);
	public Reimbursement updateReimbursement(Reimbursement reimbursement);
	public List<Reimbursement> getReimbursement();
	public void deletById(int reimbursementId);
	
=======


public interface ReimbursementService {
	
	public Reimbursement saveReimbursement(Reimbursement reimbursement);
	public Reimbursement updateReimbursement(Reimbursement reimbursement);
	public List<Reimbursement> getReimbursement();

	//public List<Reimbursement> getReimbursement2();
	


}
