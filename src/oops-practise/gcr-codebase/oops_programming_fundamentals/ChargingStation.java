package oops_programming_fundamentals;

public class ChargingStation {
    static int totalStations=0;
    static int electricityRate;

    int stationId;
    int unitsConsumed;

    public ChargingStation(int stationId , int unitsConsumed){
        this.unitsConsumed=unitsConsumed;
        this.stationId=stationId;
        totalStations++;
    }
    public void calculateBill(){
        int bill = unitsConsumed * electricityRate;
        System.out.println("Bill"+ bill);
    }
    public void displayStationsDetails(){
        System.out.println(" Stations id is " + stationId);
    }

}
    class MainChargingS{
        public static void main(String[] args) {
            ChargingStation.electricityRate=10;
            ChargingStation s1 = new ChargingStation(1,20);
            ChargingStation s2 = new ChargingStation(2,30);
            ChargingStation s3 = new ChargingStation(3,40);
            ChargingStation s4 = new ChargingStation(4,50);
            ChargingStation s5 = new ChargingStation(5,60);
            s1.displayStationsDetails();
            s1.calculateBill();

            s2.displayStationsDetails();
            s2.calculateBill();

            System.out.println("total stations" + ChargingStation.totalStations);
            System.out.println("changing electricity rate to 15");
            ChargingStation.electricityRate = 15;
            s1.calculateBill();
            s2.calculateBill();
        }
    }
