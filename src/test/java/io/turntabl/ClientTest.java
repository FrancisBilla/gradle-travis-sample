package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getClients() {
        //assertArrayEquals(ServiceLevel.Gold );
    }

    @Test
    public void TestClientNameID() {
        Client client = new Client("Junior",5884,ServiceLevel.Platinum,ClientType.Corporate);
        assertEquals(5884,getClients());
    }

}