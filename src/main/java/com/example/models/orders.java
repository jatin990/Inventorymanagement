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
public class orders  {
	@Id
	private int id;
	int wallet_id;
	public String status;
	public int item_id;
	public String type, createdAt, executed_at;
	public float order_price, order_quantity;

}
