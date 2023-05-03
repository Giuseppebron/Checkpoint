public class TennisPlayer {
    private int id;
    private String nome;
    private String cognome;
    private String nazionalita;
    private int numeroMatchVinti;
    private int numeroMatchTotaliPartecipati;
    private String squadraInCuiGioca;


    public TennisPlayer(int id, String nome, String cognome, String nazionalita, int numeroMatchVinti, int numeroMatchTotaliPartecipati) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
        this.numeroMatchVinti = numeroMatchVinti;
        this.numeroMatchTotaliPartecipati = numeroMatchTotaliPartecipati;

    }

    public TennisPlayer(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public int getNumeroMatchVinti() {
        return numeroMatchVinti;
    }

    public int getNumeroMatchTotaliPartecipati() {
        return numeroMatchTotaliPartecipati;
    }

    public String getSquadraInCuiGioca() {
        return squadraInCuiGioca;
    }

    public void setNumeroMatchVinti(int numeroMatchVinti) {
        this.numeroMatchVinti = numeroMatchVinti;
    }

    public void setNumeroMatchTotaliPartecipati(int numeroMatchTotaliPartecipati) {
        this.numeroMatchTotaliPartecipati = numeroMatchTotaliPartecipati;
    }

    public void setSquadraInCuiGioca(String squadraInCuiGioca) {
        this.squadraInCuiGioca = squadraInCuiGioca;
    }

    public double winRate(){
        double x = this.numeroMatchVinti;
        double y = this.numeroMatchTotaliPartecipati;
        return (x/y)*100;
    }

}
