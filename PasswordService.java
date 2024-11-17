package in.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService {

	public PasswordService() {
		System.out.println("password constructor");

	}

	public String encodePwd(String paswd) {
		Encoder encoder = Base64.getEncoder();
		String encodedPwd = encoder.encodeToString(paswd.getBytes());
		return encodedPwd;

	}

}
