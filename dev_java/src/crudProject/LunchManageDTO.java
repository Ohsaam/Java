package crudProject;


/*
이름       널?       유형           
-------- -------- ------------ 
NAME     NOT NULL VARCHAR2(30) 
PHONE    NOT NULL VARCHAR2(20) 
ADDRESS           VARCHAR2(40) 
DISTANCE NOT NULL VARCHAR2(10) 
MEMO              VARCHAR2(80) 
*/

public class LunchManageDTO {
	private String name;
	private String phone;
	private String address;
	private String distance;
	private String memo;
	
	public LunchManageDTO() {
		// TODO Auto-generated constructor stub
	}

	public LunchManageDTO(String name, String phone, String address, String distance, String memo) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.distance = distance;
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}