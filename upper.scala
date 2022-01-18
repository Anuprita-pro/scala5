/*Que 4: write a program to check if matrix is upper 
traingular or not*/

//import Array._
object upper 
{ 
    val A = Array.ofDim[Int](3,3)    
	var flag   = true    
    // Driver code 
    def main (args : Array[String]) { 
         A(0)(0) = 1
        A(0)(1) = 2
        A(0)(2) = 3
        A(1)(0) = 0
        A(1)(1) = 5
        A(1)(2) = 6
        A(2)(0) = 0
        A(2)(1) = 0
        A(2)(2) = 9

 println ("Original Matrix is:");
	for (i <- 0 to 2){
            for (j <- 0 to 2){
		println(""+ A(i)(j))
                }
	println();

	}


for (i <- 0 to 2){
	for (j <- 0 to i){
	if (A(i)(j) != 0){
		flag = true;
		}
	else	{	
		flag = false;
		}
	}	
	}

if (flag == false){
	println(" Given Matrix is Upper Triangular Matrix");
	}
else{
	println(" Given Matrix is Not an Upper Triangular Matrix")
	}

}
}

/*
Output:

Original Matrix is:
1
2
3

0
5
6

0
0
9

 Given Matrix is Upper Triangular Matrix


Original Matrix is:
1
2
3

4
5
6

5
0
9
 Given Matrix is Not an Upper Triangular Matrix
*/
