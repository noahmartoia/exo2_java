class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(Personne proprietaire, long numero, double solde, double decouvert) {
        super(proprietaire, numero, solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() - montant >= -decouvert) {
            setSolde(getSolde() - montant);
            System.out.println("Retrait effectué. Nouveau solde : " + getSolde());
        } else {
            System.out.println("Retrait impossible, solde insuffisant.");
        }
    }
}