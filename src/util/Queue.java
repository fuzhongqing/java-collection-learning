package util;

@SuppressWarnings("rawtypes")
public class Queue<E> extends Vector {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5630260307698867503L;

	@SuppressWarnings("unchecked")
	public void push_back(E e) {
		add(e);
	}
	@SuppressWarnings("unchecked")
	public E front() {
		return (E) firstElement();
	};
	public void pop() {
		removeElementAt(0);
	};
	
}
