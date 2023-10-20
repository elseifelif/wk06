import java.io.*;
import java.util.Scanner;

public class Notes {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Lütfen bir bir metin yazınız:");
            String input = scan.nextLine();

            FileWriter fileWriter = new FileWriter("src/text.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(input);
            printWriter.close();

            FileReader read = new FileReader("src/text.txt");
            BufferedReader bufferedReader = new BufferedReader(read);


            String textReading =  bufferedReader.readLine();

            while (textReading != null) {
                System.out.print(textReading);
                textReading = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
