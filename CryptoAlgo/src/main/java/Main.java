

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
public class Main {
    
     
     public static void main(String[] args) throws FileNotFoundException {
 final String secretKey = "world";
     File oneWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/oneword.txt"); 
      File tenWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/tenword.txt"); 
       File hundredWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/hundredword.txt"); 
        File thousandWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/thousandword.txt"); 
     Scanner s = new Scanner(oneWordFile);
     Scanner x = new Scanner(tenWordFile);
      Scanner y = new Scanner(hundredWordFile);
       Scanner z = new Scanner(thousandWordFile);
     String oneWord = ""; 
     String tenWord= "";
     String hundredWord = ""; 
     String thousandWord = ""; 
     
         while(s.hasNext()){
              oneWord+= s.nextLine();
         }
           while(x.hasNext()){
              tenWord+= x.nextLine();
         }
             while(y.hasNext()){
              hundredWord+= y.nextLine();
         }
               while(z.hasNext()){
              thousandWord+= z.nextLine();
         }
         
    // enc  for one word     
    long startEnc1 = System.nanoTime();
    String encryptedString1 = AES.encrypt(oneWord, secretKey) ;
    long finishEnc1 = System.nanoTime();
    long timeElapsedEnc1 = finishEnc1 - startEnc1; 
    double secondsEnc1 = (double)timeElapsedEnc1 / 1000000000;
    // dec for one word
    long startDec1 = System.nanoTime();
    String decryptedString1 = AES.decrypt(encryptedString1, secretKey) ;
    long finishDec1 = System.nanoTime();
    long timeElapsedDec1 = finishDec1 - startDec1; 
    double secondsDec1 = (double)timeElapsedDec1 / 1000000000;
    
     // enc  for ten word     
    long startEnc2 = System.nanoTime();
    String encryptedString2 = AES.encrypt(tenWord, secretKey) ;
    long finishEnc2 = System.nanoTime();
    long timeElapsedEnc2 = finishEnc2 - startEnc2; 
    double secondsEnc2 = (double)timeElapsedEnc2 / 1000000000;
    // dec for ten word
    long startDec2 = System.nanoTime();
    String decryptedString2 = AES.decrypt(encryptedString2, secretKey) ;
    long finishDec2 = System.nanoTime();
    long timeElapsedDec2 = finishDec2 - startDec2; 
    double secondsDec2 = (double)timeElapsedDec1 / 1000000000;
    
      // enc  for hundred word     
    long startEnc3 = System.nanoTime();
    String encryptedString3 = AES.encrypt(hundredWord, secretKey) ;
    long finishEnc3 = System.nanoTime();
    long timeElapsedEnc3 = finishEnc3 - startEnc3; 
    double secondsEnc3 = (double)timeElapsedEnc3 / 1000000000;
    // dec for hundred word
    long startDec3 = System.nanoTime();
    String decryptedString3 = AES.decrypt(encryptedString3, secretKey) ;
    long finishDec3 = System.nanoTime();
    long timeElapsedDec3 = finishDec3 - startDec3; 
    double secondsDec3 = (double)timeElapsedDec3 / 1000000000;
    
      // enc  for thousand word     
    long startEnc4 = System.nanoTime();
    String encryptedString4 = AES.encrypt(thousandWord, secretKey) ;
    long finishEnc4 = System.nanoTime();
    long timeElapsedEnc4 = finishEnc4 - startEnc4; 
    double secondsEnc4 = (double)timeElapsedEnc4 / 1000000000;
    // dec for thousand word
    long startDec4 = System.nanoTime();
    String decryptedString4 = AES.decrypt(encryptedString4, secretKey) ;
    long finishDec4 = System.nanoTime();
    long timeElapsedDec4 = finishDec4 - startDec4; 
    double secondsDec4 = (double)timeElapsedDec4 / 1000000000;
    
     System.out.println("For one word");
     System.out.println("Original string: " +oneWord);
     System.out.println("Encrypted string: " +encryptedString1);
     System.out.println("Decryption back to original: " +decryptedString1);
     System.out.println("Time for encryption: " + secondsEnc1);
     System.out.println("Time for decryption: " + secondsDec1);
         System.out.println("----------------------------");
     System.out.println("For ten words");
     System.out.println("Original string: " +tenWord);
     System.out.println("Encrypted string: " +encryptedString2);
     System.out.println("Decryption back to original: " +decryptedString2);
     System.out.println("Time for encryption: " + secondsEnc2);
     System.out.println("Time for decryption: " + secondsDec2);
       System.out.println("----------------------------");
     System.out.println("For hundred words");
     System.out.println("Original string: " +hundredWord);
     System.out.println("Encrypted string: " +encryptedString3);
     System.out.println("Decryption back to original: " +decryptedString3);
     System.out.println("Time for encryption: " + secondsEnc3);
     System.out.println("Time for decryption: " + secondsDec3);
       System.out.println("----------------------------");
     System.out.println("For thousand words");
     System.out.println("Original string: " +thousandWord);
     System.out.println("Encrypted string: " +encryptedString4);
     System.out.println("Decryption back to original: " +decryptedString4);
     System.out.println("Time for encryption: " + secondsEnc4);
     System.out.println("Time for decryption: " + secondsDec4);
   }
}
