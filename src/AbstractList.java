/**
 * @author María Mercedes Retolaza Reyna, 16339 
 * Clase abstracta que representa la lista 
 *
 * @param <E>
 */
public abstract class AbstractList<E> implements Lista<E>{
	/**
	 * Constructor de la clase 
	 */
	public AbstractList(){

	}

	/* (non-Javadoc)
	 * @see Lista#isEmpty()
	 */
	public boolean isEmpty()
	// post: returns true iff list has no elements
	{
		return size() == 0;
	}

}