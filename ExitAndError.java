import java.io.*;
class ExitAndError{
	public static void main(String [] args){
		/*	
			System.exit(int status) method terminates java virtual machine completely.
			1. Stopping all running threads
			2. Releasing system resources
			
			System.exit(int status) takes an integer argument:

			0 → Successful termination (Normal exit)
			1 or any non-zero value → Abnormal termination (Error occurred)
		*/
		
		System.out.println("before execution");
		System.exit(0);
		System.out.println("After execution it will never reach here");
		
		
		
		int number = -5;
        if (number < 0) {
            System.err.println("Error : Negative number !");
            System.exit(1); // Abnormal termination
        }
		
		
		
		//We can redirect System.err messages to a separate file and keep normal ouput in the console
		try{
			PrintStream errorFile = new PrintStream(new File("error.log")); //needs import java.io.*;
			System.setErr(errorFile);
			System.out.println("This will be printed in the console.");
			System.err.println("This error message will go to error.log");
		}catch(Exception e){
			System.out.println("Error creating file " + e);
		}
	}
}