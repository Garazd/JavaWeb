package main;

import resources.DBParametersResource;
import sax.ReadXMLFileSAX;

public class Main {
    public static void main(String[] args) throws Exception {
        DBParametersResource resource = (DBParametersResource) ReadXMLFileSAX.readXML("./data/MySqlResource.xdb");
        System.out.println(resource);
    }
}