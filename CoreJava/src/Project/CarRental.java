package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRental {

}

class Car {
	private String carID;
	private String brand;
	private String model;
	private double basePricePerDay;
	private boolean isAvailable;

	public Car(String carID, String brand, String model, double basePricePerDay) {
		super();
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable = true;
	}

	public String getCarID() {
		return carID;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double calculatePrice(int rentalDays) {
		return basePricePerDay * rentalDays;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void rent() {
		isAvailable = false;
	}

	public void returnCar() {
		isAvailable = true;
	}
}

class Customer {

	private String customerID;
	private String name;

	public Customer(String customerID, String name) {
		super();
		this.customerID = customerID;
		this.name = name;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}
}

class Rental {
	private Car car;
	private Customer customer;
	private int days;

	public Rental(Car car, Customer customer, int days) {
		super();
		this.car = car;
		this.customer = customer;
		this.days = days;
	}

	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getDays() {
		return days;
	}
}

class CarRentalSystem {
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;

	public CarRentalSystem() {
		cars = new ArrayList<>();
		customers = new ArrayList<>();
		rentals = new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void rentCar(Car car, Customer customer, int days) {
		if (car.isAvailable()) {
			rentals.add(new Rental(car, customer, days));
		} else {
			System.out.println("Car is not available for rent");
		}
	}

	public void returnCar(Car car) {
		car.returnCar(); // front m kaam krdiya

		Rental rentaltoRemove = null;
		for (Rental rental : rentals) {
			if (rental.getCar() == car) {
				rentaltoRemove = rental;
				break;
			}
		}
		if(rentaltoRemove!= null) {
			rentals.remove(rentaltoRemove);
		}
		else {
			System.out.println("Car was not rented");
		}
	}
	
	public void menu() {
		Scanner s = new Scanner(System.in);
	}
}
