package com.ck.interview.questions;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	// Lazy initialization
	private static SingletonClass singleInstance = null;

	// Prevent from Reflection.
	private SingletonClass() {
		if (singleInstance != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
	}

	// Use of double locking.
	public static SingletonClass getInstance() {
		if (singleInstance == null) {
			synchronized (SingletonClass.class) {
				if (singleInstance == null) {
					singleInstance = new SingletonClass();
				}
			}
		}
		return singleInstance;
	}

	// Clone prevention
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

	// Deserialization prevention
	protected Object readResolve() {
		return getInstance();
	}
}