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
}
