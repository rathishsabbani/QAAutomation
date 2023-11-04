package com.practiceclasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityMethods {




		@Test(priority=-50)
	    public void sample1()
	    {
	        Reporter.log("Sample 1",true);
	    }
	    
	    
	    @Test()
	    public void sample2()
	    {
	        Reporter.log("Sample 2",true);
	    }
	    
	    
	    @Test(priority=-25)
	    public void sample3()
	    {
	        Reporter.log("Sample 3",true);
	    }
	    
	    @Test()
	    public void sample4()
	    {
	        Reporter.log("Sample 4",true);
	    }

	}


