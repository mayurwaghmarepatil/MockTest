public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Mayur");
        System.out.println("the name of person is "+p.getName());

        p.setAge(25);
        System.out.println("the age of person is "+p.getAge());

        p.setAddress("pune");
        System.out.println("the Adress of person is "+p.address);

    }
}
