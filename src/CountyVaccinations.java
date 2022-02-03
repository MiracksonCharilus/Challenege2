/**
 * @author 5716504
 * (Mirackson Charilus)
 *
 * Title: Challenge #2
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program’s Functionality: This program demonstrates the use of using getters and setters
 */


//this is a driver class
import java.util.Scanner;
public class CountyVaccinations {

    //creating global variables
    static Patient patient1;
    static Patient patient2;
    static Patient patient3;
    static CoronaVaccine record1;
    static CoronaVaccine record2;
    static CoronaVaccine record3;

    /**
     * (This main method calls the other methods)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void main(String[] args)
    {
        //calling the other methods
        vaccinatePeople();
        reportVaccinations();
    }
    /**
     * (This method asks the user info for all the patients)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void vaccinatePeople()
    {
        String vaccineManufacturer;
        int numDoses;
        String locFirstShot;
        String dateFirstShot;
        String locSecondShot;
        String dateSecondShot;

        String firstName;
        String lastName;
        String dOB;

//asking for info on patient 1
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the first name of  patient 1?");
        firstName = keyboard.nextLine();
        System.out.println("What is the last name of  " + firstName + " ?");
        lastName = keyboard.nextLine();
        System.out.println("What is the date of birth of " + firstName + " " + lastName + " ?");
        dOB = keyboard.nextLine();
        System.out.println("What is the name of your vaccine provider for " + firstName + " " + lastName +"?");
        vaccineManufacturer = keyboard.nextLine();
        System.out.println("How many doses did  " + firstName + " " + lastName + " get?");
        numDoses = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the location of the first dose for " + firstName + " " + lastName + " ?");
        locFirstShot = keyboard.nextLine();
        System.out.println("What is the date of the first dose for " + firstName + " " + lastName + " ?");
        dateFirstShot = keyboard.nextLine();
        System.out.println("What is the location of the second dose for " + firstName + " " + lastName + " ?");
        locSecondShot = keyboard.nextLine();
        System.out.println("What is the date of the second dose for " + firstName + " " + lastName + " ?");
        dateSecondShot = keyboard.nextLine();


        record1 = new CoronaVaccine(vaccineManufacturer, numDoses, locFirstShot, dateFirstShot, locSecondShot, dateSecondShot);
        patient1 = new Patient(firstName, lastName, dOB, record1);

//asking questions for person 2
        System.out.println("What is the first name of  patient 2?");
        firstName = keyboard.nextLine();
        System.out.println("What is the last name of  " + firstName + " ?");
        lastName = keyboard.nextLine();
        System.out.println("What is the date of birth of " + firstName + " " + lastName + " ?");
        dOB = keyboard.nextLine();
        System.out.println("What is the name of your vaccine provider for " + firstName + " " + lastName +"?");
        vaccineManufacturer = keyboard.nextLine();
        System.out.println("How many doses did  " + firstName + " " + lastName + " get?");
        numDoses = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the location of the first dose for " + firstName + " " + lastName + " ?");
        locFirstShot = keyboard.nextLine();
        System.out.println("What is the date of the first dose for " + firstName + " " + lastName + " ?");
        dateFirstShot = keyboard.nextLine();
        System.out.println("What is the location of the second dose for " + firstName + " " + lastName + " ?");
        locSecondShot = keyboard.nextLine();
        System.out.println("What is the date of the second dose for " + firstName + " " + lastName + " ?");
        dateSecondShot = keyboard.nextLine();

        record2 = new CoronaVaccine(vaccineManufacturer, numDoses, locFirstShot, dateFirstShot, locSecondShot, dateSecondShot);
        patient2 = new Patient(firstName, lastName, dOB, record2);

//asking for person 3
        System.out.println("What is the first name of  patient 3?");
        firstName = keyboard.nextLine();
        System.out.println("What is the last name of  " + firstName + " ?");
        lastName = keyboard.nextLine();
        System.out.println("What is the date of birth of " + firstName + " " + lastName + " ?");
        dOB = keyboard.nextLine();
        System.out.println("What is the name of your vaccine provider for " + firstName + " " + lastName +"?");
        vaccineManufacturer = keyboard.nextLine();
        System.out.println("How many doses did  " + firstName + " " + lastName + " get?");
        numDoses = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the location of the first dose for " + firstName + " " + lastName + " ?");
        locFirstShot = keyboard.nextLine();
        System.out.println("What is the date of the first dose for " + firstName + " " + lastName + " ?");
        dateFirstShot = keyboard.nextLine();
        System.out.println("What is the location of the second dose for " + firstName + " " + lastName + " ?");
        locSecondShot = keyboard.nextLine();
        System.out.println("What is the date of the second dose for " + firstName + " " + lastName + " ?");
        dateSecondShot = keyboard.nextLine();

        record3 = new CoronaVaccine(vaccineManufacturer, numDoses, locFirstShot, dateFirstShot, locSecondShot, dateSecondShot);
        patient3 = new Patient(firstName, lastName, dOB, record3);

    }

    /**
     * (This method prints out all needed info)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void reportVaccinations()
    {
        //printing out all info
    System.out.println(patient1);
    System.out.println(patient2);
    System.out.println(patient3);
    }
}
