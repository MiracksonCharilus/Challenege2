public class CoronaVaccine {

    private String vaccineManufacturer;
    private int numDoses;
    private String locFirstShot;
    private String dateFirstShot;
    private String locSecondShot;
    private String dateSecondShot;

    public CoronaVaccine(String vaccineManufacturer, int numDoses, String locFirstShot, String dateFirstShot, String locSecondShot, String dateSecondShot)
    {
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
    //setter
    public void setVaccineManufacturer(String vaccineManufacturer)
    {
        this.vaccineManufacturer = vaccineManufacturer
    }

}
