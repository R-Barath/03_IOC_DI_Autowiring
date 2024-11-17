package in.beans;

public class UserService {

	private PasswordService passwordService;
	
	public UserService() {
		System.out.println("User constructor");
		
	}
	
	public  UserService(PasswordService passwordService) {
		System.out.println("Password constructor has been called");
		this.passwordService=passwordService;
		
	}
	
		
		public void saveUser(String uname, String pwd, Long phno) {
			String encodePwd = passwordService.encodePwd(pwd);
			System.out.println("Encoded pwd:" + encodePwd);
			System.out.println("RecordInserted....");

		
	}
	
}
