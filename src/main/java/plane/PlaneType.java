package plane;

public enum PlaneType {
        BOEING_747(20,400000),
        AIRBUS_A220(15,300000),
        COMAC_ARJ21(10,200000);

        private final int capacity;
        private final int totalWeight;

        PlaneType(int capacity,int totalWeight) {
            this.capacity= capacity;
            this.totalWeight =totalWeight;
        }

        public int getCapacity() {
            return capacity;
        }

        public int getTotalWeight() {
            return totalWeight;
        }
    }


