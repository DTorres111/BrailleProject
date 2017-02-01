package eecs2311.simulator;

import static org.junit.Assert.*;
import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {
	
	private SimulatorAPI window;



	@Before
	public void setUp() throws Exception {
		
		window= new SimulatorAPI(5,8,2);
		window.getFrame().setVisible(true);
	
	}
	
	
	@Test
	public void testSetletter()
	{
		window.setLetter('a');
		assertEquals(window.getPinArray()[0].getBackground(),Color.GREEN);
	}
	
	
	@Test
	public void testSetletter1()
	{
		window.setLetter('A');
		assertEquals(window.getPinArray()[0].getBackground(),Color.GREEN);
	}
	
	
	@Test
	public void testSetletter2()
	{
		window.setLetter('Z');
		boolean x=window.getPinArray()[0].getBackground()==Color.GREEN;
		boolean y=window.getPinArray()[3].getBackground()==Color.GREEN;
		boolean z=window.getPinArray()[4].getBackground()==Color.GREEN;
		boolean l=window.getPinArray()[5].getBackground()==Color.GREEN;
		boolean m= x==y==l==z;
		assertEquals(true,m);
		
	}
	
	
	@Test
	public void testSetletter3()
	{
		window.setLetter('K');
		boolean x=window.getPinArray()[0].getBackground()==Color.GREEN;
		boolean y=window.getPinArray()[4].getBackground()==Color.GREEN;
		boolean m= x==y;
		assertEquals(true,m);
		
	}
	
	
	@Test
	public void testSetPin()
	{
		window.setPin(1);
		assertEquals(window.getPinArray()[0].getBackground(),Color.GREEN);
	}
	
	@Test
	public void testSetPin2()
	{
		window.setPin(2);
		assertEquals(window.getPinArray()[1].getBackground(),Color.GREEN);
	}
	
	@Test
	public void testSetPin3()
	{
		window.setPin(3);
		assertEquals(window.getPinArray()[2].getBackground(),Color.GREEN);
	}
	
	
	@Test
	public void testSetPin4()
	{
		window.setPin(4);
		assertEquals(window.getPinArray()[3].getBackground(),Color.GREEN);
	}
	
	
	@Test
	public void testSetPin5()
	{
		window.setPin(5);
		assertEquals(window.getPinArray()[4].getBackground(),Color.GREEN);
	}
	
	
	@Test
	public void testSetPin6()
	{
		window.setPin(6);
		assertEquals(window.getPinArray()[5].getBackground(),Color.GREEN);
	}
	
	

	@Test
	public void testEnableButton()
	{
		window.enableButton(1);
		boolean x= window.getButtonArray()[0].isEnabled();
		assertEquals(true,x);
	}
	
	
	@Test
	public void testDisableButton()
	{
		window.disableButton(1);
		boolean x= window.getButtonArray()[0].isEnabled();
		assertEquals(false,x);
	}
	
	
	@Test
	public void testDisableAll()
	{
		window.disableAll();
		boolean x=false;
		for(int i=0; i<window.getNumberOfButtons();i++)
		{
		x= x||window.getButtonArray()[i].isEnabled();
		}
		assertEquals(false,x);
	}
	
	
	@Test
	public void testEnableAll()
	{
		window.enableAll();
		boolean x=true;
		for(int i=0; i<window.getNumberOfButtons();i++)
		{
		x= x&&window.getButtonArray()[i].isEnabled();
		}
		assertEquals(true,x);
	}
	
	
	@Test
	public void testButtonEvent()
	{
		window.getButtonArray()[0].doClick();
		assertEquals(window.getX(),1);
	}
}
