package io.turntabl;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ClientRegisterTest {

/*
    ClientRegister mockedRegister =mock(ClientRegister.class);

    when(mockedRegister.query("SELECT * FROM CLIENTS")).

    thenReturn(
            Arrays.asList("Hanny",1234,ServiceLevel.Gold)  }
    )

*/

    @Test
   public void testGetCorporateAndPrivateClients() {
        ClientRegister clientRegister = new ClientRegister(
                Arrays.asList(
     new CorporateClient("Francis Billa","Morgan Stanley",3272,ServiceLevel.Gold),
     new PrivateClient("Sam",0034,ServiceLevel.Premium),
     new PrivateClient("Alex",7564,ServiceLevel.Platinum),
     new CorporateClient("Sam Moorhorse","Turntabl GH",5454,ServiceLevel.Premium),
     new PrivateClient("Mary",4321,ServiceLevel.Gold),
     new CorporateClient("  Vivian Boakye","Vee Capitals",7874,ServiceLevel.Platinum)

     ));
     assertEquals("ClientRegister", clientRegister.getClass().getSimpleName());
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