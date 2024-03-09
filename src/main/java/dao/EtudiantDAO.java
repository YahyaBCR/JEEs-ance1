package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    private List<Etudiant> etudiants;

    // Constructeur
    public EtudiantDAO() {
        etudiants = new ArrayList<>();
    }

    // Méthode pour ajouter un étudiant
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    // Méthode pour récupérer un étudiant par son ID
    public Etudiant getEtudiantById(int id) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getId() == id) {
                return etudiant;
            }
        }
        return null; // Retourne null si l'étudiant n'est pas trouvé
    }
}
