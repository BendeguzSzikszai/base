package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.beans.Transient;

public class TrainSensorTest {

    public Table<Date, Integer, Integer> testTable = HashBasedTable.create();

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }

    @Test
    public void TableTest(){
        testTable.addRecord(System.date, 2, 1);
        boolean recrodIsPresent = testTable.contains(System.date, 2, 1);
        Assert.assertEquals(true, recrodIsPresent);
    }
}
