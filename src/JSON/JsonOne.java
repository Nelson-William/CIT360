/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author willnelson
 */
public class JsonOne {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a name for your vehicle: ");
        String name = input.nextLine();
        System.out.print("Please enter your vehicle's model year: ");
        String year = input.nextLine();
        System.out.print("Please enter your vehicle's make: ");
        String make = input.nextLine();
        System.out.print("Please enter your vehicle's model: ");
        String model = input.nextLine();
        System.out.print("Please enter your vehicle's color: ");
        String color = input.nextLine();
        
        JSONObject carObject = new JSONObject();
        carObject.put("name", name);
        carObject.put("year", year);
        carObject.put("make", make);
        carObject.put("model", model);
        carObject.put("color", color);
        
        //Display resulting JSON file
        System.out.println("You drive a: " + carObject.toJSONString() + "\n");
        
        File saveFile = new File("JSONCar.txt");
        
        try (PrintWriter writer = new PrintWriter(saveFile)){
            writer.print(carObject.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("JSON File created successfully.\n\n Press enter to continue.");
        input.nextLine();
        
        try {
            input = new Scanner(saveFile);
            
            StringBuilder inboundJson = new StringBuilder();
            while (input.hasNextLine()) {
                inboundJson.append(input.nextLine());
            }
            System.out.println(inboundJson.toString());
            
            JSONParser parser = new JSONParser();
            JSONObject jsonObj = (JSONObject) parser.parse(inboundJson.toString());
            
            System.out.print("After parsing, you still drive a " + jsonObj.get("color") + " " + jsonObj.get("year") + " " + jsonObj.get("make") + " " + jsonObj.get("model") + " named " + jsonObj.get("name"));
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
}
