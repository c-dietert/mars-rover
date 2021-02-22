package marsrover;

import marsrover.location.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverShould {
    Rover rover;

    @Test
    void start_at_position_0_0_N() {
        rover = new Rover(new Grid());
        assertEquals("0:0:N", rover.execute(""));
    }

    @Test
    void have_position_2_3_N_when_navigated_with_MMRMMLM() {
        rover = new Rover(new Grid());
        assertEquals("2:3:N", rover.execute("MMRMMLM"));
    }
}
