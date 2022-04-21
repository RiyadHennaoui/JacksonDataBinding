package fr.afpa.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try{

            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to Java Pojo:
            // data/sample-lite.json
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

            //print first name and last name
            System.out.println("Firstname : " + student.getFirstName());
            System.out.println("Lastname : " + student.getLastName());

            //use Address
            Address tempsAddress = student.getAddress();
            System.out.println("City :" + tempsAddress.getCity());

            // array of languages
            student.getLanguages().forEach(System.out::println);

        }catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
