package nl.novi.app;

import java.util.ArrayList;

public class AppController {
    private ArrayList<Team> teams = new ArrayList<>();

    public AppController() {
        this.generateHollandTeam();
        this.generateEnglandTeam();
        this.printTeams();
    }

    public void generateHollandTeam() {
        Team holland = new Team("Nederland", "NL");

        Player player1 = new Player("Maarten", "Stekelenburg", 1, "Ajax");
        Player player2 = new Player("Joël", "Veltman", 2, "Brighton & Hove Albion");
        Player player3 = new Player("Matthijs", "De Ligt", 3, "Juventus");
        Player player4 = new Player("Nathan ", "Aké", 4, "Manchester City");
        Player player5 = new Player("Owen ", "Wijndal", 5, "AZ");
        Player player6 = new Player("Stefan", "De Vrij", 6, "Internazionale");
        Player player7 = new Player("Steven", "Berghuis", 7, "Feyenoord");
        Player player8 = new Player("Georginio", "Wijnaldum", 8, "Liverpool");
        Player player9 = new Player("Luuk", "De Jong", 9, "Sevilla");
        Player player10 = new Player("Memphis", "Depay", 10, "Olympique Lyon");
        Player player11 = new Player("Quincy", "Promes", 11, "Spartak Moskou");
        Player player12 = new Player("Patrick", "Van Aanholt", 12, "Crystal Palace");
        Player player13 = new Player("Tim", "Krul", 13, "Norwich City");
        Player player14 = new Player("Davy", "Klaassen", 14, "Ajax");
        Player player15 = new Player("Marten", "De Roon", 15, "Atalanta Bergamo");
        Player player16 = new Player("Ryan", "Gravenberch", 16, "Ajax");
        Player player17 = new Player("Daley", "Blind", 17, "Ajax");
        Player player18 = new Player("Donyell ", "Malen", 18, "PSV");
        Player player19 = new Player("Wout", "Weghorst", 19, "VfL Wolfsburg");
        Player player20 = new Player("Donny", "Van de Beek", 20, "Manchester United");
        Player player21 = new Player("Frenkie", "De Jong", 21, "Barcelona");
        Player player22 = new Player("Denzel", "Dumfries", 22, "PSV");
        Player player23 = new Player("Marco ", "Bizot", 23, "AZ");
        Player player24 = new Player("Teun", "Koopmeiners", 24, "AZ");
        Player player25 = new Player("Jurriën", "Timber", 25, "Ajax");
        Player player26 = new Player("Cody ", "Gakpo", 26, "PSV");

        Coach coach1 = new Coach("Frank", "de Boer");
        coach1.setRole("Bondscoach");
        Coach coach2 = new Coach("Dwight", "Lodeweges");
        coach2.setRole("Assistent bondscoach");
        Coach coach3 = new Coach("Maarten", "Stekelenburg");
        coach3.setRole("Assistent bondscoach");
        Coach coach4 = new Coach("Patrick", "Lodewijks");
        coach4.setRole("Keeperstrainer");

        holland.addPlayer(player1);
        holland.addPlayer(player2);
        holland.addPlayer(player3);
        holland.addPlayer(player4);
        holland.addPlayer(player5);
        holland.addPlayer(player6);
        holland.addPlayer(player7);
        holland.addPlayer(player8);
        holland.addPlayer(player9);
        holland.addPlayer(player10);
        holland.addPlayer(player11);
        holland.addPlayer(player12);
        holland.addPlayer(player13);
        holland.addPlayer(player14);
        holland.addPlayer(player15);
        holland.addPlayer(player16);
        holland.addPlayer(player17);
        holland.addPlayer(player18);
        holland.addPlayer(player19);
        holland.addPlayer(player20);
        holland.addPlayer(player21);
        holland.addPlayer(player22);
        holland.addPlayer(player23);
        holland.addPlayer(player24);
        holland.addPlayer(player25);
        holland.addPlayer(player26);

        holland.addCoach(coach1);
        holland.addCoach(coach2);
        holland.addCoach(coach3);
        holland.addCoach(coach4);

        teams.add(holland);
        FileHandler.writeData(holland.toString());
    }

