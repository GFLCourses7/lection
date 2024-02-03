import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Train;
import vehicles.Airplane;


public class Main{
	public static void main(String[] args){
		System.out.println("Main class console run");
		Vehicle vehicle = new Vehicle();
		vehicle.output();
		Vehicle car = new Car();
		car.output();
		Vehicle train = new Train();
		train.output();
		Vehicle airplane = new Airplane();
		airplane.output();

	}
}