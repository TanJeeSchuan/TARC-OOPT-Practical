/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q3;

/**
 *
 * @author Tan Jee Schuan
 */
public class P5Q3 {
    public static void main(String[] args) {
        
        if (args.length < 2)
        {
            System.out.println(args[0] + " " + args[1]);
            System.exit(-1);
        }
        
        String title = args[args.length - 1];
        
        String surname = "";
        String firstname = "";
        for (String word : args)
        {
            word = word.strip();
            
            //surname in brackets
            if (word.contains("[") && word.contains("]"))
            {
                word = word.replace("[","");
                word = word.replace("]","");
                surname = word;
                
                surname = surname.toLowerCase();
                //first char captitalise
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1,surname.length());
            }
            
            word = word.toLowerCase();
            //first char captitalise
            word = word.substring(0,1).toUpperCase() + word.substring(1,word.length());
            
            if (!surname.equals(word) && !word.equals(title))
                firstname = firstname + " " + word;
            firstname = firstname.strip();
        }
        
        
        
        String fullName = firstname + " " + surname;
        
                
        System.out.println("To: " + fullName);
        System.out.println("Wishing you a Merry Christmas, " + title + " " + surname);
    }
}
