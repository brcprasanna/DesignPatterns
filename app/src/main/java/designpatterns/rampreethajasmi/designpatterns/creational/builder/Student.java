package designpatterns.rampreethajasmi.designpatterns.creational.builder;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class Student {
    private String name;
    private String number;
    private boolean isDayScholar = false;
    private int yearJoined;


    private Student(StudentBuilder builder) {
        this.name  = builder.name;
        this.number = builder.number;
        this.isDayScholar = builder.isDayScholar;
        this.yearJoined = builder.yearJoined;
    }

    @Override
    public String toString() {
        return this.name+this.number+this.isDayScholar +this.yearJoined;
    }

    public static class StudentBuilder {
        private String name;
        private String number;
        private boolean isDayScholar = false;
        private int yearJoined;

        public StudentBuilder(String name, String number, int yearJoined) {
            this.name = name;
            this.number = number;
            this.yearJoined = yearJoined;
        }

        public void setIsDayScholar(boolean isDayScholar) {
            this.isDayScholar = isDayScholar;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
