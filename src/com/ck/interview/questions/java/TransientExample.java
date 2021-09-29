package com.ck.interview.questions.java;

import java.io.Serializable;

// A sample class that uses transient keyword to skip their serialization.
class TransientExample implements Serializable {
   transient int age;
   // serialize other fields
   private String name;
   private String address;
   // other code
}