package geekBrains.ru.lesson5;

    public class Employee {
        private String firstname;
        private String surname;
        private String email;
        private String phone;
        private String position;
        private int salary;
        private int age;

        public Employee(String firstname, String surname, int age, String email, String phone, String position, int salary) {
            this.firstname = firstname;
            this.surname = surname;
            this.age = age;
            this.email = email;
            this.phone = phone;
            this.position = position;
            this.salary = salary;
        }

        public Employee(String firstname, String surname) {
            this(firstname, surname, 18, null, null, null, 0);
        }

        public String validate(){
            if (age < 18){
                return "Работник старше 40!";
            }
            return null;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void printInfo(){
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstname='" + firstname + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", position='" + position + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }
