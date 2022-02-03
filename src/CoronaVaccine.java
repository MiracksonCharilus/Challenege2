//this is domain class
public class CoronaVaccine {

    private String vaccineManufacturer;
    private int numDoses;
    private String locFirstShot;
    private String dateFirstShot;
    private String locSecondShot;
    private String dateSecondShot;

    public CoronaVaccine(String vaccineManufacturer, int numDoses, String locFirstShot, String dateFirstShot, String locSecondShot, String dateSecondShot)
    {
        //creating this statements for everything
        this.vaccineManufacturer = vaccineManufacturer;
        this.numDoses = numDoses;
        this.locFirstShot = locFirstShot;
        this.dateFirstShot = dateFirstShot;
        this.locSecondShot = locSecondShot;
        this.dateSecondShot = dateSecondShot;
    }

    //getter
    public String getVaccineManufacturer()
    {
        return this.vaccineManufacturer;
    }
    public int getNumDoses() { return this.numDoses;}
    public String getLocFirstShot() { return this.locFirstShot;}
    public String getDateFirstShot() { return this.dateFirstShot;}
    public String getLocSecondShot() { return this.locSecondShot;}
    public String getDateSecondShot() { return this.dateSecondShot;}
    //setter
    public void setVaccineManufacturer(String vaccineManufacturer)
    {
        this.vaccineManufacturer = vaccineManufacturer;
    }
    public void setNumDoses(int numDoses) { this.numDoses = numDoses;}
    public void setLocFirstShot(String locFirstShot) {this.locFirstShot = locFirstShot;}
    public void setDateFirstShot(String dateFirstShot) {this.dateFirstShot = dateFirstShot;}
    public void setLocSecondShot(String locSecondShot) { this.locSecondShot = locSecondShot;}
    public void setDateSecondShot(String dateSecondShot) {this.dateSecondShot = dateSecondShot;}


    public String toString()
    {
        //creating toString statement
        return "\n Vaccine Manufacturer: " + vaccineManufacturer +
                " \n Number of doses: " + this.numDoses +
                " \n First shot location: " + this.locFirstShot +
                " \n First shot date: " + this.dateFirstShot +
                " \n Second shot location: " + this.locSecondShot +
                " \n Second shot date: " + this.dateSecondShot + " \n";

    }
}
