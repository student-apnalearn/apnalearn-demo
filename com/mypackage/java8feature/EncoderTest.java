package com.mypackage.java8feature;
// The below program is for encoder and decoder
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderTest {
	public static void main(String[] args) {
		Encoder encoder = Base64.getEncoder();
		byte a[] =new byte[5];
		a[0]=1;
		System.out.println(encoder.encodeToString(a));
		
		
		byte a1[]=Base64.getDecoder().decode("AQAAAAA=");
		for (byte b : a1) {
			System.out.println(b);
		}
		
	}

}
