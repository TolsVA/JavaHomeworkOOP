package org.example.homework_2.employee;

import org.example.homework_2.animal.Person;

public class Employee  {
    private final Person person;
    private final Profession post;
    
    public Person getPerson() {
        return person;
    }

    public Profession getPost() {
        return post;
    }

    private Employee(Builder builder) {
        this.person = builder.person;
        this.post = builder.post;
    }
    public static class Builder{
        private Person person;
        private Profession post;
        
        public Builder setPerson(Person person) {
            this.person = person;
            return self();
        }

        public Builder setPost(Profession post) {
            this.post = post;
            return self();
        }

        public Employee build() {
            return new Employee(this);
        }

        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Сотрудник: " + person +
                " Должность: " + post.getNameProfession() +
                " Табельный номер: " + post.getPersonnelNumber() +
                " Зарплата: " + post.getSalary();
    }
}