//this is domain class which contains CoronaVaccine class
public class Patient {

    private String firstName;
    private String lastName;
    private String dOB;
    private CoronaVaccine myVaccine;

    public Patient(String firstName, String lastName, String dateOfBirth, CoronaVaccine aVaccine) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dateOfBirth;
        this.myVaccine = aVaccine;}


        //getters
        public String getFirstName() {return this.firstName;}
        public String getLastName() { return this.lastName; }
        public String getDOB() { return this.dOB; }
        public CoronaVaccine getAVaccine() {return this.myVaccine; }

        //setters
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setLastName(String lastName) {this.lastName = lastName;}
        public void setDOB(String dOB) {this.dOB = dOB;}
        public void setAVaccine(CoronaVaccine aVaccine) {this.myVaccine = aVaccine;}

//the toString statement
        public String toString() {

            return this.firstName + " " + this.lastName + " \n Date of Birth: " + this.dOB + " " + this.myVaccine;


        }


}
