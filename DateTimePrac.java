import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Arrays;

class DateTimePrac{
    public static void main(String [] args){
        //dd-MM-YYYY format
        String inputDate = "07-01-2025";
        
        //DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate,formatter);
        System.out.println("Date  : "+date);
        
        //Find and display day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of week : "+dayOfWeek);
        
        //calculate diff between input and current date
        LocalDate currDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(date,currDate);
        System.out.println("Days between input and current date : " + daysBetween);
        
        //in a formatted pattern (dd-MM-yyyy HH:mm:ss)
        LocalDateTime currDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Curr date time in a formatted way "+ currDateTime.format(dateTimeformatter));
        
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("    Math , Random , Utility Methods   ");
        System.out.println("-----------------------------------------");
        System.out.println();
        
        //Function to generate random class --------------------------
        Random random = new Random();
        System.out.println("Random number between 0 to 99 : " + random.nextInt(100));
        
        //Using Math.random()
        double randomDouble = Math.random()*100;
        System.out.println("Random double 0-100 : " +(int)randomDouble);
        
        //Mathematical Operations
        int num = -25;
        System.out.println("Absolute value of -25 : " + Math.abs(num));
        System.out.println("Square root of 25 : " + Math.sqrt(25));
        System.out.println("2 raised to power of 3 : " + (int)Math.pow(2,3));
        
        //Array Manipulate
        int [] numbers = {5,4,3,2,1};
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Binary Search of 3 : " + Arrays.binarySearch(numbers,3));      
    }
}