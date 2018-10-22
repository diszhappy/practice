/**
 * 
 */
package in.diszhappy.enc;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author Saumm created on 22-Oct-2018 10:14:45 PM Desc : This class is written
 *         to demonstrate AES encryption and decryption
 */
public class AesEnc {
	private AesEnc() {

	}

	private static String key = "dAtAbAsE98765432";
	private static Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
	private static IvParameterSpec iv = new IvParameterSpec(key.getBytes());
	private static String salt = "mySalt";
	/**
	 * This method is written by Saumm on 22-Oct-2018 10:42:33 PM
	 * It is responsible to encrypt the plain text
	 * @param plainText
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws InvalidAlgorithmParameterException 
	 * @throws InvalidKeySpecException 
	 */
	public static byte[] encrypt(String plainText) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException {
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		KeySpec spec = new PBEKeySpec("Gadha".toCharArray(), salt.getBytes(), 65536, 256);
		SecretKey tmp = factory.generateSecret(spec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
		
		
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
		cipher.init(Cipher.ENCRYPT_MODE, secret,iv);
		byte[] encrypted = cipher.doFinal(plainText.getBytes());
		return encrypted;
		
	}
	/**
	 * This method is written by Saumm on 22-Oct-2018 10:43:26 PM
	 * It is responsible to decrypt the cipher text
	 * @param cipherText
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws InvalidAlgorithmParameterException 
	 * @throws InvalidKeySpecException 
	 */
	public static byte[] decrypt(byte[] cipherText) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException {

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		KeySpec spec = new PBEKeySpec("Gadha".toCharArray(), salt.getBytes(), 65536, 256);
		SecretKey tmp = factory.generateSecret(spec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
		
		
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, secret,iv);
		byte[] decrypted = cipher.doFinal(cipherText);
		return decrypted;
	}
}
