/**
 * @author María Mercedes Retolaza Reyna,16339 
 * Interfaz que implementa la clase abstracta de la lista
 * en esta se encuentran los parametros que esta utiliza 
 *
 * @param <E>
 */
public interface Lista<E>{

	/** Metodo que averigua el tamaño de la lista 
	 * @return size 
	 */
	public int size();

	/** Metodo que revisa si la lista esta vacia o no 
	 * @return False or True 
	 */
	public boolean isEmpty();

	/**Método que añade a la primera posición un elemento 
	 * de la lista 
	 */
	public void addFirst();

	/**Método que añade a la última posición un elemento 
	 * de la lista 
	 */
	public void addLast();

	/** Obtiene el último valor de la lista (E)
	 * @return
	 */
	public E getLast();
}