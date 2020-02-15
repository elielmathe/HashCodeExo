public class ExoPizza1 {

	public static void main(String[] args) {
		int types = 4;
		int h[] = {2,5,6,8};
		int max = 17;
		
		System.out.println(provideBestPizza(types,h,max));
	}
	
	public static String provideBestPizza(int types,int h[],int max) {
		int rem;
		int sumMax = 0;
		int remFound = 0;
		for(int j = (int)Math.pow(2,h.length) ; j > 0 ; j--) {
			rem = j - 1;
			int sum = 0;
			for(int i = 0; i < 4;i++) {
				sum += rem % 2 * h[i];	
				if(sumMax < sum && sum <= max) {
					sumMax = sum;
					remFound = j - 1;
				}
				
				rem = (int) Math.floor(rem / 2);
			}
			
		}
		
		String returnStr = "";
		returnStr = sumMax + "\n";
		rem = remFound;
		
		for(int i = 0; i < 4;i++) {
			if(rem % 2 == 1) {
				returnStr += i + " ";
			}
			rem = (int) Math.floor(rem / 2);
		}
		
		return returnStr;
	}

}
