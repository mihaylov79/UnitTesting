package rpg_lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class DummyTest {

    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_XP = 10;
    private static final int AXE_ATTACK= 12;
    private static final int AXE_DURABILITY= 5;

    private Axe axe;
    private Dummy dummy;

    @BeforeEach
    public void initializingObjects(){
        this.axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH,DUMMY_XP);
    }


    @Test
    public void takeAttackTest(){

       // Dummy dummy = new Dummy(10,10);
        //Axe axe = new Axe(5, 10);

        dummy.takeAttack(5);

        Assertions.assertEquals(5,dummy.getHealth());
    }
    @Test
    public void DeadExceptionTesting(){

        //Dummy dummy = new Dummy(10,10)

        dummy.takeAttack(15);
        assertTrue(dummy.isDead());
    }
    @Test
    public void DeadTestException(){
        Assertions.assertThrows(IllegalStateException.class,() -> {
            Dummy dummy = new Dummy(0,10);
            dummy.takeAttack(15);

            //dummy.isDead();
//            Class<Dummy> dummyClass = Dummy.class;
//            Method[] declaredMethods = dummyClass.getDeclaredMethods();
//            Method method = declaredMethods[2];
//            method.setAccessible(true);
//            Class<?> returnType = method.getReturnType();

           // assertTrue(dummy.isDead());
        });
    }







}
