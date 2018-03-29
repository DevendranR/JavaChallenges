package test;

public class BinaryDecimal {
	public int BinaryToDecimal(int binaryNumber){
		 
	    int decimal = 0;
	    int p = 0;
	    while(true){
	      if(binaryNumber == 0){
	        break;
	      } else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }
	    }
	    return decimal;
	  }
	
	public Long decimalToBinary(int decimal){
		int n;
        String x = "";
        n= decimal;
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        
        return Long.parseLong(x);
	}
}
