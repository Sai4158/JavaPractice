package ist_day2_recap;

import java.util.Comparator;

public class Student2 implements Comparator<Student2> {

	public Student2() {
		
	}
	
	

    @Override
    public int compare(Student2 o1, Student2 o2) {
        if (o1.getGpa() < o2.getGpa()) {
            return -1;  // o1 has a lower GPA than o2
        } else if (o1.getGpa() == o2.getGpa()) {
            return 0;   // Both have the same GPA
        } else {
            return 1;   // o1 has a higher GPA than o2
        }
    }


}
