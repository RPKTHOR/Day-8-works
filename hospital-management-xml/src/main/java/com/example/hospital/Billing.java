package com.example.hospital;

public class Billing {
	private int billId;
    private double amount;
    
    public Billing() {}
    
    public Billing(int billId, double amount) {
    	this.amount = amount;
    	this.billId = billId;
    }
    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getBillId() {
        return billId;
    }
    
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void generateBill() {
		System.out.println("Bill generated = "+billId+" Amount: "+amount);
	}
	
	public void sendBill() {
		System.out.println("Bill sent to registered email!...");
	}

}
