package Zajecia3.New;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        SpaceShip spaceShip = new SpaceShip();
        License license = new License();

        license.setType("Prawko");
        spaceShip.setLicense(license);
        driver.setSpaceShip(spaceShip);

        System.out.println(getSpaceShipLicenseType(Optional.of(driver)));

    }
    public static String getSpaceShipLicenseType(Optional<Driver> driver) {
        return driver
                .flatMap(Driver::getSpaceShip)
                .flatMap(SpaceShip::getLicense)
                .map(License::getType)
                .orElse("Unknow");
    }
}
