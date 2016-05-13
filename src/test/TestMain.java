package test;

import util.Stack;
import util.Vector;
import static org.junit.Assert.*;

public class TestMain {

	static void testVector() {
		Vector<Integer> v = new Vector<>(0,0);
		assertEquals(0, v.vsz());
		
		v.add(3);v.add(1);v.add(4);v.add(1);v.add(5);
		
		assertEquals(5, v.size());
		assertEquals(8, v.vsz());
		assertEquals(v.toString(),"[3, 1, 4, 1, 5]");

		
		Vector<Integer> copyOfv = new Vector<>(v);
		
		assertEquals(5, copyOfv.vsz());
		assertArrayEquals(v.toArray(), copyOfv.toArray());
		
		v.dropUselessSpace();
		assertEquals(5, v.vsz());
		
		v.setSize(10);
		assertEquals(10, v.vsz());
		assertEquals(5, v.size());
		v.removeRange(1, 3);
		assertEquals(v.toString(),"[3, 1, 5]");
		System.out.println("Vector : all testcases passed!");
	}
	static void testStack() {
		Stack<String> s = new Stack<>();
		s.push("1st element");
		s.push("2nd element");
		s.push("3rd element");
		s.pop();
		assertEquals("2nd element", s.top());
		System.out.println("Stack: all testcases passed!");
	}
	public static void main(String[] args) {
		testVector();
		testStack();
	}

}
