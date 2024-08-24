package com.kurtulussahin.java.robertcmartin.rcmartincoffemaker;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCoffeeMaker extends TestCase {
	public static void main(String[] args) {
		TestRunner.main(new String[]{"TestCoffeeMaker"});
	}
	public TestCoffeeMaker(String name) {
		super(name);
	}
	private M4UserInterface ui;
	private M4HotWaterSource hws;
	private M4ContainmentVessel cv;
	private M4CoffeeMakerAPIImplementation api;
	public void setUp() throws Exception {
		api = new M4CoffeeMakerAPIImplementation();
		ui = new M4UserInterface(api);
		hws = new M4HotWaterSource(api);
		cv = new M4ContainmentVessel(api);
		ui.init(hws, cv);
		hws.init(ui, cv);
		cv.init(ui, hws);
	}
	private void poll() {
		ui.poll();
		hws.poll();
		cv.poll();
	}
	public void tearDown() throws Exception {
	}
	public void testInitialConditions() throws Exception {
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	public void testStartNoPot() throws Exception {
		poll();
		api.buttonPressed = true;
		api.potPresent = false;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	public void testStartNoWater() throws Exception {
		poll();
		api.buttonPressed = true;
		api.boilerEmpty = true;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	public void testGoodStart() throws Exception {
		normalStart();
		assert(api.boilerOn == true);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	private void normalStart() {
		poll();
		api.boilerEmpty = false;
		api.buttonPressed = true;
		poll();
	}
	public void testStartedPotNotEmpty() throws Exception {
		normalStart();
		api.potNotEmpty = true;
		poll();
		assert(api.boilerOn == true);
		assert(api.lightOn == false);
		assert(api.plateOn == true);
		assert(api.valveClosed == true);
	}
	public void testPotRemovedAndReplacedWhileEmpty()
			throws Exception {
		normalStart();
		api.potPresent = false;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == false);
		api.potPresent = true;
		poll();
		assert(api.boilerOn == true);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	public void testPotRemovedWhileNotEmptyAndReplacedEmpty()
			throws Exception {
		normalFill();
		api.potPresent = false;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == false);
		api.potPresent = true;
		api.potNotEmpty = false;
		poll();
		assert(api.boilerOn == true);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
	private void normalFill() {
		normalStart();
		api.potNotEmpty = true;
		poll();
	}
	public void testPotRemovedWhileNotEmptyAndReplacedNotEmpty()
			throws Exception {
		normalFill();
		api.potPresent = false;
		poll();
		api.potPresent = true;
		poll();
		assert(api.boilerOn == true);
		assert(api.lightOn == false);
		assert(api.plateOn == true);
		assert(api.valveClosed == true);
	}
	public void testBoilerEmptyPotNotEmpty() throws Exception {
		normalBrew();
		assert(api.boilerOn == false);
		assert(api.lightOn == true);
		assert(api.plateOn == true);
		assert(api.valveClosed == true);
	}
	private void normalBrew() {
		normalFill();
		api.boilerEmpty = true;
		poll();
	}
	public void testBoilerEmptiesWhilePotRemoved()
			throws Exception {
		normalFill();
		api.potPresent = false;
		poll();
		api.boilerEmpty = true;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == true);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
		api.potPresent = true;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == true);
		assert(api.plateOn == true);
		assert(api.valveClosed == true);
	}
	public void testEmptyPotReturnedAfter() throws Exception {
		normalBrew();
		api.potNotEmpty = false;
		poll();
		assert(api.boilerOn == false);
		assert(api.lightOn == false);
		assert(api.plateOn == false);
		assert(api.valveClosed == true);
	}
}