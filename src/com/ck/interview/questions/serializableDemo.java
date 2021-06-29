package com.ck.interview.questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class serializableDemo implements Serializable {
	String name;
	int age;
	int jobId;

	// Default constructor
	public serializableDemo(String name, int age, int jobId) {
		this.name = name;
		this.age = age;
		this.jobId = jobId;
	}

	public static void main(String[] args) throws Exception {
		// Java Object
		serializableDemo t1 = new serializableDemo("Ram", 34, 2364);
		
		// Serialization -> Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		System.out.println("Object has been serialized");

		//Deserialization -> Reading the object from a file
		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		serializableDemo t2 = (serializableDemo) ois.readObject();
		System.out.println("Object has been deserialized ");

		//Printing Deserialized Object
		System.out.println("Name:" + t2.name + "\n"
				+ "Age:" + t2.age + "\n"
				+ t2.jobId);
	}
}