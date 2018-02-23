package com.bank.mts;

import com.bank.mts.repository.*;
import com.bank.mts.service.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);
		
		boolean status = txrService.transferAmount(300.00, "1", "2");
		System.out.println(status ? "Txr success " : "Txr Failed");
		
		System.out.println(accountRepository.loadAccount("1"));
		System.out.println(accountRepository.loadAccount("2"));
		
		
	}

}
