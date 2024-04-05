package com.jspider.seriliazationandDeserialization.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.jspider.seriliazationandDeserialization.Object.User;

public class Deserialization {
	public static void main(String[] args) {
		File file = new File("demo.text");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			
			ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream);
			
		User user = (User)objectinputStream.readObject();
		System.out.println(user);
		objectinputStream.close();
		fileInputStream.close();
		} catch (Exception e) {
		}
	}

}
