import org.example.Box;
import org.example.Drone;
import org.example.Window;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DroneTest {

    private Drone drone;

    @BeforeEach
    void setUp() {
        drone = new Drone();
    }

    @Test
    @DisplayName("Should not deliver a box with measures larger then the window")
    void shouldNotDeliverABoxWithMeasuresLargerThenTheWindow() {
        Box box = new Box(4, 5, 6);
        Window window = new Window(2, 3);
        drone.setBox(box);
        assertThat(drone.deliver(window)).isEqualTo("N");
    }

    @Test
    @DisplayName("Should deliver a box with at least one side passing throw the window")
    void shouldDeliverABoxWithAtLeastOneSidePassingThrowTheWindow() {
        Box box = new Box(2, 3, 4);
        Window window = new Window(2, 3);
        drone.setBox(box);
        assertThat(drone.deliver(window)).isEqualTo("S");
    }



}
