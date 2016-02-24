package org.usfirst.frc.team1757.robot;

public class Autonomous {

	public static void printAutoMessages() {
		//TODO: InComplete
	}
	public static void crossLowBar(Drive autoDrive) {
		autoDrive.doAutoDrive(.3, 2);
		System.out.println("crossing Low Bar");
	}
	public static void crossRockWall(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Rock Wall");
	}
	public static void crossPortcullis(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Portcullis");
	}
	public static void crossCDF(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing CDF");
	}
	public static void crossRoughTerrain(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Rought Terrain");
	}
	public static void crossMoat(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Moat");
	}
	public static void crossRamparts(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Ramparts");
	}
	public static void crossDrawbridge(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing Drawbridge");
	}
	public static void crossSallyPort(Drive autoDrive) {
		//TODO: Add motor instructions
		System.out.println("crossing SallyPort");
	}
	
	public static void executeAutonomous(Defenses defense, Drive autoDrive) {
		switch (defense) {
		case LOW_BAR: 
			crossLowBar(autoDrive); 
			break;
		case ROCK_WALL: 
			crossRockWall(autoDrive); 
			break;
		case ROUGH_TERRAIN:
			crossRoughTerrain(autoDrive);
			break;
		case PORTCULLIS:
			crossPortcullis(autoDrive);
			break;
		case CHEVAL_DE_FRISE: 
			crossCDF(autoDrive);
			break;
		case MOAT: 
			crossMoat(autoDrive);
			break;
		case RAMPARTS:
			crossRamparts(autoDrive);
			break;
		case DRAWBRIDGE:
			crossDrawbridge(autoDrive);
			break;
		case SALLY_PORT:
			crossSallyPort(autoDrive);
			break;
		default: 
			System.out.println("NO DEFENSE SELECTED");
			break; 
		}
	}
}
