package resourceServer;

public class ResourceServer implements ResourceServerImpl {
    private String name;
    private int age;

    public ResourceServer(String name, int age) {
        this.name = "";
        this.age = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}