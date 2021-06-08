

public class Player extends User {

    private int NumOfMembers;
    private Playground Pg;

    /**
     * default constructor
     */
    public Player() {
    }

    /**
     * parameter constructor
     *
     * @param name
     * @param email
     * @param id
     * @param password
     * @param phone
     * @param Ewallat
     * @param NumOfMembers
     */
    public Player(String name, String email, int id, String password, long phone, int Ewallat, int NumOfMembers) {
        super(name, email, id, password, phone, Ewallat);
        this.NumOfMembers = NumOfMembers;
    }

    /**
     *
     * @param slot
     * @param NumOfMembers
     */
    public void BookPg(int slot, int NumOfMembers) {

    }

    /**
     *
     * @return and display info
     */
    public String display() {
        return "User{" + "name=" + name + ", email=" + email + ", id=" + id + ", password=" + password + ", phone=" + phone + ", Ewallat=" + Ewallat + " Number of Team Members= " + NumOfMembers + '}';
    }

}
