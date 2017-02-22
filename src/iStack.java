/**
 * @author María Mercedes Retolaza Reyna, 
 * Interfaz de i Stack implementa los parametros que utiliza un Stack 
 * @param <E>
 * Es el elemento con el que se maneja el stack 
 */
public interface iStack<E> {

	/**Metodo Push (Ingresa un elemento al Stack)
	 * @param p
	 */
	public void push(E p);

	/**Metodo Pop (Obtiene un elemento del Stack)
	 * @return E
	 */
	public E pop();

	/**Metodo que verifica si el stack esta lleno o vacío 
	 * @return True or False 
	 */
	public boolean isEmpty();
}