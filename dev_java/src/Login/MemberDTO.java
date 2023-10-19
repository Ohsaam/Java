package Login;

public class MemberDTO {
	private static final int MINMUM_INPUT = 1;
	private String username;
	private String password;
	
	public MemberDTO()
	{
		
	}
	public MemberDTO(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.length() < MINMUM_INPUT)
		{
			System.out.println("1글자 이상 입력하세요");
			return;
		}
		else
		{
			this.username = username;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length() < MINMUM_INPUT)
		{
			System.out.println("1글자 이상 입력하세요");
			return;
		}
		else
		{
			this.password = password;
		}
	}
	
	

}
