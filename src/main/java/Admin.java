public class Admin extends Utilisateur {
    public Admin(String nom, String email) {
        super(nom, email);
    }

    @Override
    public void afficherRole() {
        System.out.println("Rôle : Administrateur");
    }
}
