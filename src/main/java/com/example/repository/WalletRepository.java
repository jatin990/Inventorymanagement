package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.models.wallets;

public interface WalletRepository extends JpaRepository<wallets,Integer>{
	@Query(value="Select * from wallets where account_id=?1",nativeQuery=true)
	wallets findWalletbyAccountId(int account_id);

}
