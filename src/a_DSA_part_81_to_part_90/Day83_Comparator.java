package a_DSA_part_81_to_part_90;

import java.util.PriorityQueue;

public class Day83_Comparator {

	public static void main(String[] args) {
		
        PriorityQueue<Person> pq = new PriorityQueue<>((a, b) -> a.age - b.age);

        pq.add(new Person("Sai11", 25, 180));
        pq.add(new Person("Sai22", 30, 175));
        pq.add(new Person("Sai33",25, 190));
        pq.add(new Person("Sai44", 22, 165));
	
        
        Person temp =  pq.poll();
        System.out.println(temp);
	}
}


class Person {
    int age;
    int height;
    String name;

    public Person(String name, int age, int height) {
    	this.name = name;
    	this.age = age;
        this.height = height;
    }
}