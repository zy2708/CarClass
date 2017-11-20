import edu.nvcc.Zhonglin.Car;

public class CarDriver {
    public static void main(String[]args){
        Car mycar=new Car();
        Car hiscar=new Car("Black",400,3.5,"Honda");
        Car hercar=new Car("Pink",300,2.5,"Volks");
        mycar.setColor("blue");
        mycar.setHorsepower(650);
        mycar.setEnginesize(6.5);
        mycar.setMake("Ferrari");
        System.out.println("My car "+mycar);
        System.out.println("His car "+hiscar);
        System.out.println("Her car "+hercar);
        System.out.println("My car is "+mycar.getColor()+" .");
        System.out.println("It has "+mycar.getHorsepower()+" horsepower.");
        System.out.println("It has a "+mycar.getEnginesize()+" L engine");
        System.out.println("It's make is "+mycar.getMake()+" .");

    }
}
