import java.util.Arrays;

public class ejercicio1{
	public static void main(String args[]){
		
		double[] alumnos;
		alumnos = new double[10];
		
		for(int i=0; i <10;i++){
			alumnos[i] = Math.random() * 10;
		}
		
		for(int i=0; i <10; i++){
			Arrays.sort(alumnos);
		}
		
		for(int i=0; i <10; i++){
			System.out.println(alumnos[i]);
		}
	}
}
