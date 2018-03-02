package com.qspiders.test;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void sampletest() {
		
		String browserNAme = System.getProperty("browser");
		String url = System.getProperty("url");

		System.out.println("browserNAme==>"+browserNAme);
		System.out.println("url==>"+url);

	}

}
