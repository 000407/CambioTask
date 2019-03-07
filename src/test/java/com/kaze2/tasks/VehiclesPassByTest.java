package com.kaze2.tasks;

import static org.junit.Assert.assertEquals;
import static com.kaze2.tasks.VehiclesPassBy.getMostFrequentType;

import org.junit.Test;

public class VehiclesPassByTest
{
    @Test
    public void testMostFrequentType()
    {
        int[] passedVehicles = {1, 3, 4, 2, 3, 2};
        final VehiclesPassBy.VehicleType EXPECTED_TYPE = VehiclesPassBy.VehicleType.VAN;

        VehiclesPassBy.VehicleType returnType = getMostFrequentType(passedVehicles);

        assertEquals("Expected type mismatch!", EXPECTED_TYPE, returnType);
    }

    @Test
    public void testSearchByType(){
        final VehiclesPassBy.VehicleType AVAILABLE_TYPE = VehiclesPassBy.VehicleType.VAN;
        final VehiclesPassBy.VehicleType UNAVAILABLE_TYPE = null;
        final int UNAVAILABLE_TYPE_VALUE = 5;

        assertEquals("Expected value mismatch!", AVAILABLE_TYPE, VehiclesPassBy.VehicleType.searchByValue(AVAILABLE_TYPE.getValue()));
        assertEquals("Expected value mismatch!", UNAVAILABLE_TYPE, VehiclesPassBy.VehicleType.searchByValue(UNAVAILABLE_TYPE_VALUE));
    }
}
