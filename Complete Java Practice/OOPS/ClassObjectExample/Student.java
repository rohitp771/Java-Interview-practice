package OOPS.ClassObjectExample;

public class Student {
    private String firstName;
    private Integer standard;
    private String lastName;
    private Integer age;

    Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getStandard() {
        return standard;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "\nfirstName :"+ this.firstName +"\nlastName :"+this.lastName+"\n age:"+this.age+"\nstandard :"+standard;
    }

}
