package io.turntabl;

import java.util.Arrays;
import java.util.List;




    public class ClientRegister{
        private List<Client> clients;

        public ClientRegister(List<Client> clients) {
            this.clients = clients;
        }




        //COLLECTION OF CLIENTS
        public List<Client> getClients() {
            return getClients();
        }

        //CONTACT NAMES OF ALL GOLD CLIENTS

        public Client getGoldClients(){
            for (Client eachClient: clients){
                if(eachClient.getServiceLevel() == ServiceLevel.Gold ){
                    System.out.println("The client name is : "+ eachClient.getClientName());
                }
            }
            return getGoldClients();
        }

        //GET CLIENT'S NAME BY ID

/*
        int count = clients.stream()
                .filter(o -> o.getServiceLevel() == ServiceLevel.Gold)
                .mapToInt(ServiceLevel.Gold::getServiceLevel).count();
*/
/*
        public void getClientNameID(int clientIDD){
            for(Client eachClient: clients){
                if(eachClient.getClientID() == clientIDD){
                    System.out.println(eachClient.getClientName());
                }
            }

        }

        public int getTotalServiceLevelGold(){
            int total = 0;
           for(Client eachGoldClient: clients){
               if(eachGoldClient.getServiceLevel()==ServiceLevel.Gold){
                   System.out.println(eachGoldClient);
               }

            total +=eachGoldClient;
            }
            return total.size() ;
        }
        public int getTotalServiceLevelPlatium(){
            int total = 0;
            for(Client eachPlatiumClient: clients){
                if(eachPlatiumClient.getServiceLevel()==ServiceLevel.Platinum){
                    System.out.println(eachPlatiumClient);
                }

                total +=eachPlatiumClient;
            }
            return total.size() ;
        }

        public int getTotalServiceLevelPremium(){
            int total = 0;
            for(Client eachPremiumClient: clients){
                if(eachPremiumClient.getServiceLevel()==ServiceLevel.Premium){
                    System.out.println(eachPremiumClient);
                }

                total +=eachPremiumClient;
            }
            return total.size() ;
        }
    } */
}
