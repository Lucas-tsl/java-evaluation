import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exercice 1
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Admin("Alice", "alice@example.com"));
        utilisateurs.add(new Membre("Bob", "bob@example.com"));

        for (Utilisateur utilisateur : utilisateurs) {
            utilisateur.afficherRole();
        }

        // Exercice 2
        ChatGPTAPI chatGPT = new ChatGPTAPI();
        String ideeProjet = chatGPT.genererTexte("Donne-moi une idée de projet pour un développeur débutant.");
        System.out.println(ideeProjet);

        // Exercice 3 et 4
        MongoDBManager mongoDB = new MongoDBManager("mongodb+srv://carmelohays:790SEBfv1lrZNPD2@evalutionjava.cjlwn.mongodb.net/?retryWrites=true&w=majority&appName=EvalutionJava");
        ProjetManager projetManager = new ProjetManager(chatGPT, mongoDB);

        projetManager.ajouterProjetAvecSuggestion("Créer une API REST");
        projetManager.afficherProjetsEtUtilisateurs();
    }
}
