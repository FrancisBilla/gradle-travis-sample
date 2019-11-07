package io.turntabl;

public class Client implements ClientNameInterface {

    //VARIABLES
    private String clientName;  //Name of Client
    private int clientID;       //ID of Client
    private ServiceLevel serviceLevel;  //Service Level of Client


    //CONSTRUCTOR FOR VARIABLES
    public Client(String clientName, int clientID, ServiceLevel serviceLevel) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.serviceLevel = serviceLevel;

    }

    //GETTER FOR CLIENT'S NAME
    @Override
    public String getClientName() {

        return clientName;
    }

    //GETTER FOR CLIENT'S ID
    public int getClientID() {

        return clientID;
    }


    //GETTER FOR CLIENT SERVICE LEVEL
    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    //FORMATTING OF OUTPUT

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                ", serviceLevel=" + serviceLevel +
                '}';
    }

}
