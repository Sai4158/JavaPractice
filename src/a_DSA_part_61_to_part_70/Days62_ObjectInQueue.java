package a_DSA_part_61_to_part_70;

import java.util.LinkedList;
import java.util.Queue;

public class Days62_ObjectInQueue {

    public static void main(String[] args) {
    	person m1 = new person(22, "Vignes");
    	person m2 = new person(22, "Dinesh");

        // Adding the values to the queue
        Queue<person> st = new LinkedList<>();

        st.add(m1);
        st.add(m2);

        st.poll(); 
        person temp = st.poll(); 

        System.out.println(temp.age);  
    }
}

class person {
    int age;
    String name;

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
