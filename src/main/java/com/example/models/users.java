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
public class users  {
	@Id
	int id;
	public String name, email, password, account_no, panNumber, phoneNumber, createdAt;

}
