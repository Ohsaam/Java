package com.home_object;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	private List<Customer> customers;
	
	public CustomerService() {this.customers = new ArrayList<>();}
	
	public void addCustomer (Customer newCustomer) {this.customers.add(newCustomer);}
	
	/*
	 * 같은 지역에 사는 customer들을 찾아서 반환하기 위한 foundCustomers 리스트 선언
	 * 반복문을 돌면서 customer의 로테이션 값을 얻으면서 그 받은 값이 == location이 같냐?
	 * 같으면 foundCustomers.add로 해서 더한다.
	 * 그래서 마지막은 foundCustomers를 반환한다.
	 */
	// 요구사항 1) 지역으로 검색한다. 
	public List<Customer> searchCustomersByLocation(String location)
	{
		List<Customer> foundCustomers = new ArrayList<>();
		for(Customer customer : customers)
		{
			if(customer.getLocation().equals(location))
			{
				foundCustomers.add(customer);
			}
		}
		return foundCustomers;
	}
	
	//요구사항 2) 성별로 검색한다.
	
	public List<Customer> searchCustomerByGender(Gender gender)
	{
		{
			List<Customer> foundCustomers = new ArrayList<>();
			for(Customer customer : customers)
			{
				if(customer.getGender().equals(gender))
				{
					foundCustomers.add(customer);
				}
			}
			return foundCustomers;
		}
		
	}
	// 하나의 메소드로 간다.
	public List<Customer> searchCustomersBy(SearchOption searchOption, String searchValue)
	{
		List<Customer> foundCustomers = new ArrayList<>();
		for(Customer customer : customers)
		{
			if(searchOption.equals(SearchOption.Location))
			{
				if (customer.getLocation().equals(searchValue))
				{
					foundCustomers.add(customer);
				}
			}
			else if(searchOption.equals(SearchOption.Gender));
			{
				if(customer.getGender().name().equals(searchValue))
				{
					
				}
			}
		}
		return foundCustomers;
	
	}
	
}
