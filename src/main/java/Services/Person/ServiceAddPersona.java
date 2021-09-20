package Services.Person;

import DAO.DAOPerson;
import Models.Person;

public class ServiceAddPersona {
    DAOPerson dao;

    public ServiceAddPersona(DAOPerson dao) {
        this.dao = dao;
    }

    public boolean addPerson(Person p) {
        if (p.getRegistryDate() == null){
            return false;
        }
        return dao.addGeneralList(p);
    }
}
