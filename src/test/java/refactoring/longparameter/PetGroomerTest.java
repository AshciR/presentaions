package refactoring.longparameter;

import org.junit.jupiter.api.Test;
import refactoring.Animal;
import refactoring.Dog;
import refactoring.longparamerter.GroomRequest;
import refactoring.longparamerter.PetGroomer;
import refactoring.longparamerter.PetGroomerRefactor;

class PetGroomerTest {

    @Test
    void groom() {
        // Given: We have a pet
        Animal lulu = new Dog("Lulu");

        // Expect: We take her to the groomer the grooming happens
        new PetGroomer().groom(lulu, "wash", 200.0, "Richie", true);
    }

    @Test
    void groomRefactored() {
        // Given: We have a pet
        Animal lulu = new Dog("Lulu");

        // Expect: We take her to the groomer the grooming happens
        GroomRequest request = new GroomRequest("wash", 200.0, "Richie", true);
        new PetGroomerRefactor().groom(lulu, request);
    }
}