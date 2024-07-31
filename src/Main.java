public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Martin", "Dupont");
        CompteEpargne compteEpargne = new CompteEpargne(personne, 123456789, 1000.0, 0.02);
        compteEpargne.retirer(200.0);

        CompteCourant compteCourant = new CompteCourant(personne, 987654321, 1500.0, 500.0);
        compteCourant.retirer(2000.0);
    }
}