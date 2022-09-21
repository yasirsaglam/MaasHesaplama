public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
           return salary * 0.03;
        }
        return 0;
    }

    public double bonus() {
        int shift = workHours - 40;
        if (shift > 0) {
            return shift * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int thisYear = 2021;
        double rate;
        if (thisYear - hireYear <= 5) {
            rate = salary * 0.05;
        } else if (((thisYear - hireYear) <= 19) && ((thisYear - hireYear) >= 10)) {
            rate = salary * 0.10;
        } else {
            rate = salary * 0.15;
        }
        return rate;
    }

    public String toString() {
        return          "Çalışan Adı : " + name + "\n" +
                        "Maaşı : " + salary + "\n" +
                        "Çalışma Saati : " + workHours + "\n" +
                        "Başlangıç Yılı : " + hireYear + "\n" +
                        "Vergi : " + tax() + "\n" +
                        "Bonus : " + bonus() + "\n" +
                        "Vergi ve Bonuslarla Birlikte Geçerli Maaş : " + (salary - tax() + bonus()) + "\n" +
                        "Maaş Artışı : " + raiseSalary() + "\n" +
                        "Zamlı Net Maaş : " + (salary + raiseSalary()) + "\n";
    }
}
