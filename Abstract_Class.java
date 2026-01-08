package oops1;


class Titanic {

    void speed() {
        System.out.println("Speed : 25 km/hr");
    }
}


abstract class HeadEngineer {

    void details() {
        System.out.println("Ship Name : Titanic");
        System.out.println("Category  : Passenger Ship");
    }

    abstract void checkFuel();
    abstract void setRoute();
    abstract void repairShip();
}


abstract class Mechanic extends HeadEngineer {

    @Override
    void repairShip() {
        System.out.println("Repair Status : All parts are working properly");
    }
}


class SiteEngineer extends Mechanic {

    @Override
    void checkFuel() {
        System.out.println("Fuel Status   : Fuel tank is full");
    }

    @Override
    void setRoute() {
        System.out.println("Route         : Mumbai → United States");
    }
}


public class Abstract_Class {

    public static void main(String[] args) {

        Titanic titanic = new Titanic();
        titanic.speed();

        System.out.println("----------------------------");

        HeadEngineer engineer = new SiteEngineer();
        engineer.details();
        engineer.checkFuel();
        engineer.setRoute();
        engineer.repairShip();
    }
}
