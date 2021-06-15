package nl.novi.app;

public class Player extends  Person {
    private int number = 0;
    private String club;

    public Player(String firstName, String lastName, int number, String club) {
        super(firstName, lastName);
        this.number = number;
        this.club = club;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", club='" + club + '\'' +
                '}';
    }
}

