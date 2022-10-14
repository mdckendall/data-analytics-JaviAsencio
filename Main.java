import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {

  // Create the public class while preventing any issues related with the file.
  public static void main(String[] args) throws FileNotFoundException {

    // Create a scanner.
    Scanner Scanner = new Scanner(System.in);

    // Create an arry list, a file reader to read the "names.txt" file and a new scanner.
    ArrayList<String> arrayList = new ArrayList<>();
    FileReader fr = new FileReader ("names.txt");
    Scanner fileScanner = new Scanner(fr);

    // Get the input from user including any input that might have been skipped.
    while(fileScanner.hasNextLine()){
    arrayList.add(fileScanner.nextLine());
      
    }

    // Start the input at zero.
    int input = 0;

    // Display the different options.
    do {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");

      // Convert the characters into an integer type.
      input = Scanner.nextInt();

      // Display the different outcomes for each number.
      if(input == 1){
        System.out.println("$98,345 average salary in South Florida!");
      }
      if(input == 2){
        System.out.println("US News - 100 Best Jobs!");
      }
      if(input == 3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      if(input == 4){
        System.out.println("Current Students:");
        for(String s : arrayList) {
          System.out.println(s);
        }
      }  
      
      // To quit the program prevent the number from being equal to five.
    }while(input != 5);

    // Close the scanner.
    Scanner.close();
  } 
}