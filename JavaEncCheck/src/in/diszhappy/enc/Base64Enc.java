/**
 * 
 */
package in.diszhappy.enc;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author saumm
 *
 */
public class Base64Enc {

	public static String encrypt(String plainText) throws UnsupportedEncodingException {
		String cipherText = "";
		
		byte[] arr = plainText.getBytes(StandardCharsets.UTF_8);
		byte[] encArr = Base64.getEncoder().encode(arr);
		cipherText = new String(encArr);
		return cipherText;
	}
	
	public static String decrypt(String cipherText) {
		String plainText = "";
		byte[] arr = cipherText.getBytes(StandardCharsets.UTF_8);
		
		byte[] decArr = Base64.getDecoder().decode(arr);
		plainText = new String(decArr);
		return plainText;
	}
}
