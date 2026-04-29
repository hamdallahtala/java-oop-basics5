public class Tester {
    public static void main(String[] args) {
        Dog d5 = new Dog();
        d5.setName("Lika");
        d5.setAge(1);
        System.out.println(d5);

        Circle c = new Circle();
        c.setRadius(3.2);
        System.out.println(c);

        Book b = new Book();
        b.setTitle("Dexter");
        b.setPages(500);
        System.out.println(b);

        BankAccount ba = new BankAccount();
        ba.setOwner("Tala");
        ba.setBalance(1000);
        System.out.println(ba);

        Light li = new Light();
        li.setOn(true);
        System.out.println(li);

        Classroom cl = new Classroom();
        String[] names = {"Diddy", "Kirk", "JohnPork"};
        cl.setStudents(names);
    }
}
