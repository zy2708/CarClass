import edu.nvcc.Zhonglin.Car;

import javax.swing.*;

public class NewCar {
    public static void main(String[]args){
        Car car1=new Car();
        String color1= JOptionPane.showInputDialog("Enter the first car's color");
        String horsepower1= JOptionPane.showInputDialog("Enter the first car's horsepower");
        String enginesize1= JOptionPane.showInputDialog("Enter the first car's enginesize in liter");
        String make1= JOptionPane.showInputDialog("Enter the first car's make");

        car1.setColor(color1);
        car1.setHorsepower(Integer.parseInt(horsepower1));
        car1.setEnginesize(Double.parseDouble(enginesize1));
        car1.setMake(make1);

        JOptionPane.showMessageDialog(null,"The first car "+car1);
        Car car2=new Car();
        String color2= JOptionPane.showInputDialog("Enter the second car's color");
        String horsepower2= JOptionPane.showInputDialog("Enter the second car's horsepower");
        String enginesize2= JOptionPane.showInputDialog("Enter the second car's enginesize in liter");
        String make2= JOptionPane.showInputDialog("Enter the second car's make");

        car2.setColor(color2);
        car2.setHorsepower(Integer.parseInt(horsepower2));
        car2.setEnginesize(Double.parseDouble(enginesize2));
        car2.setMake(make2);

        JOptionPane.showMessageDialog(null,"The second car "+car2);
        Car car3=new Car();
        String color3= JOptionPane.showInputDialog("Enter the third car's color");
        String horsepower3= JOptionPane.showInputDialog("Enter the third car's horsepower");
        String enginesize3= JOptionPane.showInputDialog("Enter the third car's enginesize in liter");
        String make3= JOptionPane.showInputDialog("Enter the third car's make");

        car3.setColor(color3);
        car3.setHorsepower(Integer.parseInt(horsepower3));
        car3.setEnginesize(Double.parseDouble(enginesize3));
        car3.setMake(make3);

        JOptionPane.showMessageDialog(null,"The third car "+car3);
        Car car4=new Car();
        String color4= JOptionPane.showInputDialog("Enter the fourth car's color");
        String horsepower4= JOptionPane.showInputDialog("Enter the fourth car's horsepower");
        String enginesize4= JOptionPane.showInputDialog("Enter the fourth car's enginesize in liter");
        String make4= JOptionPane.showInputDialog("Enter the fourth car's make");

        car4.setColor(color4);
        car4.setHorsepower(Integer.parseInt(horsepower4));
        car4.setEnginesize(Double.parseDouble(enginesize4));
        car4.setMake(make4);

        JOptionPane.showMessageDialog(null,"The fourth car "+car1);
        if(car1.getColor().equals(car4.getColor())&&car1.getHorsepower()==car4.getHorsepower()
                &&car1.getEnginesize()==car4.getEnginesize()&&car1.getMake().equals(car4.getMake())){
            JOptionPane.showMessageDialog(null,"There are "+Car.getCount()+" cars. The first car and the fourth car are the same.");
        }

        if(car2.getColor().equals(car4.getColor())&&car2.getHorsepower()==car4.getHorsepower()
                &&car2.getEnginesize()==car4.getEnginesize()&&car2.getMake().equals(car4.getMake())){
            JOptionPane.showMessageDialog(null,"There are "+Car.getCount()+" cars. The second car and the fourth car are the same.");
        }

        if(car3.getColor().equals(car4.getColor())&&car3.getHorsepower()==car4.getHorsepower()
                &&car3.getEnginesize()==car4.getEnginesize()&&car3.getMake().equals(car4.getMake())){
            JOptionPane.showMessageDialog(null,"There are "+Car.getCount()+" cars. The third car and the fourth car are the same.");
        }

    }
}
