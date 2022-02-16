package com.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Author 
{
	private String aname;
	private List<String> books; // List
	private Set<String> addresses; // Set
	private Map<String,String> data; // Map--> Key is bookname and value is duration for wriiten it by author
	
	public Author() {
		super();
		System.out.println("In default constructor of Author ");
		// TODO Auto-generated constructor stub
	}
	public Author(String aname, List<String> books, Set<String> addresses, Map<String, String> data) {
		super();
		this.aname = aname;
		this.books = books;
		this.addresses = addresses;
		this.data = data;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		System.out.println("In setter method of Author");
		this.aname = aname;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Author [aname=" + aname + ", books=" + books + ", addresses=" + addresses + ", data=" + data + "]";
	}
	
	
	
	
}
