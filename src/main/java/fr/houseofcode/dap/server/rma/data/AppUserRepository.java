package fr.houseofcode.dap.server.rma.data;

import org.springframework.data.repository.CrudRepository;

/**
 * @author rma.
 * 5 august. 2019
 *
 */
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    //TODO RMA by Djer |JavaDoc| Il manque la description de la m�thode, le retour, et la description du param�tre.
    AppUser findByName(String name);

}
