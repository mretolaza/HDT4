import java.util.Vector;

/**
 * @author María Mercedes Retolaza 
 * Esta clase implementa los metodos de la interfaz de IStack 
 * Entonces tomo los métodos y los aplico a un vector (el push,pop y el empty)
 * @param <E>
 */
public class vector<E> implements iStack<E> {

 /**
 * Se crea una variable tipo vector 
 */
private Vector <E> v=new Vector <E>(1);

	/* (non-Javadoc)
	 * @see iStack#push(java.lang.Object)
	 */
	@Override
	public void push(E p) {
		v.add(p);

	}

	/* (non-Javadoc)
	 * @see iStack#pop()
	 */
	@Override
	public E pop() {
		E p = null;
		if (!isEmpty()) {
			p = v.lastElement();
			v.remove(v.size() - 1);}
		return p;
	}

	/* (non-Javadoc)
	 * @see iStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return (v.isEmpty());
	}



}