public abstract class Compte {
    private Personne proprietaire;
    private final long numero;
    private double solde;
    public Compte(Personne proprietaire, long numero, double solde) {
        this.proprietaire = proprietaire;
        this.numero = numero;
        this.solde = solde;
    }
    public Personne getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }
    public long getNumero() {
        return numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public abstract void retirer(double montant);
}
