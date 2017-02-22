import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * @author María Mercedes Retolaza Reyna,16339
 * Esta clase implementa las listas dinámicas circulares 
 * @param <E>
 */
public class Circular<E> extends AbstractList<E> implements iStack<E>{

	protected Nodo<E> tail;
	protected int count;

	/**
	 * Constructor de la clase 
	 */
	public Circular(){
		tail = null;
		count = 0;
	}

	/**Metodo que añade un elemento a lista 
	 * @param value
	 */
	public void addFirst(E value){
		Nodo<E> temp = new Nodo<E>(value);
		if (tail == null) { 
			tail = temp;
			tail.setNext(tail);
		} else { 
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}


	/** Metodo que añade el ultimo elemento a la lista 
	 * @param value 
	 */
	public void addLast(E value){

		addFirst(value);
		tail = tail.next();
	}

	/**Metodo que elimina un elemento de la lista 
	 * @return
	 */
	public E removeLast(){
		Nodo<E> finger = tail;
		while (finger.next() != tail){
			finger = finger.next();
		}
		Nodo<E> temp = tail;
		if (finger == tail)
		{
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}

	/* (non-Javadoc)
	 * @see Lista#size()
	 */

	@Override
	public int size() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	/* (non-Javadoc)
	 * @see Lista#addFirst()
	 */
	@Override
	public void addFirst() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	/* (non-Javadoc)
	 * @see Lista#addLast()
	 */
	@Override
	public void addLast() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	/* (non-Javadoc)
	 * @see Lista#getLast()
	 */
	@Override
	public E getLast() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	/* (non-Javadoc)
	 * @see iStack#push(java.lang.Object)
	 */
	@Override
	public void push(E p) {
		// new entry:
		addFirst(p);
		tail = tail.next();
	}

	/* (non-Javadoc)
	 * @see iStack#pop()
	 */
	@Override
	public E pop() {
		Nodo<E> finger = tail;
		while (finger.next() != tail) {
			finger = finger.next();
		}

		Nodo<E> temp = tail;
		if (finger == tail)
		{
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}
}