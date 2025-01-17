import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBManager {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBManager(String uri) {
        mongoClient = new MongoClient(new MongoClientURI(uri));
        database = mongoClient.getDatabase("EvalutionJava");
    }

    public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    public void ajouterUtilisateur(String nom, String email, String role) {
        MongoCollection<Document> collection = database.getCollection("utilisateurs");
        Document utilisateur = new Document("nom", nom)
                              .append("email", email)
                              .append("role", role);
        collection.insertOne(utilisateur);
    }

    public void listerUtilisateurs() {
        MongoCollection<Document> collection = database.getCollection("utilisateurs");
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }
}
