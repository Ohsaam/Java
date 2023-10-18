package Project;

import java.sql.Timestamp;
import java.time.LocalDateTime;



public class MemberDTO {
	
	private static final int MINIMUM_NAME_LENGTH = 1;
	private static final int MINIMUM_PASSWORD_LENGTH = 2;

	private String id;
	private String nickName;
	private String pw;
	private String zipcode;
	private String name;
	private String address;
	private String gender;
	private Timestamp createDate;


	public MemberDTO()
	{
		
	}
	

	public MemberDTO(String id, String pw ,String nickName, String name, String gender, String zipcode, String address,Timestamp createDate)
	{
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.name = name;
		this.gender = gender;
		this.zipcode = zipcode;
		this.address =  address;
		this.createDate = createDate;
		
	}
	
	
	public Timestamp getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id.length() < MINIMUM_NAME_LENGTH)
		{
			System.out.println("1글자 이상 작성해주세요");
		
		}
		else
		{
			this.id = id;
		}
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		if(pw.length() < MINIMUM_PASSWORD_LENGTH)
		{
			System.out.println("2글자 이상 입력하세요");
		}
		this.pw = pw;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	


	
}
