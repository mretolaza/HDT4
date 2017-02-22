public class Simple<E> extends AbstractList<E> implements iStack<E>{

  protected Nodo<E> head; // ref. to first element
  int count = 0;

  public Simple()
  // post: generates an empty list
  {
     head = null;
     count = 0;
  }

  public int size()
  // post: returns number of elements in list
 {
   return count;
 }

 public void addFirst(E value)
 // post: value is added to beginning of list
 {
    // note order that things happen:
    // head is parameter, then assigned
    head = new Nodo<E>(value, head);
    count++;
 }

 public E getLast()
 // pre: list is not empty
 // post: removes and returns value from beginning of list
{
    Nodo<E> temp = head;
    head = head.next(); // move head down list
    count--;
    return temp.value();
 }

 public E getFirst()
 // pre: list is not empty
 // post: returns first value in list
 {
     return head.value();
 }

 public void addLast(E value)
 // post: adds value to end of list
 {
     // location for new value
     Nodo<E> temp = new Nodo<E>(value,null);
     if (head != null)
    {
        // pointer to possible tail
        Nodo<E> finger = head;
        while (finger.next() != null)
        {
               finger = finger.next();
        }

        finger.setNext(temp);
     } else head = temp;

   count++;

  }


  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff value is found in list
 {
     Nodo<E> finger = head;

     while (finger != null &&
            !finger.value().equals(value))
    {
         finger = finger.next();
     }
     return finger != null;
  }

    @Override
    public void addFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E p) {
        head = new Nodo<E>(p, head);
    count++;
    }

    @Override
    public E pop() {
        Nodo<E> temp = head;
    head = head.next(); // move head down list
    count--;
    return temp.value();
    }

}