/**
 * @author Mar�a Mercedes Retolaza Reyna,16339 
 * Interfaz que implementa la clase abstracta de la lista
 * en esta se encuentran los parametros que esta utiliza 
 *
 * @param <E>
 */
public interface Lista<E>{

	/** Metodo que averigua el tama�o de la lista 
	 * @return size 
	 */
	public int size();

	/** Metodo que revisa si la lista esta vacia o no 
	 * @return False or True 
	 */
	public boolean isEmpty();

	/**M�todo que a�ade a la primera posici�n un elemento 
	 * de la lista 
	 */
	public void addFirst();

	/**M�todo que a�ade a la �ltima posici�n un elemento 
	 * de la lista 
	 */
	public void addLast();

	/** Obtiene el �ltimo valor de la lista (E)
	 * @return
	 */
	public E getLast();
}