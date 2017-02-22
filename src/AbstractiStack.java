/**
 * @author Mar�a Mercedes Retolaza Reyna,16339 
 * Esta es la clase abstracta que recibe a la interfaz que implementa 
 * los m�todos del stack
 * @param <E>
 */
public abstract class AbstractiStack<E>{
	
	
	/**M�todo que recibe el parametro P (ingresa un elemento)
	 * @param p
	 */
	public void push(E p){

	}
	/**M�todo de pop del Stack Devuelve un elemento 
	 * @return null 
	 */
	public E pop(){
		return null;

	}

	/**M�todo que verifica que el stack este lleno o vacio 
	 * @return false 
	 */
	public boolean isEmpty(){
		return false;

	}

}