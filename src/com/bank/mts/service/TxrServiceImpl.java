package com.bank.mts.service;
import com.bank.mts.repository.AccountRepository;
import com.bank.mts.model.*;

public class TxrServiceImpl implements TxrService {
	
	private AccountRepository accountRepository;
	
	public TxrServiceImpl(AccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	public boolean transferAmount(double amt, String fromAcc,  String toAcc){
		
		Account fromAccount = accountRepository.loadAccount(fromAcc);
		Account toAccount = accountRepository.loadAccount(toAcc);
		
		
		fromAccount.setBalance(fromAccount.getBalance() - amt);
		toAccount.setBalance(toAccount.getBalance() + amt);
		
		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);
		
		return true;
	}

}
