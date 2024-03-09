package metier;

import dao.Etudiant;
import dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant){
        List<Etudiant> existingEtudiants = etudiantDAO.getAllEtudiants();

        for (Etudiant existingEtudiant : existingEtudiants){
            if(existingEtudiant.getEmail().equals(etudiant.getEmail())){
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants();
    }
}
