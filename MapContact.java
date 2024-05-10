public class MapContact {
    private String name;
    private int age;

    public MapContact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MapContact(MapContact source) {
        this.name = source.name;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
