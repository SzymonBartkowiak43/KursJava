package Zajecia3.New;

import java.util.Optional;

public class Driver {
    private Optional<SpaceShip>  spaceShip;

    public Optional<SpaceShip> getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = Optional.ofNullable(spaceShip);
    }
}

