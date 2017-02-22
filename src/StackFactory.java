import java.util.Stack;

/**
 * @author María Mercedes Retolaza Reyna,16339 
 *
 * @param <E>
 */
class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
	
   /**El Siguiente metodo se encarga de ser implementado con el factory 
 * @param entry
 * @return
 */
public iStack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
            return new StackArrayList<E>(); //regresa ArrayList
        else if (entry.equals("V"))
            return new vector<E>(); //regresa Vector
        else if (entry.equals("LS"))
            return new Simple<E>();
        else if (entry.equals("LD"))
            return new Doble<E>();
        else if (entry.equals("LC"))
            return new Circular<E>();
        else
            return null;
   }
}