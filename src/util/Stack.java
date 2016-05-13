package util;

@SuppressWarnings("rawtypes")
public class Stack<E> extends Vector {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2339567309629898300L;
	
	@SuppressWarnings("unchecked")
	public void push(E e) {
		add(e);
	}
	@SuppressWarnings("unchecked")
	public E top() {
		return (E) lastElement();
	};
	public void pop() {
		removeElementAt(numberOfElement - 1);
	};
	
}
