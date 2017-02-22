/**
 * @author María Mercedes Retolaza Reyna, 16339 
 * Clase nodo, esta clase implementa los punteros 
 * @param <E>
 */
public class Nodo<E>{

	protected E data;
	protected Nodo<E> nextElement;

	/** Constructor de la clase que implementa los parametros que se 
	 * manejaran dentro del Nodo 
	 * @param v
	 * @param next
	 */
	public Nodo(E v, Nodo<E> next){
		data = v;
		nextElement = next;
	}

	/**Metodo de punteros 
	 * @param v
	 */
	public Nodo(E v){
		this(v,null);
	}

	/**Metodo que apunta al siguiente elemento 
	 * @return nextElement 
	 */
	public Nodo<E> next(){
		return nextElement;
	}

	/**Metodo que obtiene el siguiente elemento del puntero 
	 * @param next
	 */
	public void setNext(Nodo<E> next){
		nextElement = next;
	}

	/** Devuelve el valor que esta dentro del puntero, 
	 * es decir obtiene el valor que se esta manejando en dicho nodo
	 * @return data 
	 */
	public E value(){
		return data;
	}

	/**Obtiene el valor que se esta manjando dentro del puntero 
	 * @param value 
	 */
	public void setValue(E value){
		data = value;
	}
}