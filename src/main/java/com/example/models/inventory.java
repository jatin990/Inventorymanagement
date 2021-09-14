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
public class inventory {

	@Id
	int  id;
	int itemId, walletId;
	float quatity;
}
