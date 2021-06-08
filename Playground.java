

public class Playground {

    protected String name;

    protected double width;

    protected double length;

    protected int price_per_hour;

    protected String location;

    public String[] arr = {"1.SAT: 6 PM ", "2.SUN: 6 PM ", "3.MON: 6 PM  ", "4.TUE: 6 PM  ", "5.WED: 6 PM  ", "6.THU: 6 PM  ", "7.FRI: 10 PM "};

    /**
     * default constructor
     */
    public Playground() {
        name = " ";
        width = 0;
        length = 0;
        price_per_hour = 0;
        location = "";

    }
    Playground p;

    /**
     * to add playground
     *
     * @param name
     * @param width
     * @param length
     * @param price_per_hour
     * @param location
     */
    public void add_Playground(String name, double width, double length, int price_per_hour, String location) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.price_per_hour = price_per_hour;
        this.location = location;

    }

    /**
     * to print slots
     */
    public void slots() {
        for (int i = 0; i < 7; i++) {

            System.out.println(arr[i]);
        }

    }

    /**
     * to display info
     */
    public void display() {
        Playground p;
        System.out.println("PlayGround{" + "name=" + name + ", Width=" + width + ", length=" + length + ", Price=" + price_per_hour + ", Location=" + location + "}");
        System.out.println("Slots");
        slots();
    }

    /***
     *
     * @param slot
     */
    public void BookPG(int slot){
        System.out.println("you booked: "+arr[slot]);
        arr[slot] = "booked";
    }
}
