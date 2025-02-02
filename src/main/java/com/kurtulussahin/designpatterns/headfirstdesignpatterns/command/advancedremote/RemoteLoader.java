package com.kurtulussahin.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		LightOnCommand livingRoomLightOn =
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff =
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn =
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff =
				new LightOffCommand(kitchenLight);
		CeilingFanOnCommand ceilingFanOn =
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff =
				new StereoOffCommand(stereo);
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);

		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.undoButtonWasPushed();
		
		
		Command[] partyOn = { livingRoomLightOn, ceilingFanOn, stereoOnWithCD};
		Command[] partyOff = { livingRoomLightOff, ceilingFanOff, stereoOff};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		System.out.println("remoteControl");
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(6);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(6);
	}
}