    public void generateEnglandTeam() {
        Team england = new Team("England", "ENG");

        Player player1 = new Player("Jordan ", "Pickford", 1, "Everton");
        Player player2 = new Player("Kyle ", "Walker", 2, "Manchester City");
        Player player3 = new Player("Luke", "Shaw", 3, "Manchester United");
        Player player4 = new Player("Declan", "Rice", 4, "West Ham United");
        Player player5 = new Player("John", "Stones", 5, "Manchester City");
        Player player6 = new Player("Harry", "Maguire", 6, "Manchester United");
        Player player7 = new Player("Jack", "Grealish", 7, "Aston Villa");
        Player player8 = new Player("Jordan", "Henderson", 8, "Liverpool");
        Player player9 = new Player("Harry", "Kane", 9, "Tottenham");
        Player player10 = new Player("Raheem", "Sterling", 10, "Manchester City");
        Player player11 = new Player("Marcus ", "Rashford", 11, "Manchester United");
        Player player12 = new Player("Kieran", "Trippier", 12, "Atletico Madrid");
        Player player13 = new Player("Jordan ", "Henderson", 13, "Liverpool");
        Player player14 = new Player("Kalvin", "Phillips", 14, "Leeds United");
        Player player15 = new Player("Tyrone", "Mings", 15, "Aston Villa");
        Player player16 = new Player("Conor", "Coady", 16, "Wolverhampton Wanderers");
        Player player17 = new Player("Jadon", "Sancho", 17, "Borussia Dortmund");
        Player player18 = new Player("Dominic", "Calvert-Lewin", 18, "Everton");
        Player player19 = new Player("Mason", "Mount", 19, "Chelsea");
        Player player20 = new Player("Phil", "Foden", 20, "Manchester City");
        Player player21 = new Player("Ben", "Chilwell", 21, "Chelsea");
        Player player22 = new Player("Ben", "White", 22, "Brighton & Hove Albion");
        Player player23 = new Player("Sam", "Johnstone", 23, "West Bromwich Albion");
        Player player24 = new Player("Reece", "James", 24, "Chelsea");
        Player player25 = new Player("Bukayo", "Saka", 25, "Arsenal");
        Player player26 = new Player("Jude", "Bellingham", 26, "Borussia Dortmund");

        Coach coach1 = new Coach("Gareth", "Southgate");
        coach1.setRole("Bondscoach");
        Coach coach2 = new Coach("Steve", "Holland");
        coach2.setRole("Assistent bondscoach");
        Coach coach3 = new Coach("Tim", "Dittmer");
        coach3.setRole("Keeperstrainer");
        Coach coach4 = new Coach("Martyn", "Margetson");
        coach4.setRole("Keeperstrainer");

        england.addPlayer(player1);
        england.addPlayer(player2);
        england.addPlayer(player3);
        england.addPlayer(player4);
        england.addPlayer(player5);
        england.addPlayer(player6);
        england.addPlayer(player7);
        england.addPlayer(player8);
        england.addPlayer(player9);
        england.addPlayer(player10);
        england.addPlayer(player11);
        england.addPlayer(player12);
        england.addPlayer(player13);
        england.addPlayer(player14);
        england.addPlayer(player15);
        england.addPlayer(player16);
        england.addPlayer(player17);
        england.addPlayer(player18);
        england.addPlayer(player19);
        england.addPlayer(player20);
        england.addPlayer(player21);
        england.addPlayer(player22);
        england.addPlayer(player23);
        england.addPlayer(player24);
        england.addPlayer(player25);
        england.addPlayer(player26);

        england.addCoach(coach1);
        england.addCoach(coach2);
        england.addCoach(coach3);
        england.addCoach(coach4);

        teams.add(england);
        FileHandler.writeData(england.toString());
    }

    public void printTeams() {
        for (int i = 0; i < teams.size(); i++) {
            Team tmpTeam = teams.get(i);
            System.out.println(tmpTeam);
        }
    }
}
