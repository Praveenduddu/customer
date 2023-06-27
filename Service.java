package de.zeroco.servlets;

import java.util.List;

import de.zeroco.util.Utility;

public class Service {

	public static int getAge(String dateOfBirth) {
		return Utility.calculateTheAge(dateOfBirth);
	}
	
	public static Customer getObjectUsingParameters(int id, String name, String contact, String email, String date) {
		return new Customer(id, name, contact, email, date, getAge(date));
	}
	
	public static Customer getObjectUsingParameters(String name, String contact, String email, String date) {
		return new Customer(name, contact, email, date, getAge(date));
	}
	
	public static boolean isContactAndEmailExist(String contact, String email) {
		if (Utility.isBlank(Dao.get("contact", contact)) && Utility.isBlank(Dao.get("email", email))) {
			return false;
		}
		return true;
	}
	
	public static int update(Customer customer) {
		return Dao.update(customer);
	}
	
	public static int delete(int id) {
		return Dao.delete(id);
	}
	
	public static List<Customer> get(int id) {
		return Dao.get(id);
	}
	
	public static int getGeneratedKey(Customer customer) {
		return Dao.getGeneratedKey(customer);
	}
	
	public static List<Customer> list() {
		return Dao.list();
	}
}
