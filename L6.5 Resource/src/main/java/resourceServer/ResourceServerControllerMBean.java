package resourceServer;

import resources.TestResource;

public interface ResourceServerControllerMBean {
    int getAge();
    String getName();
    void setTestResource(TestResource testResource);
}