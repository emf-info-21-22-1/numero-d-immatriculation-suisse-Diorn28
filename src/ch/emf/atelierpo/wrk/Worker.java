package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

   /**
    * Cette méthode est utilisé pour vérifier si une plaque d'immatriculation est valide.
    * Pour que la méthode fonctionne il va falloir vérifier que le nom du canton soit valide à l'aide d'un IF et que le String pour le numéro de plaque est belle et bien composé que de charactère et non pas de chiffre à l'aide d'un try catch
    * @param canton Il s'agit des innitiaux des cantons. Pour que ceux-ci soient valident il faut que les charactères utilisé soit comprise entre A et Z.
    * @param numeroDePlaque Il s'agit du numéro de la plaque d'immatriculation à testé, stocké dans un String. Celui-ci ne doit contenir que des numéros.
    * @return 
    */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {
        return false;
    }

}
