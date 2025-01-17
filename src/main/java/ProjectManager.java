import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ProjetManager {
    private ChatGPTAPI chatGPT;
    private MongoDBManager mongoDB;

    public ProjetManager(ChatGPTAPI chatGPT, MongoDBManager mongoDB) {
        this.chatGPT = chatGPT;
        this.mongoDB = mongoDB;
    }

    public void ajouterProjetAvecSuggestion(String titre) {
        String description = chatGPT.genererTexte(titre);
        MongoCollection<Document> collection = mongoDB.getCollection("projets");
        Document projet = new Document("titre", titre)
                          .append("description", description);
        collection.insertOne(projet);
    }

    public void afficherProjetsEtUtilisateurs() {
        MongoCollection<Document> collectionProjets = mongoDB.getCollection("projets");
        MongoCollection<Document> collectionUtilisateurs = mongoDB.getCollection("utilisateurs");

        for (Document projet : collectionProjets.find()) {
            System.out.println("Projet : " + projet.getString("titre"));
            System.out.println("Description : " + projet.getString("description"));
            for (Document utilisateur : collectionUtilisateurs.find()) {
                System.out.println("Utilisateur : " + utilisateur.getString("nom") + " (" + utilisateur.getString("role") + ")");
            }
            System.out.println();
        }
    }
}
