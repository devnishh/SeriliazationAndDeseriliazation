package com.jspider.seriliazationandDeserialization.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.jspider.seriliazationandDeserialization.Object.User;

public class Serializations {
	public static void main(String[] args) {
		File file = new File("Demo.text");
		try {
			FileOutputStream fileOutputStream  = new FileOutputStream(file);
			
			ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
			
			User user = new User();
			user.setUserName("nishnt");
			user.setEmail("nishant1234@gmail.com");
			user.setMobleNumber(1236547890L);
			user.setPassword("nishh123");

			objectOutputStream.writeObject(user);
			System.out.println("object is serialized");
			objectOutputStream.close();
			fileOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
