package persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetsDaoTest {

    @Test
    void getPet() {
        PetsDao dao = new PetsDao();
        assertEquals("Fluff Meister", dao.getPet().getName());
    }
}