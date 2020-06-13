
public class Number {
	 private int value;  
     
	    public Number() {  
	        this(0);  
	    }  
	      
	    public Number(int value) {  
	        this.value = value;  
	    }  
	      
	    public int add(int rhs) {  
	        return value += rhs;  
	    }  
	      
	    public int minus(int rhs) {  
	        return value -= rhs;  
	    }  
	      
	    public int multiply(int rhs) {  
	        return value *= rhs;  
	    }  
	      
	    public int divide(int rhs) {  
	        return value /= rhs;  
	    }  
	      
	    public int getValue() {  
	        return value;  
	    }  
}
