package com.bank.mts.repository;
import java.util.*;
import com.bank.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {
	
	private static Map<String, Account> memorydb = new HashMap();
	
	static{
		Account account1 = new Account();
		account1.setNum("1");
		account1.setBalance(1000.00);
		account1.setHolderName("A");
		
		Account account2 = new Account();
		account2.setNum("1");
		account2.setBalance(1000.00);
		account2.setHolderName("B");
		
		memorydb.put("1", account1);
		memorydb.put("2", account2);
	}
	
	public Account loadAccount(String num){
		return memorydb.get(num);
	}
	
	public boolean updateAccount(Account account){
		
		Account existingAccount = memorydb.get(account.getNum());
		existingAccount.setBalance(account.getBalance());
		return true;
	}

}
