package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartHome {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner(1500);
        Fan fan = new Fan(25);
        SmartLight smartLight = new SmartLight(20);
        Television television = new Television(150);

        List<String> deviceUsages = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 9)
            {
                System.out.println("1. Switch air conditioner on");
                System.out.println("2. Switch air conditioner off");
                System.out.println("3. Switch fan on");
                System.out.println("4. Switch fan off");
                System.out.println("5. Switch smart light on");
                System.out.println("6. Switch smart light off");
                System.out.println("7. Switch television on");
                System.out.println("8. Switch television off");
                System.out.println("9. Print bill \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        String status = airConditioner.deviceOn();
                        deviceUsages.add(status);
                        System.out.println(status);
                        break;

                    case 2:
                        String status2 = airConditioner.deviceOff();
                        deviceUsages.add(status2);
                        System.out.println(status2);
                        break;

                    case 3:
                        String status3 = fan.deviceOn();
                        deviceUsages.add(status3);
                        System.out.println(status3);
                        break;

                    case 4:
                        String status4 = fan.deviceOff();
                        deviceUsages.add(status4);
                        System.out.println(status4);
                        break;

                    case 5:
                        String status5 = smartLight.deviceOn();
                        deviceUsages.add(status5);
                        System.out.println(status5);
                        break;

                    case 6:
                        String status6 = smartLight.deviceOff();
                        deviceUsages.add(status6);
                        System.out.println(status6);
                        break;

                    case 7:
                        String status7 = television.deviceOn();
                        deviceUsages.add(status7);
                        System.out.println(status7);
                        break;

                    case 8:
                        String status8 = television.deviceOff();
                        deviceUsages.add(status8);
                        System.out.println(status8);
                        break;

                    case 9:
                        for (String deviceUsage : deviceUsages) {
                            System.out.println(deviceUsage);
                        }

                        System.out.println("\n" + "------------------------------");
                        System.out.println("Device                       Watts                           Cycles                         Power used");
                        System.out.println("\n" + "------------------------------");

                        System.out.println("Air conditioner              " + airConditioner.getPowerRating() + "                           " + airConditioner.usageCycles + "                         " + airConditioner.calculateUsage());
                        System.out.println("Fan                          " + fan.getPowerRating() + "                           " + fan.usageCycles + "                         " + fan.calculateUsage());
                        System.out.println("Smart light                  " + smartLight.getPowerRating() + "                           " + smartLight.usageCycles + "                         " + smartLight.calculateUsage());
                        System.out.println("Television                   " + television.getPowerRating() + "                           " + television.usageCycles + "                         " + television.calculateUsage());

                        Integer totalUsage = airConditioner.calculateUsage() + fan.calculateUsage() + television.calculateUsage() + smartLight.calculateUsage();
                        Float bill = totalUsage * 0.1f;
                        System.out.println("\n" + "------------------------------");
                        System.out.println("Total power consumed: " + totalUsage + " watts");
                        System.out.println("Electricity bill: " + "Rs. " + bill);
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
