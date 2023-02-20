import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;


    @org.junit.Before
    public void setUp() throws Exception {
        //init
        for (int i = 0; i < 100; i++){
            carList.add(new Car("Brand" + i, i));
        }
    }

    @org.junit.Test
    public void whenAdded100ElementsThenSizeMustBe100(){
        assertEquals(100,carList.size());
    }
    @org.junit.Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased(){
        assertTrue(carList.removeAt(5));
        assertEquals(99,carList.size());
    }
    @org.junit.Test
    public void whenElementRemovedThenSizeMustBeDecreased(){
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101,carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100,carList.size());
    }
    @org.junit.Test
    public void wnenNonExistenelmentRemovedThenReturnFalse(){
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100,carList.size());
    }
    @org.junit.Test
    public void whenListClearThenSizeMustBe0(){
        carList.clear();
        assertEquals(0,carList.size());
    }
    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsThenThrownException(){
        carList.get(100);
    }
    @org.junit.Test
    public void methodGetReturnedRightValue(){
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }
}