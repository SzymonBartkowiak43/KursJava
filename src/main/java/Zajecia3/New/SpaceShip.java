package Zajecia3.New;

import java.util.Optional;

public class SpaceShip {
    private Optional<License> license;

    public Optional<License> getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = Optional.ofNullable(license);
    }
}
