package geekBrains.ru.lesson5;

public class HomeWork_5 {
    public static void main(String[] args) {
        employee[] empCorp = new employee[5];
        empCorp[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",56000,25);
        empCorp[1] = new employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",32400,42);
        empCorp[2] = new employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",11300,35);
        empCorp[3] = new employee("Pupkina Nadezda", "EnvelopeLinker", "pupkina@mailbox.com", "892312316",5520,48);
        empCorp[4] = new employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317",15670,39);
        for (employee employee : empCorp) {
            if (employee.getAge() > 40)
                System.out.println(employee);
            System.out.println();
        }
    }

    static class employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public employee (String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge(){
            return age;
        }

        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }
}
