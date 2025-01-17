Initiation Java - Évaluation Finale

Instructions pour Exécuter le Projet
1. Cloner le Dépôt ou Extraire le Fichier ZIP
Cloner le dépôt depuis GitHub ou extraire le fichier ZIP contenant le projet.

2. Configurer MongoDB
Utiliser l'URI fourni pour se connecter à la base de données MongoDB Atlas.

Exemple d'URI :

bash
mongodb+srv://carmelohays:<db_password>@evalutionjava.cjlwn.mongodb.net/?retryWrites=true&w=majority&appName=EvalutionJava
3. Configurer l'API ChatGPT
Ajouter votre clé API dans le fichier config.properties.

Exemple de contenu du fichier config.properties :

properties
api.key=VOTRE_CLÉ_API
4. Compiler et Exécuter le Projet
Utiliser votre IDE préféré (Eclipse, IntelliJ IDEA, etc.) ou la ligne de commande pour compiler et exécuter le projet.

Commandes pour compiler et exécuter depuis la ligne de commande :

bash
javac -d out src/main/java/*.java
java -cp out Main
5. Tester les Fonctionnalités
Les fonctionnalités principales incluent :

Ajout d'utilisateurs : Vérifiez que les utilisateurs sont bien enregistrés dans MongoDB.

Génération de projets avec des suggestions : Utilisez l'API ChatGPT pour obtenir des suggestions de descriptions de projets.

Affichage des projets et utilisateurs : Affichez les projets et les utilisateurs dans un format lisible.
