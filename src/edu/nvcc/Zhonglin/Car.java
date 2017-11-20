package edu.nvcc.Zhonglin;

/**
 * Car class is a class to get a car's infotmation
 */

public class Car {
    private static int count;
    /**
     * car's color
     */
    public String color;
    /**
     * car's horsepower
     */
    public int horsepower;
    /**
     * car's enginesize
     */
    public double enginesize;
    /**
     * car's make
     */
    public String make;

    /**
     *initialize car object
     */
    public Car(){count++;
    }
    /**
     * initialize person's name to name
     * initialize peoson's age to age
     * @param color
     * @param horsepower
     * @param enginesize
     * @param make
     *
     */
    public Car(String color,int horsepower,double enginesize,String make){
        this.color= color;
        this.horsepower= horsepower;
        this.enginesize=enginesize;
        this.make=make;
        count++;
    }

    /**
     * get a car's color
     * @return
     */
    public String getColor(){
        return color;
    }

    /**
     * get a car's horsepower
     * @return
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * get a car's enginesize
     * @return
     */
    public double getEnginesize(){
        return enginesize;
    }

    /**
     * get a car's make
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     * set a car's color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * set a car's horsepower
     * @param horsepower
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }/**
     * set a car's enginesize
     * @param enginesize
     */
    public void setEnginesize(double enginesize) {
        this.enginesize = enginesize;
    }/**
     * set a car's make
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * color horsepower enginesize make
     * @return
     */
    @Override
    public String toString() {
        return "is a "+color+", "+horsepower+" horsepower, "+enginesize+" L, "+make+" car.";
    }
    public static int getCount() {
        return count;
    }
}

