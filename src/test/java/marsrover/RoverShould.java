package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverShould {

    Rover rover;

    @Test
    void roverShould() {
        rover = new Rover(new Grid());
        assertEquals("0-0-N", rover.execute(""));
    }
}
