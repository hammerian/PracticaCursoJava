package practicas.Java_230727;

public class PromedioEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ageMorning = {22, 24, 28, 30, 36, 40};
		int[] ageAfternoon = {25, 27, 31, 33, 39, 43};
		int[] ageNight = {21, 26, 27, 32, 35, 42};
		
		double averageMorning = 0;
		double averageAfternoon = 0;
		double averageNight = 0;
		
		for (int i=0;i < ageMorning.length;i++) {
			averageMorning = averageMorning + ageMorning[i];
		}
		for (int i=0;i < ageAfternoon.length;i++) {
			averageAfternoon = averageAfternoon + ageAfternoon[i];
		}
		for (int i=0;i < ageNight.length;i++) {
			averageNight = averageNight + ageNight[i];
		}
		System.out.println("\nEl promedio de edad del truno de mañana es: "+ averageMorning/ageMorning.length);
		System.out.println("\nEl promedio de edad del truno de tarde es: "+ averageAfternoon/ageAfternoon.length);
		System.out.println("\nEl promedio de edad del truno de noche es: "+ averageNight/ageNight.length);	
		
		if(((averageMorning/ageMorning.length) > (averageAfternoon/ageAfternoon.length)) && ((averageMorning/ageMorning.length) > (averageNight/ageNight.length))) {
			System.out.println("\nEl turno de mañana tiene el promedio de edad mayor");
		} else if(((averageAfternoon/ageAfternoon.length) > (averageMorning/ageMorning.length)) && ((averageAfternoon/ageAfternoon.length) > (averageNight/ageNight.length))) {
			System.out.println("\nEl turno de tarde tiene el promedio de edad mayor");
		} else if(((averageNight/ageNight.length) > (averageMorning/ageMorning.length)) && ((averageNight/ageNight.length) > (averageAfternoon/ageAfternoon.length))) {
			System.out.println("\nEl turno de noche tiene el promedio de edad mayor");
		}
	}

}
