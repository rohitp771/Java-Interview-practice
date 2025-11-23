package OOPS.Inheritance;

public class Car {
    private Integer noOfWheels;
    private Boolean hasSunroof;
    private Integer manufacturedIn;

    public Car(Boolean hasSunroof, Integer manufacturedIn, Integer noOfWheels) {
        this.hasSunroof = hasSunroof;
        this.manufacturedIn = manufacturedIn;
        this.noOfWheels = noOfWheels;
    }

    public Integer getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(Integer noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Boolean getHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(Boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public Integer getManufacturedIn() {
        return manufacturedIn;
    }

    public void setManufacturedIn(Integer manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }


}
