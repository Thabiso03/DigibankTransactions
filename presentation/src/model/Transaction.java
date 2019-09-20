package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TransactionEntity;

@SuppressWarnings("deprecation")
@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction {
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private double amount;
	private int transactionCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	public TransactionEntity getEntity() {
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setName(name);
		transactionEntity.setSourcePassport(sourcePassport);
		transactionEntity.setDestinationPassport(destinationPassport);
		transactionEntity.setDestinationBank(destinationBank);
		transactionEntity.setDestinationCountry(destinationCountry);
		transactionEntity.setAccountNumber(accountNumber);
		transactionEntity.setAmount(amount);
		return transactionEntity;
	}
}
