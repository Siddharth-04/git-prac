import java.util.Arrays;
class ArrayPractice{
	public static void main(String [] args){
		/* Array is a data structure of non-primitive data type stored in a contiguous memmory location
			It allows multiple values stored in a single variable. */
		
		//Declaration -> type [] var-name
		int [] numbers;
		int [] numbers1 = new int[5];
		int [] numbers2 = {1,2,3,4,5};
		
		//Accessing arrays
		/*
			Indexing -> Accessing specific elements
			for-loop -> When index manipulation is needed
			for-each loop -> Simple iteration without index
			Arrays.toString() -> Printing the whole arrays
			2D Indexing  -> Working with matrices
			Jagged Indexing  -> Working with variable-length rows
		*/
		
		//1.Indexing
		System.out.print(numbers2[0] + "Indexing way");
		
		//2. For loop,here .length is a property of an array not a method
		for(int i=0 ; i<numbers2.length ; i++){
			System.out.print(numbers2[i] + " ");
		}
		
		System.out.println();
		
		//3.for-each loop
		System.out.println("for each -> best for read-only ");
		for(int num : numbers2){
			System.out.print(num);
		}
		
		System.out.println("Arrays.toString() -> Converts and array to a string,if we want to print array at once");
		
		System.out.println(Arrays.toString(numbers2)); // [1,2,3,4,5]
		
		/*
			MultiDimensional Array is like array of arrays.It allows storing data in rows and columns (like a table)
			
			Declaraion -> int [][] matrix;
			
			Size of multidimensional array = multiplying size of all dimensions i.e, numbers size -> 3*4 = 12;
		*/
		int [][] numbers4 = new int[3][4]; //-> 3 rows 4 columns;
		System.out.println("Size of this 2d array is : " +numbers4.length * numbers4[0].length);
		
		/*
			jagged array is a 2D array where each row can have different number of columns
			Declaraion => int[][] jagged = new int[3][];
		*/
		
		int[][] jagged = new int[3][];
		jagged[0] = new int[2]; //Row 0 has 2 cols
		jagged[1] = new int[3]; //Row 1 has 3 cols
		jagged[2] = new int[4]; //Row 2 has 4 cols
		
		
	}
}
