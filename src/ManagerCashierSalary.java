
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vc2000
 */
public class ManagerCashierSalary {
    
public static void main(String[] args) {
        
        System.out.println("I can help you to find your salary");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please tell me you are a manager or cashier.");
        System.out.println("If you are a manager, press 1; if you are a cashier, press 2.");
        int position = keyboard.nextInt();
        
        System.out.println("Please tell me how many hours do you work weekly.");
        double hours = keyboard.nextDouble();
        
        
   
        
        switch (position){
            case 1:
                if (hours <=40){
                double ManagerSalary = hours*20;
                System.out.printf("Your salary is %,.0f", ManagerSalary);
        }else{
                    System.out.println("You cannot work over hours !");
            }
                
                break;
            case 2:
                double CashierIncome = Cashier.CIn(hours);
                System.out.println("Your salary is $" + CashierIncome);
                break;
                
            default:
                System.out.println("I cannot find your salary!");
    }
    }
}
class Cashier{
    public static double CIn(double hours){
        
        if (hours <40){
            return hours*10;
        }else{
            return 40*10 +( hours -40)*(10*1.5);
        }
    }
}