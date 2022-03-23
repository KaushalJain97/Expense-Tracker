package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
import lombok.Setter;
import lombok.Getter; 
import lombok.ToString;
import javax.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter

@ToString
public class Expense{
	
	  @Override
	public String toString() {
		return "Expense [id=" + id + ", amount=" + amount + ", expensename=" + expensename + ", note=" + note
				+ ", createdAt=" + createdAt + "]";
	}
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      public Long id;
      
	 
      
      public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private   BigDecimal amount;
      
      public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getExpensename() {
		return expensename;
	}
	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}
	@Column(name="description")
      private String expensename;
      
      private String note;
      public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	private Long createdAt ;
      
      

      

	

	
	

	
	
	
	
	
}
