package nl.novi.app;

public class Coach extends Person{
    private String role = "";

    public Coach(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() + "Coach{" +
                "role='" + role + '\'' +
                '}';
    }
}
