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
public class wallets {
	@Id
	int id;
	int accountId; 
	String currencyType,status; 
	float amount;
}
