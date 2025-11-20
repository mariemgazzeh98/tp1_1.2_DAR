# Activité 1.2 : Service de Multiplication Client/Serveur

## 📋 Description
Cette activité étend le premier exemple de communication par Sockets (Activité 1.1) pour implémenter un service de calcul simple.

Le **Client** ne disposant pas de capacité de calcul, il envoie un nombre entier au **Serveur**. Le serveur reçoit ce nombre, le multiplie par **5**, et renvoie le résultat au client qui l'affiche.

## 🛠️ Architecture
Le projet est composé de deux classes réparties dans des packages distincts :

1.  **`serverPackage.Server`** :
    *   Démarre un `ServerSocket` sur le port **1234**.
    *   Attend une connexion.
    *   Lit l'entier envoyé, effectue la multiplication (`x * 5`) et renvoie le résultat.
2.  **`clientPackage.Client`** :
    *   Se connecte au serveur (`localhost`, port `1234`).
    *   Demande à l'utilisateur de saisir un entier via le clavier (`Scanner`).
    *   Envoie l'entier, attend la réponse et affiche le résultat.

## ⚙️ Fonctionnalités Techniques
*   **Sockets TCP** : Établissement d'une connexion fiable.
*   **Flux d'Entrée/Sortie** : Utilisation des méthodes basiques `InputStream.read()` et `OutputStream.write()` pour l'échange d'octets.

## 🚀 Prérequis
*   Java JDK installé.
*   Port **1234** libre sur la machine.

## ▶️ Instructions d'Exécution

### 1. Démarrer le Serveur
Exécutez la classe `serverPackage.Server` en premier.
> **Console Serveur :**
> `Je suis un serveur en attente la connexion d'un client`

### 2. Démarrer le Client
Exécutez la classe `clientPackage.Client`.
> **Console Client :**
> `Je suis un client pas encore connecté…`
> `Je suis connecté`
> `donner x:`

### 3. Test
Saisissez un nombre entier dans la console du client (par exemple `10`).

> **Résultat Client :**
> `le resultat=50`

> **Résultat Serveur :**
> `un client est connecté`
> `x=10`

## ⚠️ Note Technique Importante
Dans cette implémentation basique, les méthodes `write(int)` et `read()` échangent **un seul octet** (valeurs comprises entre 0 et 255).
*   Si vous saisissez un nombre > 255, ou si le résultat de la multiplication dépasse 255, le résultat affiché sera incorrect (modulo 256) car les bits de poids fort seront tronqués.
*   *L'objectif de l'exercice suivant (Activité 2.1) sera justement de pallier cette limitation.*

