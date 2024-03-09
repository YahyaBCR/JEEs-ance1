package dao;

import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionary {
    private Map<Integer, Etudiant> etudiantsMap;

    public EtudiantDAODictionary(){
        etudiantsMap = new HashMap<>();
    }

    public void addEtudiant(Etudiant etudiant){
        etudiantsMap.put(etudiant.getId(), etudiant);
    }

    public void removeEtudiant(int id){
        etudiantsMap.remove(id);
    }

    public Map<Integer, Etudiant> getAllEtudiants(){
        return etudiantsMap;
    }

    public Etudiant getEtudiantbyId(int id){
        return etudiantsMap.get(id);
    }
}
