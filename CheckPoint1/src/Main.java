import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TennisPlayer giocatore1 = new TennisPlayer(1,"Giuseppe", "Bronzellino","italiana",0,100);
        TennisPlayer giocatore2 = new TennisPlayer(2,"Mario", "rossi", "italiana",42,72);
        TennisPlayer giocatore3 = new TennisPlayer(3,"john","Mcdonald","americana",51, 52);
        TennisPlayer giocatore4 = new TennisPlayer(4,"Luigi", "Mercantini", "italiana", 16, 52);
        TennisPlayer giocatore5 = new TennisPlayer(5,"Gosia", "Preznova","polacca",82,90);
        Set<TennisPlayer> giocatori = new HashSet<>();
        giocatori.add(giocatore1);
        giocatori.add(giocatore2);
        giocatori.add(giocatore3);

        CityTeam teamA = new CityTeam(1,"Milano", giocatori);
        CityTeam teamB = new CityTeam(2,"Palermo");

        teamB.addPlayer(giocatore4);
        teamB.addPlayer(giocatore5);

        for (TennisPlayer player:teamA.getGiocatoriDellaCitta()) {
            if (player.winRate() > 50 && player.getNumeroMatchTotaliPartecipati() > 5){
                System.out.println(player.getNome() + " "+ player.getCognome());
            }
        }
        System.out.println("*****");
        CityTeam teamC = new CityTeam(3,"Roma");

        teamC.getGiocatoriDellaCitta().addAll(teamA.getGiocatoriDellaCitta());
        teamC.getGiocatoriDellaCitta().addAll(teamB.getGiocatoriDellaCitta());
        Map<TennisPlayer,Double> stat = new HashMap<>();
        stat.put(giocatore1,giocatore1.winRate());
        stat.put(giocatore2,giocatore2.winRate());
        stat.put(giocatore3,giocatore3.winRate());
        stat.put(giocatore4,giocatore4.winRate());
        stat.put(giocatore5,giocatore5.winRate());
        for (Map.Entry<TennisPlayer,Double> entry:stat.entrySet()) {
            if (entry.getValue() > 51){
                System.out.println(entry.getKey().getNome() + " "+entry.getKey().getCognome());
            }
        }

    }
}