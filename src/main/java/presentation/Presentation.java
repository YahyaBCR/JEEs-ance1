package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();

        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        etudiantManager.addEtudiant(new Etudiant(1, "Doe", "John", "john.doe@example.com"));
        etudiantManager.addEtudiant(new Etudiant(2, "Smith", "Alice", "alice.smith@example.com"));
        etudiantManager.addEtudiant(new Etudiant(3, "Brown", "Bob", "bob.brown@example.com"));
        etudiantManager.addEtudiant(new Etudiant(4, "Taylor", "Emma", "emma.taylor@example.com"));

        System.out.println("Liste des étudiants : ");

        for(Etudiant etudiant: etudiantManager.getAllEtudiants()){
            System.out.println("ID: "+ etudiant.getId()+ ", Nom: "+etudiant.getNom()+", Prenom :"+etudiant.getPrenom()+ ", Email : " + etudiant.getEmail());
        }

    }
}
