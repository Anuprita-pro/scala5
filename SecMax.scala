/*Que4:Write a program find second maximum number of 4 given numbers */
import scala.io.StdIn._;
import java.util._;

object SecMax{
 def main (args : Array[String]){

	var smax = 0;
	var max = 0;	 
	var sc = new Scanner(System.in);
	println("How many number do you want to enter");
	var num:Int= sc.nextInt();

	println("Enter the numbers");
	for(i <- 0 to num - 1){
		if(i == 0){
			var max:Int = sc.nextInt();
		}
		else {
			var temp:Int = sc.nextInt();
			if (temp > max){
				smax == max;
				max == temp;
			}
			else if (temp > smax){
                                smax == temp;
                                }		

			}

		}
	

println("second max number is :" + smax);

	}

}
