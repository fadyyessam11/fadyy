//test edit

public class Owner extends User {

    private Playground Playground1;

    /**
     * default constructor
     */
    public Owner() {
        name = "";
        email = "";
        id = 0;
        password = "";
        phone = 0;
        Ewallat = 0;

    }
    

    /**
     * param constructor
     *
     * @param Playground1
     */
    public Owner(Playground Playground1) {
        this.Playground1 = Playground1;
    }

    /**
     * to add owner
     *
     * @param playground1
     * @param name
     * @param email
     * @param id
     * @param password
     * @param phone
     * @param Ewallat
     */
    public void add_Owner(Playground playground1, String name, String email, int id, String password, long phone, int Ewallat) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.Ewallat = Ewallat;
        this.Playground1 = Playground1;
    }

    /**
     * to display info of owner
     *
     * @return
     */
    @Override
    public String display() {
        return "Owner{" + "name=" + name + ", email=" + email + ", id=" + id + ", password=" + password + ", phone=" + phone + ", Ewallat=" + Ewallat + '}';

    }

}
