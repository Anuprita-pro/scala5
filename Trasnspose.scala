/* Que 2: Write a program to find transpose of matrix */
import Array._
object Trasnspose 
{ 
    val A = Array.ofDim[Int](3,3)    
      
    // Driver code 
    def main (args : Array[String]) { 
         A(0)(0) = 1
        A(0)(1) = 2
        A(0)(2) = 3
        A(1)(0) = 4
        A(1)(1) = 5
        A(1)(2) = 6
        A(2)(0) = 7
        A(2)(1) = 8
        A(2)(2) = 9

println ("Original Matrix is:")
	for (i <- 0 to 2){
            for (j <- 0 to 2){
		println(""+ A(i)(j))
                }
	println();

	}
 
print("Result matrix is \n"); 
        for (i <- 0 to 2) { 
            for (j <-0 to 2){ 
            	println(" " + A(j)(i)); 
                } 
 	print("\n"); 
    	} 
	}  

}


/*
Output:

Original Matrix is:
1
2
3

4
5
6

7
8
9

Result matrix is 
 1
 4
 7

 2
 5
 8

 3
 6
 9





*/
