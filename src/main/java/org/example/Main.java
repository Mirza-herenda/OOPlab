package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)
            throws IOException
    {
        // Enter data using BufferReader

        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter the password:");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String name = reader.readLine();
            if(name.equals("12345")){
                System.out.println("secret is 12345");
                break;
            }else{
                System.out.println("nije pogodjen");
            }
        }
        // Printing the read line

    }
}

