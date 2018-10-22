/**
 * 
 */
package in.diszhappy.enc;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Saumm created on 22-Oct-2018 10:10:45 PM 
 * Desc : This class is written to demonstrate Base64 Encryption
 */
public class Base64Enc {
	/**
	 * This method is written by Saumm on 22-Oct-2018 10:11:31 PM
	 * It is responsible for encryption of any String or text
	 * @param plainText
	 * @return Cipher Text
	 * @throws UnsupportedEncodingException
	 */
	public static String encrypt(String plainText) throws UnsupportedEncodingException {
		String cipherText = "";
		
		byte[] arr = plainText.getBytes(StandardCharsets.UTF_8);
		byte[] encArr = Base64.getEncoder().encode(arr);
		cipherText = new String(encArr);
		return cipherText;
	}
	/**
	 * This method is written by Saumm on 22-Oct-2018 10:12:34 PM
	 * It is responsible for decryption of cipher text 
	 * @param cipherText
	 * @return Plain Text
	 */
	public static String decrypt(String cipherText) {
		String plainText = "";
		byte[] arr = cipherText.getBytes(StandardCharsets.UTF_8);
		
		byte[] decArr = Base64.getDecoder().decode(arr);
		plainText = new String(decArr);
		return plainText;
	}
}
