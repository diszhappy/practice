package in.diszhappy.test;import javax.crypto.Cipher;

import in.diszhappy.enc.AesEnc;

public class EncTest {
	public static void main(String[] args) {
		try {
			if(Cipher.getMaxAllowedKeyLength("AES") < 129)
				return;
			byte[] cipher = AesEnc.encrypt("I am a plain text");
			System.out.println(new String(cipher));
			System.out.println(new String(AesEnc.decrypt(cipher)));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
