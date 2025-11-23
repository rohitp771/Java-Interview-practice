package OOPS.Inheritance;

public class BMW extends Car{
    
    public BMW(Boolean hasSunroof, Integer manufacturedIn, Integer noOfWheels) {
        super(hasSunroof, manufacturedIn, noOfWheels);
    }

    public Integer getOnRoadPrice(Integer year){
        if(year == 2023){
            return 5000000;
        }else if (year == 2024) {
            return 6000000;
        }else 
            return 7000000;
    }

    public Integer getOnRoadPrice(Integer year,String city){
        if("Pune".equals(city) && year == 2023){
            return 5000000;
        }else if (year == 2024 && "Mumbai".equals(city)) {
            return 7000000;
        }else 
            return 6000000;
    }

    public static void main(String[] args) {
        BMW bmwCar = new BMW(true, 2025, 4);
        System.out.println("BMW Manufactured in : "+bmwCar.getManufacturedIn());
        System.out.println(bmwCar.getOnRoadPrice(2025));
    }
    
}
