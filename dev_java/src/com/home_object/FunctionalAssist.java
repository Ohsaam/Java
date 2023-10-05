package com.home_object;

import java.util.List;

public class FunctionalAssist {

	public static void main(String[] args) {

		CustomerService service = new CustomerService();
		initData(service);
		// 요구사항 1. 지역으로 검색한다.
		List<Customer> result = service.searchCustomersByLocation("Seoul");
//		for(Customer cus : result)
//		{
//			System.out.println(cus);
//		}
		
//		//요구사항 2. 성별로 검색  -> CustomerService 에 들어가서 성별로 검색하는 메소드를 만든다.
//		List<Customer> result1 = service.searchCustomerByGender(Gender.Female);
//		System.out.println("======================성별 추가====================");
//		for(Customer cus:result1)
//		{
//			
//			System.out.println(cus);
//		}
	result = service.searchCustomersBy(SearchOption.Location, "Busan");
	
	for(Customer cus : result)
	{
		System.out.println(cus);
	}
	
	}
	
	
	private static void initData(CustomerService service)
	{
		service.addCustomer(new Customer("CUS01","Seoul",Gender.Male , 30));
		service.addCustomer(new Customer("CUS02","Busan",Gender.Female , 55));
		service.addCustomer(new Customer("CUS03","Seoul",Gender.Female , 13));
		service.addCustomer(new Customer("CUS04","Gwangju",Gender.Male , 27));
		service.addCustomer(new Customer("CUS05","Gwangju",Gender.Female , 61));
		service.addCustomer(new Customer("CUS06","Incheon",Gender.Male , 29));
		service.addCustomer(new Customer("CUS07","Seoul",Gender.Male , 42));
		service.addCustomer(new Customer("CUS08","Seoul",Gender.Female , 45));
		service.addCustomer(new Customer("CUS09","Seoul",Gender.Female , 33));
		service.addCustomer(new Customer("CUS10","Busan",Gender.Male ,  20));

	}

}
