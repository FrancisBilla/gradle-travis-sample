package io.turntabl;

public class PrivateClient extends Client {
    private String privateClientName;

    public PrivateClient(String privateClientName, int clientID, ServiceLevel serviceLevel) {
        super(privateClientName, clientID, serviceLevel);
        this.privateClientName = privateClientName;
    }
}
