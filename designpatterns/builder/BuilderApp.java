package designpatterns.builder;

import designpatterns.builder.innerclassbuilder.StudentWithInnerBuilder;
import designpatterns.builder.outerbuilder.Student;
import designpatterns.builder.outerbuilder.StudentBuilder;

public class BuilderApp {
    public static void main(String[] args) {
        Student studentOuter = new StudentBuilder()
                .id(1)
                .firstName("Yaroslav")
                .secondName("Kondrasiuk")
                .age(19)
                .group("IA-14")
                .faculty("FIOT")
                .build();

        System.out.println("============ Outer builder ===========");
        System.out.println(studentOuter);

        Student studentOuter1 = new StudentBuilder()
                .id(2)
                .firstName("Maksym")
                .secondName("Krychinin")
                .age(21)
                .group("IA-14")
                .faculty("FIOT")
                .build();

        System.out.println(studentOuter1);


        StudentWithInnerBuilder student1 = new StudentWithInnerBuilder.Builder()
                .id(1)
                .firstName("Yaroslav")
                .secondName("Kondrasiuk")
                .age(19)
                .group("IA-14")
                .faculty("FIOT")
                .build();

        System.out.println("============ Inner builder ===========");
        System.out.println(student1);
        StudentWithInnerBuilder student2 = new StudentWithInnerBuilder.Builder()
                .id(2)
                .firstName("Maksym")
                .secondName("Krychinin")
                .age(21)
                .group("IA-14")
                .faculty("FIOT")
                .build();

        System.out.println(student2);
    }
}
