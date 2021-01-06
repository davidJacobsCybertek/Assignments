package Homeworks.Assignment_14;

public class Value {
    int n1;
    int countSetVal=0;
    int countConstructor=0;

    public Value(int n1){
        this.n1=n1;
        countConstructor++;

    }
    public Value(){
    }
    public void setVal(int n1){
        this.n1=n1;
        countSetVal++;

    }
    public boolean wasModified(){
        return countSetVal>0?true:false;
    }

    public  int getVal(){
        if (wasModified()){
            return n1;
        }else if(countConstructor>0){
            return n1;
        }else{
            return 0;
        }
    }
}
