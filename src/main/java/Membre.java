public class Membre extends Utilisateur {
    public Membre(String nom, String email) {
        super(nom, email);
    }

    @Override
    public void afficherRole() {
        System.out.println("Rôle : Membre");
    }
}
