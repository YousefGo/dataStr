
package week2;

public class testPerson {
    public static void main(String[] args) {
        Person pr1 = new Person("yousef",21);
        System.out.println(pr1);
        PersonV2 pr2 = new PersonV2();
        pr2.setName(pr1.getName());
        pr2.setAge(pr1.getAge());
        pr2.setHeight(165);
        System.out.println(pr2);
        
    }
    
}
