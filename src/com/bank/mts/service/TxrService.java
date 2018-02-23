package com.bank.mts.service;

public interface TxrService {

	public boolean transferAmount(double amt, String fromAccount, String toAccount);
}
