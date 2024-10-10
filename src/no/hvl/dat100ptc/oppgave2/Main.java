package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	
	public static void main(String[] args) {

		GPSPoint gpspoint1 = new GPSPoint(4, 1.0, 2.0, 3.0);
		GPSPoint gpspoint2 = new GPSPoint(13, 3.0, 4.2, 5.3);
		
		GPSData gpsData = new GPSData(2);
		
		gpsData.insertGPS(gpspoint1);
		gpsData.insertGPS(gpspoint2);
		
		gpsData.print();
		
	}
}
