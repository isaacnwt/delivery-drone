import org.example.Box;
import org.example.Drone;
import org.example.Window;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DroneTest {
    @Test
    @DisplayName("Should not deliver a box with measures larger then the window")
    void shouldNotDeliverABoxWithMeasuresLargerThenTheWindow() {
        Drone drone = new Drone();
        Box box = new Box(4, 5, 6);
        Window window = new Window(2, 3);
        drone.getBox(box);
        assertThat(drone.deliver(window)).isEqualTo("N");

    }
}
