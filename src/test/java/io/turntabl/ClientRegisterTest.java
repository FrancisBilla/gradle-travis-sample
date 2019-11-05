package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    @Test
   public void testGetClients() {
     Client client1 = new Client("Francis",2134,ServiceLevel.Gold);
     Client client2 =  new Client("Sam",0034,ServiceLevel.Premium);
     Client client3 =  new Client("Alex",7564,ServiceLevel.Platinum);
     Client client4 =  new Client("Shadrack",5432,ServiceLevel.Premium);
     Client client5 =  new Client("Mary",4321,ServiceLevel.Gold);
     Client client6 =  new Client("Dennis",3213,ServiceLevel.Gold);

     assertEquals("Francis", client1.getClientName());
      //assertEquals(ClientType.Corporate, client2.getClientType());
     // assertEquals(5432, client4.getClientID());
     }



    @Test
    public void testGetGoldClients() {
    }

    @Test
    public void testGetClientNameID() {
    }

    @Test
    public void testGetTotalServiceLevelGold() {
    }
}