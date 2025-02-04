package OOPs.Getter_Setters;

import OOPs.Getter_Setters.Practise_;

import java.util.Scanner;
public class Practise_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number how many car data store : ");
        int n = sc.nextInt();
        sc.nextLine();
        Practise_[] Show_room = new Practise_[n];

        for (int i = 0; i < Show_room.length; i++) {
            System.out.println("Enter car Name which type of your car : " + (i + 1));
            String car_name = sc.nextLine();

            System.out.println("Enter car model : " + (i + 1));
            String car_model = sc.nextLine();

            System.out.println("Enter car number : " + (i + 1));
            int car_number = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter which state have you car : " + (i + 1));
            String state = sc.nextLine();

            Show_room[i] = new Practise_(car_name, car_model, car_number, state);
        }


        System.out.println("\n--- Car Details ---");
        for (Practise_ collection : Show_room)
            System.out.println(collection);


    }
}
