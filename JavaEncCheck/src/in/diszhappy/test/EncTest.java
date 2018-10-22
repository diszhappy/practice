package in.diszhappy.test;import java.io.UnsupportedEncodingException;
import java.util.Base64;

import in.diszhappy.enc.Base64Enc;

public class EncTest {
	public static void main(String[] args) {
		try {
			String cipher = Base64Enc.encrypt("Sarad Patel");
			System.out.println(cipher);
			System.out.println(Base64Enc.decrypt(cipher));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
