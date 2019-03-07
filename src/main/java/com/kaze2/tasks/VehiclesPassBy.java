package com.kaze2.tasks;

public class VehiclesPassBy {
    public enum VehicleType{
        CAR(1),
        VAN(2),
        BIKE(3),
        BUS(4);

        VehicleType(int value){
            this.value = value;
        }

        private int value;

        public int getValue(){
            return value;
        }

        public static VehicleType searchByValue(int i){
            VehicleType[] typeValues = values();

            // Traverses in the reverse order to find the first occurrence of the highest value if there are two types with the same count
            for(int x = typeValues.length - 1; x >= 0; x--) {
                VehicleType type = typeValues[x];
                if (type.getValue() == i) {
                    return type;
                }
            }

            return null;
        }
    }

    /**
     * Kept for the sake of maintaining independence
     * @param args Console args
     */
    public static void main(String[] args) {
        int[] passedVehicles = {1, 3, 4, 2, 3, 2};
        System.out.println(getMostFrequentType(passedVehicles));
    }

    public static VehicleType getMostFrequentType(int[] vehiclesPassedBy){
        int vehicleTypesCount = VehicleType.values().length;
        int[] countsByType = new int[vehicleTypesCount];

        for(int v : vehiclesPassedBy){
            countsByType[v - 1] += 1;
        }

        int typeWithMaxCount = 0;
        for(int i = 0; i < countsByType.length; i++){
            if(countsByType[i] > countsByType[typeWithMaxCount])
                typeWithMaxCount = i;
        }

        return VehicleType.searchByValue(typeWithMaxCount + 1);
    }
}
