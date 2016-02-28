package resourceServer;

public class ResourceServerController implements ResourceServerControllerMBean {
    private final ResourceServerImpl resourceServer;

    public ResourceServerController(ResourceServerImpl resourceServer) {
        this.resourceServer = resourceServer;
    }

    @Override
    public String getName() {
        return resourceServer.getName();
    }

    @Override
    public int getAge() {
        return resourceServer.getAge();
    }
}