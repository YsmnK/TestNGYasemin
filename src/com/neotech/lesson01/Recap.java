package com.neotech.lesson01;

public class Recap {

//	TestNG is an annotation based testing tool/framework
//
//	A testing framework is a set of guidelines and rules used for creating and designing test cases. A framework is a combination of practices and tools that are designed to help QA professionals test more efficiently.
//
//	TestNG is a tool seperate from Selenium, but we will use this tools together. 
//	-----------------------------
//	TestNG Installation:
//	-----------------------------
//	- This is done only once in Eclipse, not for every project!
//
//	Eclipse -> Help -> Marketplace -> Search TestNG -> Install
//	or
//	Eclipse -> Help -> Install New Software
//	Copy the link: https://testng.org/testng-eclipse-update-site
//	Select the checkbox and Finish. 
//	--------------------------------------------------
//	Steps to create the project:
//	We created a standard Java Project
//	We added the TestNG Library
//	Each time we use annotations, we have to import. 
//	We executed test cases using TestNG annotations with @Test
//	By default the test cases are executed in alphetical order
//
//
//	The most important annotations in TestNG is @Test. This is the real test case. 
//	We may have multiple @Test methods in our class. 
//	They are executed alphabetically (by default)
//
//	----------------------------------------------------
//	Before and After Annotation
//	Preconditions: (open browser, go to url....)
//	PostConditions: (close browser, generate reports...)
//	----------------------------------------------------
//	Reporting: 
//	- test-output folder (refresh)
//	- index.html
//	- emailable-report.html
//	---------------------------------------------------
//	When starting with Selenium:
//	- Add Selenium Jar files (later on we might need to add Common IO, Apache POI)
//	- Copy the driver folder
//	- Copy the configs folder
//	- Copy the com.neotech.utils package
//
//	---------------------------------------------------
//	What if we have more @Test methods??
//
//	Intuition: 
//
//	************NOT CORRECT************
//	BeforeClass
//		BeforeMethod
//			Test1
//			Test2
//		AfterMethod
//	AfterClass
//
//	************CORRECT************
//	BeforeClass
//	    BeforeMethod    -setUp()
//	        Test1
//	    AfterMethod     -tearDown()
//	    BeforeMethod    -setUp()
//	        Test2
//	    AfterMethod     -tearDown()
//	AfterClass
//
//	---------------------------------------------------
//
//	Suite
//		Test1
//		Test2
//			Class1
//			Class2
//				Method1
//				Method2
//					TestCase1
//					TestCase2
//					....
//					...
//					
//	
//	
//	
//	
}
