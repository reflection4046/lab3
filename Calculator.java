package lab3;

public class Calculator {
	
 public Calculator() {
	 
	 
}
	    
	 public Calculator(double number1, double number2) 
	    {
		
			this.number1 = number1;
			this.number2 = number2;
		}
	    
		private double number1;
	    private double number2;
	    
	    public double add ()
	    
	    {
	    	
	    	return number1+number2;
	    }
	    
	   public double sub ()
	    
	    {
	    	
	    	return number1-number2;
	    }
	   
	   public double multi ()
	   
	   {
	   	
	   	return number1*number2;
	   }
	   
	   
	   public double div ()
	   
	   {
	   	
	   	return number1/number2;
	   }



	   
	  public String toString()

	{
		return "Calculator [number1=" + number1 + ", number2=" + number2 + "]";
		
	}
	   
	   
	     
	}


