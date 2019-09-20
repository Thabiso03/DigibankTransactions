package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import model.TransactionEntity;
import service.TransactionEJB;

@ManagedBean(name = "transactioncontoller")
@SessionScoped
public class TransactionController {
	@EJB
	TransactionEJB transactionservice;
	
	@ManagedProperty(value = "#{transaction}")
	private Transaction transaction;
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setName(Transaction transaction) {
		this.transaction = transaction;
	}
	
	public void addNewTransaction() {
		transactionservice.addNew(transaction.getEntity());
	}
}
