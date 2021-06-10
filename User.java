
public abstract class User {

    protected String name;
    protected String email;
    protected int id;
    protected String password;
    protected long phone;
    protected int Ewallat;

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * param constructor
     *
     * @param name
     * @param email
     * @param id
     * @param password
     * @param phone
     * @param Ewallat
     */
    public User(String name, String email, int id, String password, long phone, int Ewallat) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.Ewallat = Ewallat;
    }

    /**
     * to display info
     *
     * @return
     */
    public String display() {
        return "User{" + "name=" + name + ", email=" + email + ", id=" + id + ", password=" + password + ", phone=" + phone + ", Ewallat=" + Ewallat + '}';
    }
}
