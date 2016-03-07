package resources;

@SuppressWarnings("UnusedDeclaration")
public class DBParametersResource {
    private final String name;
    private final int age;

    public DBParametersResource() {
        this.name = "";
        this.age = 0;
    }

    public DBParametersResource(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DBParametersResource{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
}