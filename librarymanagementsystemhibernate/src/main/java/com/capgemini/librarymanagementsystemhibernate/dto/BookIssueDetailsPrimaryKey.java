package com.capgemini.librarymanagementsystemhibernate.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class BookIssueDetailsPrimaryKey implements Serializable{

private int bid;
	
private String email;
}
