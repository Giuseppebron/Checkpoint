import java.util.HashSet;
import java.util.Set;

public class CityTeam {
    private int id;
    private String nomeCitta;

    private Set<TennisPlayer> giocatoriDellaCitta ;

    public Set<TennisPlayer> getGiocatoriDellaCitta() {
        return giocatoriDellaCitta;
    }


    public CityTeam(int id, String nomeCitta, Set<TennisPlayer> giocatoriDellaCitta) {
        this.id = id;
        this.nomeCitta = nomeCitta;
        this.giocatoriDellaCitta = giocatoriDellaCitta;
    }

    public CityTeam(int id, String nomeCitta) {
        this.id = id;
        this.nomeCitta = nomeCitta;
        this.giocatoriDellaCitta = new HashSet<>();
    }
    public void printTeam(){
        for ( TennisPlayer player:giocatoriDellaCitta) {
            System.out.println(player.getNome()+player.getCognome());
        }
    }
    public void addPlayer(TennisPlayer p){
        giocatoriDellaCitta.add(p);
    }

}
