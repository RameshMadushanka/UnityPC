/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnityPC;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.InvalidKeySpecException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Derushan
 */
public class AESAlgorithm {
    
     private static final String algo = "AES";
    private static final byte[] keyValue = new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
    
   
    
    public static Key generateKey()throws Exception 
    {
       Key key= new SecretKeySpec(keyValue, algo);
       return key;
    }
    
    public static String encrypt(String msg)throws Exception 
    {
      Key key = generateKey();
      Cipher c = Cipher.getInstance(algo);
      c.init(Cipher.ENCRYPT_MODE, key);
      byte[] encVal =c.doFinal(msg.getBytes());
      String encryptedValue = new BASE64Encoder().encode(encVal);
      return encryptedValue;
      
    }
    public static  String decrypt(String msg)throws Exception 
    {
      Key key = generateKey();
      Cipher c = Cipher.getInstance(algo);
      c.init(Cipher.DECRYPT_MODE, key);
      byte[] decordedValue = new BASE64Decoder().decodeBuffer(msg);
      byte[] decVal =c.doFinal(decordedValue);
      String decryptedValue = new String(decVal);
      return decryptedValue;
    }
    
    public static void main(String args[]) throws Exception
    {
       
//        String password = "mypassword";
//        String passwordEnc = aes.encrypt(password);
//        String passwordDec = aes.decrypt(passwordEnc);
//
//        System.out.println("Plain Text : " + password);
//        System.out.println("Encrypted Text : " + passwordEnc);
//        System.out.println("Decrypted Text : " + passwordDec);
    }
    
}
