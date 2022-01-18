Write a program to ca

object upperTriangular{
 
    val A = Array.ofDim[Int](3,3) 
var i = 0
var j = 0   
var x : boolean = true;
var a :       
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
	}
	println();

	}
 
println("Upper triangular matrix: ");    
            for(i <- 0 to 2){    
                for( j <- 0 to 2){    
                  if(i > j){    
                    print("0 ");
		}    
                  else{    
                    print(A(i)(j) + " ");    
                }    

	}                
println();   
    	} 
	}  

}

