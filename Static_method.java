import static java.lang.System.out;
import static java.lang.Math.*;
class Static_method{
	public static void main(String[] args){
		double am = sqrt(36); 
// insted using Math.sqrt static is help to reduce the line and can put sqrt.
		
		double st = tan(6);
// only need to specify mathematical functions .
	
		// no need to put System again nd again using static we can access all the static members (variables and methods 
		out.println("Square root of 36 is : "+am);
		out.println("Tan theta calculating value is "+st);
		
	}
}