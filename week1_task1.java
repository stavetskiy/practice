public class SquareRoot {

	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;

		//PUT YOUR CODE HERE
		    
              double x1 = 0.0;
        double x2 = 0.0;
        if(a != 0) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if(b == 10){
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        } else {
            System.out.println("x1=");
            System.out.println("x2=");
        }
		//PUT YOUR CODE HERE
	}
}
      
      
