package com.ck.interview.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosableExample {
	public String readBlogDraftWithoutAutoClosable(String path) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		try {
			return buffer.readLine();
		} finally {
			buffer.close();
		}
	}

	//Try with resources
	public String readBlogDraftWithAutoClosable(String path) throws IOException {
		try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
			return buffer.readLine();
		}
	}
}
