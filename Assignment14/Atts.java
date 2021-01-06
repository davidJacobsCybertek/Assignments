package Homeworks.Assignment_14;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Atts {
    public String name,color;
    public int amount;

    public String asString() {
        return  "name:" + name +
                " color:" + color +
                " amount:" + amount
                ;
    }

}

class test{
    public static void main(String[] args) {
        Atts a = new Atts();
        System.out.println(a.asString());

        LameCalculator lc= new LameCalculator();

        System.out.println(lc.multiply(8,7));

        Db db = new Db();
        db.insertData("year",2021 );
        System.out.println(db.getData());
        System.out.println(db.getYint());

        Person pr = new Person();
        System.out.println(pr.toString());

        GasTank tank=new GasTank(60);
        System.out.println("tank.amount = " + tank.amount);
        System.out.println("tank.isEmpty() = " + tank.isEmpty());
        System.out.println("tank.isFull() = " + tank.isFull());
        tank.addGas(45);
        System.out.println("tank.amount = " + tank.amount);
        tank.useGas(15);
        System.out.println("tank.getGasLevel() = " + tank.getGasLevel());
        System.out.println("tank.fillUp() = " + tank.fillUp());
        System.out.println("tank.isFull() = " + tank.isFull());
        tank.fillUp();

        Value val=new Value(88);
        System.out.println("val.wasModified() = " + val.wasModified());
        System.out.println("val.n1 = " + val.n1);
        //val.setVal(30);
        System.out.println("val.getVal() = " + val.getVal());

        System.out.println("calc.plus(7,8) = " + calc.plus(7, 8));

        Color col1=new Color(25,255,255);
        System.out.println(col1.toString());
    }

}