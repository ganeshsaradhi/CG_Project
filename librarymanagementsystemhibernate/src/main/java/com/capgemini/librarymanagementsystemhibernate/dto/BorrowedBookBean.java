package com.capgemini.librarymanagementsystemhibernate.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="borrowbook1")
public class BorrowedBookBean {
	@EmbeddedId
	private BorrowedBookBeanPrimaryKey borrowBookPK;
	@Column
	private int id;


	
	  @Exclude //@MapsId
	  
	  @ManyToOne
	  
	  @JoinColumn(name="email" , insertable = false,updatable = false) 
	  private UserBean primary;
	 
}
