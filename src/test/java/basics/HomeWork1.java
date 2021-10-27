package basics;

import org.junit.jupiter.api.Test;

public class HomeWork1 {
    public float calculationPetrol (float petrolFor100km, float distance) {
        float petrolFor1km;
        petrolFor1km= petrolFor100km / 100;
        float result = petrolFor1km * distance;

        return result;
    }
    public  float predictdistance (float petrolFor100km, float petrolWeHave) {
        float petrolFor1km = petrolFor100km / 100;
        float result = petrolWeHave / petrolFor1km;

        return result;
@Test
        public void test() {
            float coast = calculationPetrol(petrolFor100km: 10, distance: 1000);
            float distanceForCarB = predictdistance(petrolFor100km: 20, coast);
            float distanceForCarC = predictdistance(petrolFor100km: 5, coast);
            float distanceForCarD = predictdistance(petrolFor100km: 8, coast);

            System.out.println("Petrol available:  " + coast + " l");
            System.out.println("CarB" + distanceForCarB + " km");
            System.out.println("CarC" + distanceForCarC + " km");
            System.out.println("CarD" + distanceForCarD + " km");

        }
    }


