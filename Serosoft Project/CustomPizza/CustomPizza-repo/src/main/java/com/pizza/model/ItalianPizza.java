package com.pizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ItalianPizza")
public class ItalianPizza implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;
	
	private String choice_Of_Crust;
	
	private String choice_Of_Topping_Italian;
	
	private Integer Quantity;
	
	private Float price;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getChoice_Of_Crust() {
		return choice_Of_Crust;
	}
	public void setChoice_Of_Crust(String choice_Of_Crust) {
		this.choice_Of_Crust = choice_Of_Crust;
	}
	public String getChoice_Of_Topping_Italian() {
		return choice_Of_Topping_Italian;
	}
	public void setChoice_Of_Topping_Italian(String choice_Of_Topping_Italian) {
		this.choice_Of_Topping_Italian = choice_Of_Topping_Italian;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	
}
