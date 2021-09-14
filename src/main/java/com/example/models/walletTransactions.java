package com.example.models;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class walletTransactions {
	@Id
	private int id;
	String type,status,mode,createdAt;
	int walletId;
	float amount; 
}
