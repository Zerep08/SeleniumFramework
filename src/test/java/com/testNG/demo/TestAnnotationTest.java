package com.testNG.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

@Test
public class TestAnnotationTest {
 
  public void aTestMethod() {
	  System.out.println("A method execution");
  }
  
  public void zTestMethod() {
	  System.out.println("Z method execution");
  }

  public void bTestMethod() {
	  System.out.println("B method execution");
  }

  
  @BeforeClass
  public void setup() {
	  System.out.println("Setup");
  }

  @AfterClass
  public void tearDown() {
	  System.out.println("Closing");
  }

}
