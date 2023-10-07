package com.cookyplan.Cooky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fooddetails")

public class FoodDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ID_FOOD")
	Foods foodId;
	
	@ManyToOne
	@JoinColumn(name = "ID_INGREDIENT")
	Ingredients ingredientId;
	
	@Column(name = "QUANTITY")
	Integer quantity;
	@Column(name = "UNITPRICE")
	String unitPrice;
	@Column(name = "UNITCALORIES")
	String unitCalories;


	public Foods getFoodId() {
		return foodId;
	}

	public void setFoodId(Foods foodId) {
		this.foodId = foodId;
	}

	public Ingredients getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Ingredients ingredientId) {
		this.ingredientId = ingredientId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitCalories() {
		return unitCalories;
	}

	public void setUnitCalories(String unitCalories) {
		this.unitCalories = unitCalories;
	}
}