
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int flag = 1;
        Playground pg1 = new Playground();
        Player P = new Player();
        Owner o1 = new Owner();
        while (true) {
            System.out.println("***************** ");
            System.out.println("Register as: ");
            System.out.println("1- Player");
            System.out.println("2- Owner");
            System.out.println("3- Quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice == 1) {
                flag = 0;
                Scanner is = new Scanner(System.in);
                Scanner it = new Scanner(System.in);

                System.out.println("Enter your Name: ");
                String name = is.nextLine();

                System.out.println("Enter your Email: ");
                String email = is.nextLine();

                System.out.println("Enter your ID: ");
                int id = is.nextInt();

                System.out.println("Enter your Password: ");
                String pass = it.nextLine();

                System.out.println("Enter your Phone: ");
                long phone = is.nextInt();

                System.out.println("Enter your Ewallet Money: ");
                int wallet = is.nextInt();

                System.out.println("Enter Number of Members: ");
                int members = is.nextInt();

                Player p1 = new Player(name, email, id, pass, phone, wallet, members);
                System.out.println(p1.display());
                Scanner ss = new Scanner(System.in);
                System.out.println("do you want to book");
                System.out.println("1.yes");
                System.out.println("2.no");

                int choice2 = ss.nextInt();
                if (choice2 == 1) {
                    if (pg1.name == " ") {
                        System.out.println("we don't have a playground");
                    } else {
                        pg1.display();
                        int s = ss.nextInt();
                        int x = s - 1;
                        if (p1.Ewallat >= pg1.price_per_hour) {
                            pg1.BookPG(x);
                            p1.Ewallat -= pg1.price_per_hour;
                            o1.Ewallat += pg1.price_per_hour;
                            System.out.println("your Ewallet money become :" + p1.Ewallat);
                        }

                    }
                } else {
                    return;
                }

            }
            if (choice == 2) {
                Scanner is = new Scanner(System.in);
                Scanner it = new Scanner(System.in);

                System.out.println("First your Own Info..");

                System.out.println("Enter your Name: ");
                String name = is.nextLine();

                System.out.println("Enter your Email: ");
                String email = is.nextLine();

                System.out.println("Enter your ID: ");
                int id = is.nextInt();

                System.out.println("Enter your Password: ");
                String pass = it.nextLine();

                System.out.println("Enter your Phone: ");
                long phone = is.nextInt();

                System.out.println("Enter your Ewallet Money: ");
                int wallet = is.nextInt();

                System.out.println("----------------------------");

                System.out.println("Second Playground Info..");

                Scanner cs = new Scanner(System.in);
                Scanner ai = new Scanner(System.in);

                System.out.println("Enter PlayGround Name: ");
                String PGname = cs.nextLine();

                System.out.println("Enter PG Width: ");
                double width = cs.nextDouble();

                System.out.println("Enter PG Length: ");
                double length = cs.nextDouble();

                System.out.println("Enter PG Price per Hour: ");
                int price = cs.nextInt();

                System.out.println("Enter PG Location: ");
                String loc = ai.nextLine();

                pg1.add_Playground(PGname, width, length, price, loc);
                o1.add_Owner(pg1, name, email, id, pass, phone, wallet);

            }
            if (choice == 3) {
                break;
            }
        }

    }

}
