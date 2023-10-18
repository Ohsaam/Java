package Project;

import java.time.LocalDateTime;
import java.util.Vector;

public class Sample {
	
	public static Vector<String> getmemberheader()
	{
		Vector<String> memberheader = new Vector<>();
		memberheader.add("ID");
		memberheader.add("PassWord");
		memberheader.add("NickName");
		memberheader.add("Name");
		memberheader.add("Gender");
		memberheader.add("ZipCode");
		memberheader.add("Address");
		memberheader.add("CeateDate");
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
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new MemberDTO("qlwb11", "12345", "Ohsaaam", "Ohjihwan", "남자", "33124", "인천광역시 서구", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		return members;
		
	
	
	}
	
	
	
	}


	
	
	

