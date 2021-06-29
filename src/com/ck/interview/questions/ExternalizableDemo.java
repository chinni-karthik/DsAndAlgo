package com.ck.interview.questions;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo implements Externalizable {
	String name;
	int age;
	int jobId;

	// No-argument constructor
	public ExternalizableDemo() {
		System.out.println("Public no-argument constructor");
	}

	// Default constructor
	public ExternalizableDemo(String name, int age, int jobId) {
		this.name = name;
		this.age = age;
		this.jobId = jobId;
	}

	// Implementing write external method
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}

	// Implementing readExternal method
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
	}

	// Main method
	public static void main(String[] args) throws Exception {
		// Java Object
		ExternalizableDemo t1 = new ExternalizableDemo("Ram", 35, 23675);

		// Serialization -> Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);

		// Deserialization -> Reading the object from a file
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo t2 = (ExternalizableDemo) ois.readObject();

		// Printing Deserialized Object
		System.out.println("Name :"
				+ " " + t2.name + " "
				+ "Age :"
				+ " " + t2.age);
	}
}