package copilotTrain;

public class Day4 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Person{
    private int age;
    public Person(int initialAge) {
        this.age = checkAge(initialAge);
    }

    //check age is not negative
    //if Age is negative, print "Age is not valid" and return 0;
    private int checkAge(int initialAge) {
        if(initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            return 0;
        } else {
            return initialAge;
        }
    }

    //increase age +1
    public void yearPasses() {
        this.age++;
    }

    //if age < 13 print "You are young."
    //if age >= 13 && age <18 print "You are a teenager."
    //else , print "You are old."
    public String amIOld(){
        if(this.age < 13) {
            return "You are young.";
        } else if(this.age >= 13 && this.age < 18) {
            return "You are a teenager.";
        } else {
            return "You are old.";
        }
    }

}