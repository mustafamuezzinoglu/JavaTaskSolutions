package day11_SwithStatements;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 4;
        String res="";

        if(floorNumber>=1 && floorNumber<=3){
            switch(floorNumber){
                case 1: res="Floor "+floorNumber+" selected. Companies: Lobby, Verizon, Starbucks"; break;
                case 2: res="Floor "+floorNumber+" selected. Companies: Cybertek, NASA, Intelsat"; break;
                default: res="Floor "+floorNumber+" selected. Companies: Lyft, BofA, Stake house";

            }
        }else{
            res="Invalid floor - "+ floorNumber;
        }
    System.out.println(res);
    }

}
