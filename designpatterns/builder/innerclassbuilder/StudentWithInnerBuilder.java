package designpatterns.builder.innerclassbuilder;

public class StudentWithInnerBuilder {
    private Long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String group;
    private String faculty;


    public static class Builder{

        private StudentWithInnerBuilder student = new StudentWithInnerBuilder();

        public Builder() {
        }

        public Builder id(long id) {
            student.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            student.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            student.secondName = secondName;
            return this;
        }

        public Builder age(Integer age) {
            student.age = age;
            return this;
        }

        public Builder group(String group) {
            student.group = group;
            return this;
        }

        public Builder faculty(String faculty) {
            student.faculty = faculty;
            return this;
        }

        public StudentWithInnerBuilder build(){
            return student;
        }
    }

    @Override
    public String toString() {
        return "StudentWithInnerBuilder{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
