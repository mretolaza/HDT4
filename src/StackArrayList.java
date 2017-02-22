import java.util.ArrayList;

/**
 * @author María Mercedes Retolaza Reyna,16339
 * @param <E>
 */
public class StackArrayList<E> implements iStack<E>

{
	protected ArrayList<E> data;

	/**
	 * Creación del ArrayList
	 */
	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

        /* (non-Javadoc)
         * @see iStack#push(java.lang.Object)
         */
        @Override
	public void push(E p)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(p);
	}

        @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(data.size()-1);
	}

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}