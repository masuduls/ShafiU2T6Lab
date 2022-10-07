public class BabyParrot
{
    private String species;
    private int age;
    private String name;
    private double weight;

    public BabyParrot(String species, int age, double weight)
    {
        this.species = species;
        this.age = age;
        this.name = ""; // use a default value of the 'empty string'
        this.weight = weight;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    // note this method RETURNS a String
    public String parrotInfo()
    {
        String str = "Species: " + species + "\n";
        str += "Name: " + name + "\n";
        str += "Age: " + age + "\n";
        str += "Weight: " + weight;
        return str;
    }

    public String getStudentInfo() {
        String info = "Student Full Name: " + firstName + " " + lastName + "\n";
        info += "Graduation Year: " + gradYear + "\n";
        info += "Number Of Tests: " + gradYear + "\n";
        info += "Average Test Score: " + averageTestScore() + "\n";
        info += "Is Passing: " + isPassing();
        return info;
    }
}
