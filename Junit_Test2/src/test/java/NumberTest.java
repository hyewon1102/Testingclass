import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberTest {

	  @Test  
	    public void testNumber() {  
	        Number num = new Number();  
	        assertEquals(0, num.getValue());  
	    }  
	  
	    @Test  
	    public void testNumberInt() {  
	        Number num = new Number(10);  
	        assertEquals(10, num.getValue());  
	    }  
	  
	    @Test  
	    public void testAdd() {  
	        Number num = new Number(10);  
	        assertEquals(20, num.add(10));  
	    }  
	  
	    @Test  
	    public void testMinus() {  
	        Number num = new Number(10);  
	        assertEquals(5, num.minus(5));  
	    }  
	  
	    @Test  
	    public void testMultiply() {  
	        Number num = new Number(5);  
	        assertEquals(25, num.multiply(5));  
	    }  
	  
	    @Test  
	    public void testDivide() {  
	        Number num = new Number(20);  
	        assertEquals(2, num.divide(10));  
	    }  
	  
	    @Test  
	    public void testGetValue() {  
	        Number num = new Number(20);  
	        assertEquals(20, num.getValue());  
	    }  
}
