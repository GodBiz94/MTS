package com.bank.mts.repository;
import com.bank.mts.model.*;

public interface AccountRepository {
	Account loadAccount(String num);
	boolean updateAccount(Account account);

}
