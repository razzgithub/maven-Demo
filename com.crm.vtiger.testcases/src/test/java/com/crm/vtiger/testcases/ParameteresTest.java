/**
 * 
 */
package com.crm.vtiger.testcases;

import org.testng.annotations.Test;

/**
 * @author BIKRAM
 *
 */
public class ParameteresTest {
	
	
	@Test
	public void GetData() {
		
		
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

}
