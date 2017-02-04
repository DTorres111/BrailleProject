package eecs2311.simulator;

import static org.junit.Assert.*;
import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {

	private SimulatorAPI window;

	@Before
	public void setUp() throws Exception {

		window = new SimulatorAPI(20, 80, 70);
		window.getFrame().setVisible(true);

	}

	

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

	
	
	// ENABLE BUTTONS
	
	
	@Test
	public void testEnableButton1() {
		window.enableButton(1);	
		assertEquals(true,window.getButtonArray()[0].isEnabled());
	}

	
	@Test
	public void testEnableButton2() {
		window.enableButton(2);	
		assertEquals(true,window.getButtonArray()[1].isEnabled());
	}
	
	@Test
	public void testEnableButton3() {
		window.enableButton(3);	
		assertEquals(true,window.getButtonArray()[2].isEnabled());
	}
	

	
	@Test
	public void testEnableButton4() {
		window.enableButton(4);	
		assertEquals(true,window.getButtonArray()[3].isEnabled());
	}
	
	
	@Test
	public void testEnableButton5() {
		window.enableButton(5);	
		assertEquals(true,window.getButtonArray()[4].isEnabled());
	}
	
	@Test
	public void testEnableButton6() {
		window.enableButton(6);	
		assertEquals(true,window.getButtonArray()[5].isEnabled());
	}
	@Test
	public void testEnableButton7() {
		window.enableButton(7);	
		assertEquals(true,window.getButtonArray()[6].isEnabled());
	}

	
	@Test
	public void testEnableButton8() {
		window.enableButton(8);	
		assertEquals(true,window.getButtonArray()[7].isEnabled());
	}
	
	
	// DISABLE BUTTONS 
	
	
	@Test
	public void testDisableButton1() {
		window.disableButton(1);	
		assertEquals(false,window.getButtonArray()[0].isEnabled());
	}

	
	@Test
	public void testDisableButton2() {
		window.disableButton(2);	
		assertEquals(false,window.getButtonArray()[1].isEnabled());
	}
	
	@Test
	public void testDisableButton3() {
		window.disableButton(3);	
		assertEquals(false,window.getButtonArray()[2].isEnabled());
	}
	

	
	@Test
	public void testDisableButton4() {
		window.disableButton(4);	
		assertEquals(false,window.getButtonArray()[3].isEnabled());
	}
	
	
	@Test
	public void testDisableButton5() {
		window.disableButton(5);	
		assertEquals(false,window.getButtonArray()[4].isEnabled());
	}
	
	@Test
	public void testDisableButton6() {
		window.disableButton(6);	
		assertEquals(false,window.getButtonArray()[5].isEnabled());
	}
	@Test
	public void testDisableButton7() {
		window.disableButton(7);	
		assertEquals(false,window.getButtonArray()[6].isEnabled());
	}

	
	@Test
	public void testDisableButton8() {
		window.disableButton(8);	
		assertEquals(false,window.getButtonArray()[7].isEnabled());
	}
	
	// ENABLE ALL BUTTONS

	@Test
	public void testEnableAll() {
		window.enableAll();
		boolean x = true;
		for (int i = 0; i < window.getNumberOfButtons(); i++) {
			x = x && window.getButtonArray()[i].isEnabled();
		}
		assertEquals(true, x);
	}

	
	
	
	
	// BUTTON EVENTS
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
}
