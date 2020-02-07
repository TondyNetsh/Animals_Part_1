public class Animal {
    private String name;

    public void sound(){
        System.out.println("Dog barks");
        System.out.println("Cat meows");
    }
    public void eats(){
        System.out.println(name + " eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
