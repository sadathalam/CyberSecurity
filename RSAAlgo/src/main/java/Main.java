
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
public class Main {
  static  byte[] oneWordEncrypted; 
   static  byte[] tenWordEncrypted; 
    static  byte[] hundredWordEncrypted; 
     static  byte[] thousandWordEncrypted; 
    public static void main(String[] args) throws IOException
    {
        RSA rsa = new RSA();
        File oneWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/oneword.txt"); 
      File tenWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/tenword.txt"); 
       File hundredWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/twofiftysix.txt"); 
        File thousandWordFile = new File("/Users/mdala/OneDrive/Documents/Fall 2020 GSU/Cyber Security/thousandword.txt"); 
     Scanner s = new Scanner(oneWordFile);
     Scanner x = new Scanner(tenWordFile);
      Scanner y = new Scanner(hundredWordFile);
       Scanner z = new Scanner(thousandWordFile);
     String oneWord = ""; 
     String tenWord= "";
     String twoFiftySixByte = ""; 
     String thousandWord = ""; 
     
         while(s.hasNext()){
              oneWord+= s.nextLine();
         }
           while(x.hasNext()){
              tenWord+= x.nextLine();
         }
             while(y.hasNext()){
              twoFiftySixByte+= y.nextLine();
         }
               while(z.hasNext()){
              thousandWord+= z.nextLine();
         }
               // start of enc and dec for one word
        System.out.println("Original string: " + oneWord);
        // encrypt for one word
         long startEnc1 = System.nanoTime(); //start time
         oneWordEncrypted = rsa.encrypt(oneWord.getBytes());
          long finishEnc1 = System.nanoTime(); //fnish time
           long timeElapsedEnc1 = finishEnc1 - startEnc1;  //elapsed time
            double secondsEnc1 = (double)timeElapsedEnc1 / 1000000000; //time in seconds
        System.out.println("Encrypted:  " + bytesToString(oneWord.getBytes()));
        // decrypt for one word
         long startDec1 = System.nanoTime();
        byte[] decrypted = rsa.decrypt(oneWordEncrypted);
         long finishDec1 = System.nanoTime();
    long timeElapsedDec1 = finishDec1 - startDec1; 
    double secondsDec1 = (double)timeElapsedDec1 / 1000000000;
     System.out.println("Decrypted String: " + new String(decrypted));
        System.out.println("Time to encrypt: "+ secondsEnc1);
        System.out.println("Time to decrpyt: "+ secondsDec1);
        System.out.println("--------------------");
        
        // start of enc and dec for ten word
        System.out.println("Original string: " + tenWord);
        // encrypt for ten word
         long startEnc2 = System.nanoTime(); //start time
         tenWordEncrypted = rsa.encrypt(tenWord.getBytes());
          long finishEnc2 = System.nanoTime(); //fnish time
           long timeElapsedEnc2 = finishEnc2 - startEnc2;  //elapsed time
            double secondsEnc2 = (double)timeElapsedEnc2 / 1000000000; //time in seconds
        System.out.println("Encrypted:  " + bytesToString(tenWord.getBytes()));
        // decrypt for ten word
         long startDec2 = System.nanoTime();
        byte[] decrypted2 = rsa.decrypt(tenWordEncrypted);
         long finishDec2 = System.nanoTime();
    long timeElapsedDec2 = finishDec2 - startDec2; 
    double secondsDec2 = (double)timeElapsedDec2 / 1000000000;
     System.out.println("Decrypted String: " + new String(decrypted2));
        System.out.println("Time to encrypt: "+ secondsEnc1);
        System.out.println("Time to decrpyt: "+ secondsDec1);
        System.out.println("--------------------");
        
        // start of enc and dec for hundred word
        System.out.println("Original string: " + twoFiftySixByte);
        // encrypt for hundred word
         long startEnc3 = System.nanoTime(); //start time
         hundredWordEncrypted = rsa.encrypt(twoFiftySixByte.getBytes());
          long finishEnc3 = System.nanoTime(); //fnish time
           long timeElapsedEnc3 = finishEnc3 - startEnc3;  //elapsed time
            double secondsEnc3 = (double)timeElapsedEnc3 / 1000000000; //time in seconds
        System.out.println("Encrypted:  " + bytesToString(twoFiftySixByte.getBytes()));
        // decrypt for 100 word
         long startDec3 = System.nanoTime();
        byte[] decrypted3 = rsa.decrypt(hundredWordEncrypted);
         long finishDec3 = System.nanoTime();
    long timeElapsedDec3 = finishDec3 - startDec3; 
    double secondsDec3 = (double)timeElapsedDec3 / 1000000000;
    System.out.println("Decrypted String: " + new String(decrypted3));
        System.out.println("Time to encrypt: "+ secondsEnc3);
        System.out.println("Time to decrpyt: "+ secondsDec3);
        System.out.println("--------------------");
        
         
       
    }

    private static String bytesToString(byte[] encrypted) {
        String test = "";
        for (byte b : encrypted)
        {
            test += Byte.toString(b);
        }
        return test;
    }
}
