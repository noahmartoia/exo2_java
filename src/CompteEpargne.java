class CompteEpargne extends Compte {
    private double interet;

    public CompteEpargne(Personne proprietaire, long numero, double solde, double interet) {
        super(proprietaire, numero, solde);
        this.interet = interet;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() - montant >= 0) {
            setSolde(getSolde() - montant);
            System.out.println("Retrait effectué. Nouveau solde : " + getSolde());
        } else {
            System.out.println("Retrait impossible, solde insuffisant.");
        }
    }
}