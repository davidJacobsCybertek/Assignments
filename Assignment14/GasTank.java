package Homeworks.Assignment_14;

public class GasTank {
    public double amount = 0;
    public double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double add){
        amount=((amount+add)<capacity)?(amount+add):capacity;
    }

    public void useGas(double use){
        amount=(amount-use)>0?(amount-use):0;
    }

    public boolean isEmpty(){
        return (amount<0.1)?true:false;
    }

    public boolean isFull(){
        return (amount>(capacity-0.1))?true:false;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double amount0=amount;
        amount=capacity;

        return capacity-amount0;
    }

}
