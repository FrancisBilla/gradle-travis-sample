package io.turntabl;

public class CorporateClient extends Client {


    private String accountManagerName;


    public CorporateClient(String accountManagerName,String clientName, int clientID, ServiceLevel serviceLevel) {
        super(clientName, clientID, serviceLevel);
        this.accountManagerName = accountManagerName;
    }


    @Override
    public String getClientName() {
        return this.accountManagerName;
    }
}
