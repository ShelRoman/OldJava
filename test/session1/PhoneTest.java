//написать тест для класса телефон, объект должен быть равен самому себе.
//если 1 = 2 то 2 = 1
//если 1 = 2, 2 = 3 то и 3 = 1
//если 1 = 2, то они должны быть равны при любом количестве сравнений
//объект никогда не равен null


package session1;

import org.junit.Before;
import org.junit.Test;
import proff27.session2.Phone;
import static org.junit.Assert.assertEquals;


public class PhoneTest {

    private Phone module = new Phone("nokia", 222.5, true);

    @Before
    public void setUp() {
        module = new Phone();
    }

    @Test
    public void testSelfComparing() {
        Phone phone1 = module;
        boolean actualRes = phone1.equals(phone1);
        boolean expectedRes = true;
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testTwoObjComparing() {
        Phone phone1 = module;
        Phone phone2 = module;
        boolean actualRes = phone1.equals(phone2) && phone2.equals(phone1);
        boolean expectedRes = true;
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testThreeObjComparing() {
        Phone phone1 = module;
        Phone phone2 = module;
        Phone phone3 = module;
        boolean actualRes = phone1.equals(phone2) && phone2.equals(phone3) && phone3.equals(phone1);
        boolean expectedRes = true;
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testSeveralTimesComparing() {
        Phone phone1 = module;
        Phone phone2 = module;
        boolean actualRes = true;
        boolean expectedRes = true;
        for (int i = 0; i < (int) (Math.random() * 50); i++ ) {
            if(!phone1.equals(phone2)) {
                actualRes = false;
            }
        }
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testNullComparing() {
        boolean actualRes = true;
        boolean expectedRes = true;
        for (int i = 0; i < (int) (Math.random() * 50); i++ ) {
            Phone phone1 = module;
            if(phone1.equals(null)) {
                actualRes = false;
            }
        }
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testHashCode() {
        Phone phone1 = new Phone("Nokia", 555.22, true);
        Phone phone2 = new Phone("Nokia", 555.22, true);
        boolean actualRes = false;
        boolean expectedRes = true;
        if (phone1.equals(phone2)) {
            actualRes = phone1.hashCode() == phone2.hashCode();
        }
        assertEquals(expectedRes, actualRes);
    }


}
