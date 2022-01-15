package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
	    Human h = new Human();
		Animal dog = new Pet("dog");
		dog.name = "Szarik";
	    h.pet = dog;
	    dog.takeForAWalk();
		dog.feed();
	    dog.feed(0.4);
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.feed();

		h.setSalary(-1000);
		h.setSalary(2000);
		Diesel s1 = new Diesel("Ford","Focus",2012,1700,200, 16000);
		h.setCar(s1);

		Diesel s2 = new Diesel("Ford","Focus",2012,1700,200, 16000);

		h.setSalary(5000);
		Electric s3 = new Electric("Tesla","S",2018,2000,250, 210000);
		h.setCar(s3);

		System.out.println("Czy dwa samochody o tych samych polach są równe?");
		System.out.println(s1.equals(s2));

		System.out.println(h);

		Phone p = new Phone("Apple","IPhone X", 2017);

		s1.turnOn();
		p.turnOn();

		FarmAnimal fa = new FarmAnimal("cow");
		fa.beEaten();

		p.installAnApp(new URL(null,"http://www.store2.com/app1/version/2137"));
		p.installAnApp("app2");
		p.installAnApp("app3","2.9.9");
		ArrayList<String> apps = new ArrayList<>();
		apps.add("app4");
		apps.add("app5");
		apps.add("app6");

		p.installAnApp(apps);

		Car s4 = new LPG("Opel","Astra",2014,1600,180, 19500);

		s1.refuel();
		s2.refuel();
		s3.refuel();
		s4.refuel();
    }
}
