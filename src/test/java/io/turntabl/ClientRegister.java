package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientRegister extends Client {
    private List<Client> clients;

    public ClientRegister(String clientName, int clientID, ServiceLevel serviceLevel, ClientType clientType, List<Client> clients) {
        super(clientName, clientID, serviceLevel, clientType);
        this.clients = clients;
    }


    //COLLECTION OF CLIENTS
    public List<Client> getClients() {
        List<Client> clients = Arrays.asList(
          new Client("Francis",2134,ServiceLevel.Gold,ClientType.Private),
          new Client("Dennis",3213,ServiceLevel.Gold,ClientType.Corporate),
          new Client("Sam",0034,ServiceLevel.Premium,ClientType.Corporate),
          new Client("Alex",7564,ServiceLevel.Platinum,ClientType.Corporate),
          new Client("Shadrack",5432,ServiceLevel.Premium,ClientType.Private),
          new Client("Mary",4321,ServiceLevel.Gold,ClientType.Corporate)
         );

        return getClients();
    }

    //CONTACT NAMES OF ALL GOLD CLIENTS
    public void getGoldClients(){
        for (Client eachClient: clients){
            if(eachClient.getServiceLevel() == ServiceLevel.Gold ){
                System.out.println("The client name is : "+ getClientName());
            }
        }

    }

    //GET CLIENT'S NAME BY ID



    public void getClientNameID(int clientIDD){
        for(Client eachClient: clients){
            if(eachClient.getClientID() == clientIDD){
                System.out.println(eachClient.getClientName());
            }
        }

    }

    public double getTotalServiceLevelGold(){
        double total = 0;
       for(Client eachGoldClient: clients){
           if(eachGoldClient.getServiceLevel()==ServiceLevel.Gold){
               System.out.println(eachGoldClient);
           }

        total +=eachGoldClient;
    }
 return total.size() ;
}
}
