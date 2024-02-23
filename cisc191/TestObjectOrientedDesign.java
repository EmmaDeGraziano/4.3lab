package edu.sdccd.cisc191;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestObjectOrientedDesign
{

    @Test
    void testVehicle()
    {
        Vehicle vehicle = new Vehicle("GMC", 80000, 7995, 4, null);

        Assertions.assertEquals("GMC", vehicle.getManufacturerName());
        Assertions.assertEquals(80000, vehicle.getMilesOnVehicle());
        Assertions.assertEquals(7995, vehicle.getPrice());
        Assertions.assertEquals(4, vehicle.getNumberOfSeats());
    }

    @Test
    void testOption()
    {
        Option moonroof = new Option("Moonroof");
        Assertions.assertEquals("Moonroof", moonroof.getDetails());
        Option leather = new Option("Leather");
        Assertions.assertEquals("Leather", leather.getDetails());
        Option[] options = { moonroof, leather };
        Vehicle vehicle = new Vehicle("BMW", 90000, 10995, 4, options);

        Assertions.assertEquals("Moonroof", vehicle.getOptions()[0].getDetails());
        Assertions.assertEquals("Leather", vehicle.getOptions()[1].getDetails());
    }

    @Test
    void testCar()
    {
        Car car = new Car("BMW", 190000, 5995, 4, null, 2);

        Assertions.assertEquals("BMW", car.getManufacturerName());
        Assertions.assertEquals(190000, car.getMilesOnVehicle());
        Assertions.assertEquals(5995, car.getPrice());
        Assertions.assertEquals(4, car.getNumberOfSeats());
        Assertions.assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testPickupTruck()
    {
        PickupTruck truck = new PickupTruck("Dodge", 9000, 65995, 3, null, 1400);

        Assertions.assertEquals("Dodge", truck.getManufacturerName());
        Assertions.assertEquals(9000, truck.getMilesOnVehicle());
        Assertions.assertEquals(65995, truck.getPrice());
        Assertions.assertEquals(3, truck.getNumberOfSeats());
        Assertions.assertEquals(1400, truck.getCargoCapacity());
    }

    @Test
    void testSportsUtilityVehicle()
    {
        SportsUtilityVehicle suv = new SportsUtilityVehicle("Toyota", 19000, 75995, 6, null, 4500);

        assertEquals("Toyota", suv.getManufacturerName());
        assertEquals(19000, suv.getMilesOnVehicle());
        assertEquals(75995, suv.getPrice());
        assertEquals(6, suv.getNumberOfSeats());
        assertEquals(4500, suv.getMaxTowingWeight());
    }

    @Test
    void testGasCar()
    {
        GasCar car = new GasCar("BMW", 5500, 75995, 4, null, 2);

        Assertions.assertEquals("BMW", car.getManufacturerName());
        Assertions.assertEquals(5500, car.getMilesOnVehicle());
        Assertions.assertEquals(75995, car.getPrice());
        Assertions.assertEquals(4, car.getNumberOfSeats());
        Assertions.assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testCarIsCombustible()
    {
        Combustible combustible = new GasCar("VW", 15500, 45995, 4, null, 2);
        combustible.tankUp();
        Assertions.assertEquals(100, combustible.getFuelLevel());
        GasCar car = new GasCar("VW", 5500, 75995, 4, null, 2);
        car.tankUp();
        Assertions.assertEquals(100, car.getFuelLevel());
    }

    @Test
    void testElectricCar()
    {
        ElectricCar car = new ElectricCar("Nissan", 10000, 35995, 4, null, 2);

        Assertions.assertEquals("Nissan", car.getManufacturerName());
        Assertions.assertEquals(10000, car.getMilesOnVehicle());
        Assertions.assertEquals(35995, car.getPrice());
        Assertions.assertEquals(4, car.getNumberOfSeats());
        Assertions.assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testCarIsChargeable()
    {
        Chargeable chargeable = new ElectricCar("Nissan", 10000, 35995, 4, null, 2);
        chargeable.chargeUp();
        Assertions.assertEquals(100, chargeable.getBatteryCharge());
        ElectricCar car = new ElectricCar("VW", 5500, 75995, 4, null, 2);
        car.chargeUp();
        Assertions.assertEquals(100, car.getBatteryCharge());
    }

    @Test
    void testHybridCar()
    {
        HybridCar car = new HybridCar("Toyota", 1000, 63995, 4, null, 2);

        Assertions.assertEquals("Toyota", car.getManufacturerName());
        Assertions.assertEquals(1000, car.getMilesOnVehicle());
        Assertions.assertEquals(63995, car.getPrice());
        Assertions.assertEquals(4, car.getNumberOfSeats());
        Assertions.assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testHybridCarIsCombustibleAndChargeable()
    {
        HybridCar car = new HybridCar("Toyota", 1000, 63995, 4, null, 2);
        car.tankUp();
        Assertions.assertEquals(100, car.getFuelLevel());
        car.chargeUp();
        Assertions.assertEquals(100, car.getBatteryCharge());

        Combustible combustible = car;
        Assertions.assertEquals(100, combustible.getFuelLevel());
        Chargeable chargeable = car;
        Assertions.assertEquals(100, chargeable.getBatteryCharge());
    }

}