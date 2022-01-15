package creatures;

import creatures.Animal;
import devices.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    public Animal pet;
    private Car car;
    private double salary;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.getWorth()) {
            System.out.println("Udało się kupić pojazd za gotówkę");
            this.car = car;
        }
        else if(salary > car.getWorth()/12.0) {
            System.out.println("Udało się kupić pojazd na kredyt");
            this.car = car;
        }
        else{
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Pobieranie danych o wypłacie: " + salary + " zł czas: " + dtf.format(now));
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Błąd kwota musi być nieujemna.");
        }
        else {
            System.out.println("Nowa kwota wypłaty została zapisana do systemu księgowego.");
            System.out.println("Proszę zgłosić się do pani Hani z kadr po aneks umowy");
            System.out.println("Nowa kwota wypłaty została zgłoszona do w US i ZUS");
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
