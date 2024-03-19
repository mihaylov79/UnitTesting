package rpg_lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AxeTest {

    @Test
    public void weaponAttackLosesDurability(){

        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(10,10);

        axe.attack(dummy);

        Assertions.assertEquals(9,axe.getDurabilityPoints());
    }


}
