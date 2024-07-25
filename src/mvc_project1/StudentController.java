package mvc_project1;

public class StudentController {
    // Model object
    private Student model;
    // View object
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Setter methods -  this is to control model objects
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentRollNum(String rollno) {
        model.setRollno(rollno);
    }

    // Getter methods
    public String getStudentName() {
        return model.getName();
    }
    public String getStudentRollNum() {
        return model.getRollno();
    }

   

    // Control object view types
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollno());
    }
}
