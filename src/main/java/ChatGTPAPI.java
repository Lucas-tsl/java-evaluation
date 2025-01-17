import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ChatGPTAPI {
    private String apiKey;

    public ChatGPTAPI() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/config.properties"));
        apiKey = properties.getProperty("api.key");
    }

    public String genererTexte(String prompt) {
        // Implémentation pour envoyer une requête à l'API ChatGPT et obtenir une réponse
        return "Réponse générée par ChatGPT pour le prompt : " + prompt;
    }
}
