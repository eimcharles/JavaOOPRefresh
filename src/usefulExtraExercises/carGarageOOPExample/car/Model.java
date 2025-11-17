package usefulExtraExercises.carGarageOOPExample.car;

public enum Model {

    CX5(Brand.MAZDA),
    THREE_SERIES(Brand.BMW),
    M3(Brand.BMW),
    TIGUAN(Brand.VOLKSWAGEN);

        private final Brand brand;

        Model(Brand brand) {
            this.brand = brand;
        }

        public Brand getBrand() {
            return brand;
        }

}
