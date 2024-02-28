package designpatterns.builder.outerbuilder;

public class StudentBuilder {
    private long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String group;
    private String faculty;


    public StudentBuilder id(long id) {
        this.id = id;
        return this;
    }

    public StudentBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder secondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public StudentBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder group(String group) {
        this.group = group;
        return this;
    }

    public StudentBuilder faculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public Student build(){
        return new Student(this);
    }


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public String getFaculty() {
        return faculty;
    }
}
