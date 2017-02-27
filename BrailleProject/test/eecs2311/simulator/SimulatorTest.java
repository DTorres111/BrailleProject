package eecs2311.simulator;

import static org.junit.Assert.*;
import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import eecs2311.simulator.SimulatorAPI;

public class SimulatorTest {

	private SimulatorAPI window;

	@Before
	public void setUp() throws Exception {

		window = new SimulatorAPI(100, 100, 100);
		window.getFrame().setVisible(true);

	}

	// SET LETTERS in different cells

	
	//---------------------------------------- letter a  in 8 cells --------------------------------------
	
	// set letter a in cell 1

	@Test
	public void testSetletterACell1() {
		window.setLetter('a', 1);
		assertEquals(window.getPinArray()[0][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 2
	@Test
	public void testSetletterACell2() {
		window.setLetter('a', 2);
		assertEquals(window.getPinArray()[1][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 3
	@Test
	public void testSetletterACell3() {
		window.setLetter('a', 3);
		assertEquals(window.getPinArray()[2][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 4

	@Test
	public void testSetletterACell4() {
		window.setLetter('a', 4);
		assertEquals(window.getPinArray()[3][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 5
	@Test
	public void testSetletterACell5() {
		window.setLetter('a', 5);
		assertEquals(window.getPinArray()[4][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 6
	@Test
	public void testSetletterACell6() {
		window.setLetter('a', 6);
		assertEquals(window.getPinArray()[5][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 7
	@Test
	public void testSetletterACell7() {
		window.setLetter('a', 7);
		assertEquals(window.getPinArray()[6][0].getBackground(), Color.GREEN);
	}

	// set letter a in cell 8
	@Test
	public void testSetletterACell8() {
		window.setLetter('a', 8);
		assertEquals(window.getPinArray()[7][0].getBackground(), Color.GREEN);
	}

	
	//---------------------------------------- letter b in 8 cells --------------------------------------
	
	
	// set letter b in cell 1

	@Test
	public void testSetletterBCell1() {
		window.setLetter('b', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[0][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 2
	@Test
	public void testSetletterBCell2() {
		window.setLetter('b', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 3
	@Test
	public void testSetletterBCell3() {
		window.setLetter('b', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[2][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 4

	@Test
	public void testSetletterBCell4() {
		window.setLetter('b', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[3][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 5
	@Test
	public void testSetletterBCell5() {
		window.setLetter('b', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[4][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 6
	@Test
	public void testSetletterBCell6() {
		window.setLetter('b', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[5][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 7
	@Test
	public void testSetletterBCell7() {
		window.setLetter('b', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[6][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter b in cell 8
	@Test
	public void testSetletterBCell8() {
		window.setLetter('b', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[7][2].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	
	//---------------------------------------- letter c in 8 cells ------------------------------------------
	
	
	// set letter c in cell 1

	@Test
	public void testSetletterCCell1() {
		window.setLetter('c', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[0][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 2
	@Test
	public void testSetletterCCell2() {
		window.setLetter('c', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 3
	@Test
	public void testSetletterCCell3() {
		window.setLetter('c', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[2][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 4

	@Test
	public void testSetletterCCell4() {
		window.setLetter('c', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[3][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 5
	@Test
	public void testSetletterCCell5() {
		window.setLetter('c', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[4][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 6
	@Test
	public void testSetletterCCell6() {
		window.setLetter('c', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[5][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 7
	@Test
	public void testSetletterCCell7() {
		window.setLetter('c', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[6][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	// set letter c in cell 8
	@Test
	public void testSetletterCCell8() {
		window.setLetter('c', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[7][1].getBackground() == Color.GREEN;
		boolean m = x == y;
		assertEquals(true, m);
	}

	
	
	
	//---------------------------------------- letter d in 8 cells ------------------------------------------
	
	
	
	// set letter d in cell 1

	@Test
	public void testSetletterDCell1() {
		window.setLetter('d', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[0][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[0][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 2
	@Test
	public void testSetletterDCell2() {
		window.setLetter('d', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 3
	@Test
	public void testSetletterDCell3() {
		window.setLetter('d', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[2][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[2][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 4

	@Test
	public void testSetletterDCell4() {
		window.setLetter('d', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[3][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[3][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 5
	@Test
	public void testSetletterDCell5() {
		window.setLetter('d', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[4][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[4][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 6
	@Test
	public void testSetletterDCell6() {
		window.setLetter('d', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[5][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[5][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 7
	@Test
	public void testSetletterDCell7() {
		window.setLetter('d', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[6][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[6][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	// set letter d in cell 8
	@Test
	public void testSetletterDCell8() {
		window.setLetter('d', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[7][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[7][3].getBackground() == Color.GREEN;
		boolean m = x == y==z;
		assertEquals(true, m);
	}

	
	
	//---------------------------------------- letter e in 8 cells ------------------------------------------
	
	
	
	// set letter e in cell 1

	@Test
	public void testSetletterECell1() {
		window.setLetter('e', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[0][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 2
	@Test
	public void testSetletterECell2() {
		window.setLetter('e', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 3
	@Test
	public void testSetletterECell3() {
		window.setLetter('e', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[2][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 4

	@Test
	public void testSetletterECell4() {
		window.setLetter('e', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[3][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 5
	@Test
	public void testSetletterECell5() {
		window.setLetter('e', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[4][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 6
	@Test
	public void testSetletterECell6() {
		window.setLetter('e', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[5][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 7
	@Test
	public void testSetletterECell7() {
		window.setLetter('e', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[6][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter e in cell 8
	@Test
	public void testSetletterECell8() {
		window.setLetter('e', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[7][3].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	
	
	//---------------------------------------- letter f in 8 cells ------------------------------------------
	
	
	// set letter f in cell 1

	@Test
	public void testSetletterFCell1() {
		window.setLetter('f', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[0][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[0][2].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter f in cell 2
	@Test
	public void testSetletterFCell2() {
		window.setLetter('f', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][2].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter f in cell 3
	@Test
	public void testSetletterFCell3() {
		window.setLetter('f', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[2][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[2][2].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter f in cell 4

	@Test
	public void testSetletterFCell4() {
		window.setLetter('f', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[3][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[3][2].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter f in cell 5
	@Test
	public void testSetletterFCell5() {
		window.setLetter('f', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[4][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[4][2].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter f in cell 6
	@Test
	public void testSetletterFCell6() {
		window.setLetter('f', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[5][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[5][2].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter f in cell 7
	@Test
	public void testSetletterFCell7() {
		window.setLetter('f', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[6][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[6][2].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter f in cell 8
	@Test
	public void testSetletterFCell8() {
		window.setLetter('f', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[7][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[7][2].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	
	
	
	
	//---------------------------------------- letter i in 8 cells ------------------------------------------
	
	
	// set letter i in cell 1

	@Test
	public void testSetletterICell1() {
		window.setLetter('i', 1);
		boolean x = window.getPinArray()[0][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[0][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 2
	@Test
	public void testSetletterICell2() {
		window.setLetter('i', 2);
		boolean x = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 3
	@Test
	public void testSetletterICell3() {
		window.setLetter('i', 3);
		boolean x = window.getPinArray()[2][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[2][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 3

	@Test
	public void testSetletterICell4() {
		window.setLetter('i', 4);
		boolean x = window.getPinArray()[3][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[3][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 5
	@Test
	public void testSetletterICell5() {
		window.setLetter('i', 5);
		boolean x = window.getPinArray()[4][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[4][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 6
	@Test
	public void testSetletterICell6() {
		window.setLetter('i', 6);
		boolean x = window.getPinArray()[5][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[5][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 7
	@Test
	public void testSetletterICell7() {
		window.setLetter('i', 7);
		boolean x = window.getPinArray()[6][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[6][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	// set letter i in cell 8
	@Test
	public void testSetletterICell8() {
		window.setLetter('i', 8);
		boolean x = window.getPinArray()[7][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[7][2].getBackground() == Color.GREEN;
		boolean m = x ==z;
		assertEquals(true, m);
	}

	
	
	
	
	//---------------------------------------- letter o in 8 cells ------------------------------------------
	
	
	// set letter o in cell 1

	@Test
	public void testSetletterOCell1() {
		window.setLetter('o', 1);
		boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[0][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[0][4].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter o in cell 2
	@Test
	public void testSetletterOCell2() {
		window.setLetter('o', 2);
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][4].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter o in cell 3
	@Test
	public void testSetletterOCell3() {
		window.setLetter('o', 3);
		boolean x = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[2][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[2][4].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter o in cell 4

	@Test
	public void testSetletterOCell4() {
		window.setLetter('o', 4);
		boolean x = window.getPinArray()[3][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[3][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[3][4].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter o in cell 5
	@Test
	public void testSetletterOCell5() {
		window.setLetter('o', 5);
		boolean x = window.getPinArray()[4][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[4][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[4][4].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter o in cell 6
	@Test
	public void testSetletterOCell6() {
		window.setLetter('o', 6);
		boolean x = window.getPinArray()[5][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[5][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[5][4].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}

	// set letter o in cell 7
	@Test
	public void testSetletterOCell7() {
		window.setLetter('o', 7);
		boolean x = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[6][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[6][4].getBackground() == Color.GREEN;
		boolean m = x==y ==z;
		assertEquals(true, m);
	}

	// set letter o in cell 8
	@Test
	public void testSetletterOCell8() {
		window.setLetter('o', 8);
		boolean x = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[7][3].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[7][4].getBackground() == Color.GREEN;
		boolean m = x ==y==z;
		assertEquals(true, m);
	}
	
	
	
	
	//----------------------------------------------SET WORDS----------------------------------------------------
	
	
	// SET WORD "CAT"
	@Test
	public void testSetCat() {
	window.setWord("cat");
	boolean a = window.getPinArray()[1][0].getBackground() == Color.GREEN;
	boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
	boolean y = window.getPinArray()[0][1].getBackground() == Color.GREEN;
	boolean b = window.getPinArray()[2][1].getBackground() == Color.GREEN;
	boolean c = window.getPinArray()[2][2].getBackground() == Color.GREEN;
	boolean d = window.getPinArray()[2][3].getBackground() == Color.GREEN;
	boolean e = window.getPinArray()[2][4].getBackground() == Color.GREEN;
	boolean m= a==x==y==b==c==d==e;
	assertEquals(true, m);
	}
	
	
	// SET WORD "EECS" 
	
	public void testSetEecs() {
	window.setWord("eecs");
	boolean x = window.getPinArray()[0][0].getBackground() == Color.GREEN;
	boolean y = window.getPinArray()[0][3].getBackground() == Color.GREEN;
	boolean z = window.getPinArray()[1][0].getBackground() == Color.GREEN;
	boolean a = window.getPinArray()[1][3].getBackground() == Color.GREEN;
	boolean b = window.getPinArray()[2][0].getBackground() == Color.GREEN;
	boolean c = window.getPinArray()[2][1].getBackground() == Color.GREEN;
	boolean d = window.getPinArray()[3][1].getBackground() == Color.GREEN;
	boolean e = window.getPinArray()[3][2].getBackground() == Color.GREEN;
	boolean f = window.getPinArray()[3][4].getBackground() == Color.GREEN;
	
	boolean m= z==x==y==a==b==c==d==e==f;
	
	assertEquals(true, m);
	}
	
	
	// SET WORD "OF"
	
	public void testSetOf() {
		window.setWord("of");
		boolean a = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean b = window.getPinArray()[0][3].getBackground() == Color.GREEN;
		boolean c = window.getPinArray()[0][4].getBackground() == Color.GREEN;
		boolean x = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean y = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean z = window.getPinArray()[1][2].getBackground() == Color.GREEN;		
		boolean m= z==x==y==a==b==c;
		
		assertEquals(true, m);
		}
	
	
	// SET WORD "ADDITION"
	public void testSetAddition() {
		window.setWord("addition");
		boolean a = window.getPinArray()[0][0].getBackground() == Color.GREEN;
		boolean b = window.getPinArray()[1][0].getBackground() == Color.GREEN;
		boolean c = window.getPinArray()[1][1].getBackground() == Color.GREEN;
		boolean d = window.getPinArray()[1][3].getBackground() == Color.GREEN;
		boolean e = window.getPinArray()[2][0].getBackground() == Color.GREEN;
		boolean f = window.getPinArray()[2][1].getBackground() == Color.GREEN;
		boolean g = window.getPinArray()[2][3].getBackground() == Color.GREEN;
		boolean h = window.getPinArray()[3][1].getBackground() == Color.GREEN;
		boolean i = window.getPinArray()[3][2].getBackground() == Color.GREEN;
		boolean j = window.getPinArray()[5][1].getBackground() == Color.GREEN;
		boolean k = window.getPinArray()[5][2].getBackground() == Color.GREEN;
		boolean l = window.getPinArray()[6][0].getBackground() == Color.GREEN;
		boolean m = window.getPinArray()[6][3].getBackground() == Color.GREEN;
		boolean n = window.getPinArray()[6][4].getBackground() == Color.GREEN;
		boolean o = window.getPinArray()[4][1].getBackground() == Color.GREEN;
		boolean p = window.getPinArray()[4][2].getBackground() == Color.GREEN;
		boolean q = window.getPinArray()[4][3].getBackground() == Color.GREEN;
		boolean r = window.getPinArray()[4][4].getBackground() == Color.GREEN;
		boolean s = window.getPinArray()[7][0].getBackground() == Color.GREEN;
		boolean t = window.getPinArray()[7][1].getBackground() == Color.GREEN;
		boolean u = window.getPinArray()[7][3].getBackground() == Color.GREEN;
		boolean v = window.getPinArray()[7][4].getBackground() == Color.GREEN;
		boolean z= a==b==c==d==e==f==g==h==i==j==k==l==m==n==o==p==q==r==s==t==u==v;
		assertEquals(true, z);
		}
	
	
	
	// ------------------------------------------SET PINS (FOR CELL 1 TO 8)----------------------------------------

	// FOR CELL 1

	@Test
	public void testSetPin1Cell1() {
		window.setPin(1, 1);
		assertEquals(window.getPinArray()[0][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell1() {
		window.setPin(2, 1);
		assertEquals(window.getPinArray()[0][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell1() {
		window.setPin(3, 1);
		assertEquals(window.getPinArray()[0][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell1() {
		window.setPin(4, 1);
		assertEquals(window.getPinArray()[0][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell1() {
		window.setPin(5, 1);
		assertEquals(window.getPinArray()[0][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell1() {
		window.setPin(6, 1);
		assertEquals(window.getPinArray()[0][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell1() {
		window.setPin(7, 1);
		assertEquals(window.getPinArray()[0][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell1() {
		window.setPin(8, 1);
		assertEquals(window.getPinArray()[0][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 2

	@Test
	public void testSetPin1Cell2() {
		window.setPin(1, 2);
		assertEquals(window.getPinArray()[1][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell2() {
		window.setPin(2, 2);
		assertEquals(window.getPinArray()[1][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell2() {
		window.setPin(3, 2);
		assertEquals(window.getPinArray()[0][2].getBackground(), Color.RED);
	}

	@Test
	public void testSetPin4Cell2() {
		window.setPin(4, 2);
		assertEquals(window.getPinArray()[1][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell2() {
		window.setPin(5, 2);
		assertEquals(window.getPinArray()[1][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell2() {
		window.setPin(6, 2);
		assertEquals(window.getPinArray()[1][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell2() {
		window.setPin(7, 2);
		assertEquals(window.getPinArray()[1][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell2() {
		window.setPin(8, 2);
		assertEquals(window.getPinArray()[1][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 3

	@Test
	public void testSetPin1Cell3() {
		window.setPin(1, 3);
		assertEquals(window.getPinArray()[2][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell3() {
		window.setPin(2, 3);
		assertEquals(window.getPinArray()[2][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell3() {
		window.setPin(3, 3);
		assertEquals(window.getPinArray()[2][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell3() {
		window.setPin(4, 3);
		assertEquals(window.getPinArray()[2][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell3() {
		window.setPin(5, 3);
		assertEquals(window.getPinArray()[2][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell3() {
		window.setPin(6, 3);
		assertEquals(window.getPinArray()[2][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell3() {
		window.setPin(7, 3);
		assertEquals(window.getPinArray()[2][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell3() {
		window.setPin(8, 3);
		assertEquals(window.getPinArray()[2][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 4

	@Test
	public void testSetPin1Cell4() {
		window.setPin(1, 4);
		assertEquals(window.getPinArray()[3][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell4() {
		window.setPin(2, 4);
		assertEquals(window.getPinArray()[3][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell4() {
		window.setPin(3, 4);
		assertEquals(window.getPinArray()[3][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell4() {
		window.setPin(4, 4);
		assertEquals(window.getPinArray()[3][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell4() {
		window.setPin(5, 4);
		assertEquals(window.getPinArray()[3][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell4() {
		window.setPin(6, 4);
		assertEquals(window.getPinArray()[3][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell4() {
		window.setPin(7, 4);
		assertEquals(window.getPinArray()[3][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell4() {
		window.setPin(8, 4);
		assertEquals(window.getPinArray()[3][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 5

	@Test
	public void testSetPin1Cell5() {
		window.setPin(1, 5);
		assertEquals(window.getPinArray()[4][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell5() {
		window.setPin(2, 5);
		assertEquals(window.getPinArray()[4][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell5() {
		window.setPin(3, 5);
		assertEquals(window.getPinArray()[4][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell5() {
		window.setPin(4, 5);
		assertEquals(window.getPinArray()[4][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell5() {
		window.setPin(5, 5);
		assertEquals(window.getPinArray()[4][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell5() {
		window.setPin(6, 5);
		assertEquals(window.getPinArray()[4][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell5() {
		window.setPin(7, 5);
		assertEquals(window.getPinArray()[4][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell5() {
		window.setPin(8, 5);
		assertEquals(window.getPinArray()[4][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 6

	@Test
	public void testSetPin1Cell6() {
		window.setPin(1, 6);
		assertEquals(window.getPinArray()[5][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell6() {
		window.setPin(2, 6);
		assertEquals(window.getPinArray()[5][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell6() {
		window.setPin(3, 6);
		assertEquals(window.getPinArray()[5][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell6() {
		window.setPin(4, 6);
		assertEquals(window.getPinArray()[5][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell6() {
		window.setPin(5, 6);
		assertEquals(window.getPinArray()[5][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell6() {
		window.setPin(6, 6);
		assertEquals(window.getPinArray()[5][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell6() {
		window.setPin(7, 6);
		assertEquals(window.getPinArray()[5][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell6() {
		window.setPin(8, 6);
		assertEquals(window.getPinArray()[5][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 7

	@Test
	public void testSetPin1Cell7() {
		window.setPin(1, 7);
		assertEquals(window.getPinArray()[6][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell7() {
		window.setPin(2, 7);
		assertEquals(window.getPinArray()[6][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell7() {
		window.setPin(3, 7);
		assertEquals(window.getPinArray()[6][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell7() {
		window.setPin(4, 7);
		assertEquals(window.getPinArray()[6][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell7() {
		window.setPin(5, 7);
		assertEquals(window.getPinArray()[6][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell7() {
		window.setPin(6, 7);
		assertEquals(window.getPinArray()[6][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell7() {
		window.setPin(7, 7);
		assertEquals(window.getPinArray()[6][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell7() {
		window.setPin(8, 7);
		assertEquals(window.getPinArray()[6][7].getBackground(), Color.GREEN);
	}

	// FOR CELL 8

	@Test
	public void testSetPin1Cell8() {
		window.setPin(1, 8);
		assertEquals(window.getPinArray()[7][0].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin2Cell8() {
		window.setPin(2, 8);
		assertEquals(window.getPinArray()[7][1].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin3Cell8() {
		window.setPin(3, 8);
		assertEquals(window.getPinArray()[7][2].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin4Cell8() {
		window.setPin(4, 8);
		assertEquals(window.getPinArray()[7][3].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin5Cell8() {
		window.setPin(5, 8);
		assertEquals(window.getPinArray()[7][4].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin6Cell8() {
		window.setPin(6, 8);
		assertEquals(window.getPinArray()[7][5].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin7Cell8() {
		window.setPin(7, 8);
		assertEquals(window.getPinArray()[7][6].getBackground(), Color.GREEN);
	}

	@Test
	public void testSetPin8Cell8() {
		window.setPin(8, 8);
		assertEquals(window.getPinArray()[7][7].getBackground(), Color.GREEN);
	}
	

	//----------------------- ENABLE BUTTONS (For button 1 to 15)-------------------------------------

	
	@Test
	public void testEnableButton1() {
		window.enableButton(1);
		assertEquals(true, window.getButtonArray()[0].isEnabled());
	}

	@Test
	public void testEnableButton2() {
		window.enableButton(2);
		assertEquals(true, window.getButtonArray()[1].isEnabled());
	}

	@Test
	public void testEnableButton3() {
		window.enableButton(3);
		assertEquals(true, window.getButtonArray()[2].isEnabled());
	}

	@Test
	public void testEnableButton4() {
		window.enableButton(4);
		assertEquals(true, window.getButtonArray()[3].isEnabled());
	}

	@Test
	public void testEnableButton5() {
		window.enableButton(5);
		assertEquals(true, window.getButtonArray()[4].isEnabled());
	}

	@Test
	public void testEnableButton6() {
		window.enableButton(6);
		assertEquals(true, window.getButtonArray()[5].isEnabled());
	}

	@Test
	public void testEnableButton7() {
		window.enableButton(7);
		assertEquals(true, window.getButtonArray()[6].isEnabled());
	}

	@Test
	public void testEnableButton8() {
		window.enableButton(8);
		assertEquals(true, window.getButtonArray()[7].isEnabled());
	}

	@Test
	public void testEnableButton9() {
		window.enableButton(9);
		assertEquals(true, window.getButtonArray()[8].isEnabled());
	}

	@Test
	public void testEnableButton10() {
		window.enableButton(10);
		assertEquals(true, window.getButtonArray()[9].isEnabled());
	}

	@Test
	public void testEnableButton11() {
		window.enableButton(11);
		assertEquals(true, window.getButtonArray()[10].isEnabled());
	}

	@Test
	public void testEnableButton12() {
		window.enableButton(12);
		assertEquals(true, window.getButtonArray()[11].isEnabled());
	}

	@Test
	public void testEnableButton13() {
		window.enableButton(13);
		assertEquals(true, window.getButtonArray()[12].isEnabled());
	}

	@Test
	public void testEnableButton14() {
		window.enableButton(14);
		assertEquals(true, window.getButtonArray()[13].isEnabled());
	}

	@Test
	public void testEnableButton15() {
		window.enableButton(15);
		assertEquals(true, window.getButtonArray()[14].isEnabled());
	}
	

	//----------------------- DISABLE BUTTONS (For button 1 to 15)------------------------------

	
	@Test
	public void testDisableButton1() {
		window.disableButton(1);
		assertEquals(false, window.getButtonArray()[0].isEnabled());
	}

	@Test
	public void testDisableButton2() {
		window.disableButton(2);
		assertEquals(false, window.getButtonArray()[1].isEnabled());
	}

	@Test
	public void testDisableButton3() {
		window.disableButton(3);
		assertEquals(false, window.getButtonArray()[2].isEnabled());
	}

	@Test
	public void testDisableButton4() {
		window.disableButton(4);
		assertEquals(false, window.getButtonArray()[3].isEnabled());
	}

	@Test
	public void testDisableButton5() {
		window.disableButton(5);
		assertEquals(false, window.getButtonArray()[4].isEnabled());
	}

	@Test
	public void testDisableButton6() {
		window.disableButton(6);
		assertEquals(false, window.getButtonArray()[5].isEnabled());
	}

	@Test
	public void testDisableButton7() {
		window.disableButton(7);
		assertEquals(false, window.getButtonArray()[6].isEnabled());
	}

	@Test
	public void testDisableButton8() {
		window.disableButton(8);
		assertEquals(false, window.getButtonArray()[7].isEnabled());
	}

	@Test
	public void testDisableButton9() {
		window.disableButton(9);
		assertEquals(false, window.getButtonArray()[8].isEnabled());
	}

	@Test
	public void testDisableButton10() {
		window.disableButton(10);
		assertEquals(false, window.getButtonArray()[9].isEnabled());
	}

	@Test
	public void testDisableButton11() {
		window.disableButton(11);
		assertEquals(false, window.getButtonArray()[10].isEnabled());
	}

	@Test
	public void testDisableButton12() {
		window.disableButton(12);
		assertEquals(false, window.getButtonArray()[11].isEnabled());
	}

	@Test
	public void testDisableButton13() {
		window.disableButton(13);
		assertEquals(false, window.getButtonArray()[12].isEnabled());
	}

	@Test
	public void testDisableButton14() {
		window.disableButton(14);
		assertEquals(false, window.getButtonArray()[13].isEnabled());
	}

	@Test
	public void testDisableButton15() {
		window.disableButton(15);
		assertEquals(false, window.getButtonArray()[14].isEnabled());
	}

	// ------------------------------------ENABLE ALL BUTTONS--------------------------------------

	@Test
	public void testEnableAll() {
		window.enableAll();
		boolean x = true;
		for (int i = 0; i < window.getNumberOfButtons(); i++) {
			x = x && window.getButtonArray()[i].isEnabled();
		}
		assertEquals(true, x);
	}

	//------------------------------------- DISABLE ALL BUTTONS-------------------------------------
	@Test
	public void testDisableAll() {
		window.disableAll();
		boolean x = false;
		for (int i = 0; i < window.getNumberOfButtons(); i++) {
			x = x || window.getButtonArray()[i].isEnabled();
		}
		assertEquals(false, x);
	}
	
	

	//-------------------------------------- BUTTON EVENTS (For button 1 to 15)----------------------

	@Test
	public void testButton1Event() {
		window.getButtonArray()[0].doClick();
		assertEquals(window.getX(), 1);
	}

	@Test
	public void testButton2Event() {
		window.getButtonArray()[1].doClick();
		assertEquals(window.getX(), 2);
	}

	@Test
	public void testButton3Event() {
		window.getButtonArray()[2].doClick();
		assertEquals(window.getX(), 3);
	}

	@Test
	public void testButton4Event() {
		window.getButtonArray()[3].doClick();
		assertEquals(window.getX(), 4);
	}

	@Test
	public void testButton5Event() {
		window.getButtonArray()[4].doClick();
		assertEquals(window.getX(), 5);
	}

	@Test
	public void testButton6Event() {
		window.getButtonArray()[5].doClick();
		assertEquals(window.getX(), 6);
	}

	@Test
	public void testButton7Event() {
		window.getButtonArray()[6].doClick();
		assertEquals(window.getX(), 7);
	}

	@Test
	public void testButton8Event() {
		window.getButtonArray()[7].doClick();
		assertEquals(window.getX(), 8);

	}

	@Test
	public void testButton9Event() {
		window.getButtonArray()[8].doClick();
		assertEquals(window.getX(), 9);
	}

	@Test
	public void testButton10Event() {
		window.getButtonArray()[9].doClick();
		assertEquals(window.getX(), 10);
	}

	@Test
	public void testButton11Event() {
		window.getButtonArray()[10].doClick();
		assertEquals(window.getX(), 11);
	}

	@Test
	public void testButton12Event() {
		window.getButtonArray()[11].doClick();
		assertEquals(window.getX(), 12);
	}

	@Test
	public void testButton13Event() {
		window.getButtonArray()[12].doClick();
		assertEquals(window.getX(), 13);
	}

	@Test
	public void testButton14Event() {
		window.getButtonArray()[13].doClick();
		assertEquals(window.getX(), 14);
	}

	@Test
	public void testButton15Event() {
		window.getButtonArray()[14].doClick();
		assertEquals(window.getX(), 15);

	}
}
