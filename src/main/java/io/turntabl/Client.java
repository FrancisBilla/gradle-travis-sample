package io.turntabl;

public class Client {

    //VARIABLES
    private String clientName;  //Name of Client
    private int clientID;       //ID of Client
    private ServiceLevel serviceLevel;  //Service Level of Client
    private ClientType clientType;


    //CONSTRUCTOR FOR VARIABLES
    public Client(String clientName, int clientID, ServiceLevel serviceLevel, ClientType clientType) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.serviceLevel = serviceLevel;
        this.clientType = clientType;
    }

    //GETTER FOR CLIENT'S NAME
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

    public ClientType getClientType() {
        return clientType;
    }


    //FORMATTING OF OUTPUT

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientID=" + clientID +
                ", serviceLevel=" + serviceLevel +
                ", clientType=" + clientType +
                '}';
    }

}
