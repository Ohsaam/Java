package Login;

import java.time.LocalDateTime;
import java.util.Vector;

public class Sample {
	
	public static Vector<String> getmemberheader()
	{
		Vector<String> memberheader = new Vector<>();
		memberheader.add("ID");
		memberheader.add("PassWord");

		return memberheader;
	}
	/**
	 * id
	 * pw
	 * 	setNickName(nickName);
		setName(name);
		setGender(gender);
		setZipcode(zipcode);
		setAddress(address);
	 */
	public static Vector<MemberDTO> getMembers(){
		Vector<MemberDTO> members = new Vector<>();
		members.add(new MemberDTO("qlwb11", "12345"));
		members.add(new MemberDTO("qlwb11", "12345"));
		return members;
		
	
	
	}
	
	
	
	}


	
	
	

