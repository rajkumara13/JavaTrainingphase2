class ParkingSystem {
    private int big;
    private int med;
    private int small;
    ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.med=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        if(carType==1){
            if(big>0){
                big--;
                return true;
            }
            return false;
        }
        else if(carType==2){
            if(med>0){
                med--;
                return true;
            }
            return false;
        }
        else{
            if(small>0){
                small--;
                return true;
            }
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */
public class Main {
    public static void main(String[] args) {
          ParkingSystem parkingSystem=new ParkingSystem(1,1,0);
          parkingSystem.addCar(1);
          System.out.println(parkingSystem.addCar(2));
        }
    }