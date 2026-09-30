public class Animale {
    // Attributi
    private String nome;
    private String specie;
    private int eta;
    private int energia; // da 0 a 100

    // Costruttore
    public Animale(String nome, String specie, int eta, int energia) {
        this.nome = nome;
        this.specie = specie;
        this.eta = eta;
        setEnergia(energia); // Usa il setter per garantire il range 0-100
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    // Metodi significativi
    public void gioca() {
        if (this.energia - 15 < 5) {
            this.energia = 5;
            System.out.println(nome + " è troppo stanco per continuare a giocare!");
        } else {
            this.energia -= 15;
            System.out.println(nome + " sta giocando. Energia attuale: " + energia);
        }
    }

    public void mangia() {
        if (this.energia + 20 > 100) {
            this.energia = 100;
            System.out.println(nome + " è completamente sazio!");
        } else {
            this.energia += 20;
            System.out.println(nome + " sta mangiando. Energia attuale: " + energia);
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", specie='" + specie + '\'' +
                ", eta=" + eta +
                ", energia=" + energia +
                '}';
    }
}