package cit360.httpUrlConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willnelson
 */

import java.io.BufferedReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Scanner;

/*public class ConnectionSyntax {
	
	/*HttpURLConnection is a class that is a subclass of URLConnection.  It provides support for HTTP
	public static void main(String[] args) throws Exception {
		try {
			URL url = new URL("http://www.colonelskernels.com");
			HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
			httpconnect.connect();
		}
		
	}
}*/

public class ConnectionExample{
	public static void main(String[] args) {
		try {
			/*Creating a request*/
			URL url = new URL("http://www.colonelskernels.com");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			
			/*Adding a Header*/
			connection.setRequestProperty("Content-Language","en-US");
			
			/*Reading Header*/
			String headerInfo = connection.getHeaderField("Content-Language");
			
			/*Setting a Cookie*/
			String deliciousCookie = "cookie=ChocolateChip";
			connection.setRequestProperty("Cookie", deliciousCookie);
			
			/*Getting Cookies by reading through headers*/
			String headerResponse = null;
			for (int i=1; (headerResponse = connection.getHeaderFieldKey(i))!=null; i++) {
				if (headerResponse.equals("Set-Cookie")) {
					String cookie = connection.getHeaderField(i);
				}
			}
			
			
			
		} catch (Exception e){
                    System.out.println("Error: "+ e.getMessage());
                }
	}

	
}