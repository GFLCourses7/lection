package designpatterns.builder.outerbuilder;


public class Student {
    private long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String group;
    private String faculty;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.secondName = studentBuilder.getSecondName();
        this.age = studentBuilder.getAge();
        this.group = studentBuilder.getGroup();
        this.faculty = studentBuilder.getFaculty();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
