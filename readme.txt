# 🌟 Initiation Java - Évaluation Finale 🌟

Bienvenue à votre évaluation finale pour l'initiation Java ! Ce guide vous fournira toutes les instructions nécessaires pour configurer, exécuter et tester votre projet.

## 🚀 Instructions pour Exécuter le Projet

### 1. 📂 Cloner le Dépôt ou Extraire le Fichier ZIP
Pour commencer, vous devez cloner le dépôt GitHub ou extraire le fichier ZIP contenant votre projet. Pour cloner le dépôt, utilisez la commande suivante :
```bash
git clone https://github.com/votre-utilisateur/votre-depot.git
Si vous avez un fichier ZIP, extrayez-le dans le répertoire de votre choix.

2. 🛠️ Configurer MongoDB
Vous allez utiliser MongoDB Atlas pour stocker vos données. Voici comment configurer la connexion :

Utilisez l'URI fourni pour vous connecter à la base de données MongoDB Atlas :

bash
mongodb+srv://carmelohays:<db_password>@evalutionjava.cjlwn.mongodb.net/?retryWrites=true&w=majority&appName=EvalutionJava
3. 🔑 Configurer l'API ChatGPT
Pour utiliser l'API ChatGPT, vous devez ajouter votre clé API dans le fichier config.properties :

Ouvrez le fichier config.properties situé dans src/main/resources.

Ajoutez votre clé API :

properties
api.key=VOTRE_CLÉ_API
4. 🖥️ Compiler et Exécuter le Projet
Utilisez votre IDE préféré (Eclipse, IntelliJ IDEA, etc.) ou la ligne de commande pour compiler et exécuter le projet. Voici les commandes pour la ligne de commande :

bash
javac -d out src/main/java/*.java
java -cp out Main
5. 🧪 Tester les Fonctionnalités
Les fonctionnalités principales que vous devez tester sont les suivantes :

Ajout d'utilisateurs : Assurez-vous que les utilisateurs sont bien enregistrés dans MongoDB.

Génération de projets avec des suggestions : Utilisez l'API ChatGPT pour obtenir des suggestions de descriptions de projets.

Affichage des projets et utilisateurs : Vérifiez que les projets et les utilisateurs sont affichés correctement dans un format lisible.

📜 Description des Fichiers
Arborescence des Fichiers
.
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Main.java
│   │   │   ├── Utilisateur.java
│   │   │   ├── Admin.java
│   │   │   ├── Membre.java
│   │   │   ├── ChatGPTAPI.java
│   │   │   ├── MongoDBManager.java
│   │   │   └── ProjetManager.java
│   │   └── resources
│   │       └── config.properties
├── README.md
└── pom.xml (si vous utilisez Maven)
Contenu des Fichiers Principaux
Main.java
Ce fichier contient le point d'entrée principal du programme. Il orchestre l'exécution des différentes fonctionnalités du projet.

Utilisateur.java
Définit la classe abstraite Utilisateur avec des attributs communs aux utilisateurs et une méthode abstraite pour afficher le rôle.

Admin.java et Membre.java
Ces fichiers contiennent les classes Admin et Membre qui héritent de Utilisateur et implémentent la méthode afficherRole().

ChatGPTAPI.java
Ce fichier gère la communication avec l'API ChatGPT en chargeant la clé API depuis le fichier config.properties.

MongoDBManager.java
Gère la connexion à MongoDB et les opérations CRUD (Create, Read, Update, Delete) sur la collection utilisateurs.

ProjetManager.java
Combine les fonctionnalités de ChatGPT et MongoDB pour gérer les projets et leurs descriptions générées.

config.properties
Contient la clé API nécessaire pour utiliser l'API ChatGPT.
