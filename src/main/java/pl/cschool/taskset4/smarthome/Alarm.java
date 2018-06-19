package pl.cschool.taskset4.smarthome;

public class Alarm {

    private static Status status = Status.NIEUZBROJONY;
    private static AlarmStatus syrena = AlarmStatus.WYLACZONA;

    public static void uzbroj(){
        status = Status.UZBROJONY;
    }

    public static void turnOffAlarm(Building building) {

        boolean isAnyOpen = false;
        for (Floor f : building.getFloorList()) {
            for (AbstractRoom r : f.getRoomSet()) {
                if (r.getdStatus()==CloseOpenStatus.OTWARTE || r.getwStatus()==CloseOpenStatus.OTWARTE) {
                    isAnyOpen = true;
                    break;
                }
            }
        }
        if (!isAnyOpen) {
            syrena = AlarmStatus.WYLACZONA;
        }
    }

    public Status getStatus() {
        return status;
    }

    public static AlarmStatus getSyrena() {
        return syrena;
    }

    public static void checkBuilding(Building building) {

        if (status==Status.UZBROJONY) {
            for (Floor f : building.getFloorList()) {
                for (AbstractRoom r : f.getRoomSet()) {
                    if (r.getwStatus()==CloseOpenStatus.OTWARTE) {
                        System.out.println("Lyju lyju lyju...");
                        System.out.println("Otwarte okno w pomieszczeniu " + r.getName() + " na kondygnacji " + f.getName());
                        syrena=AlarmStatus.WLACZONA_WYJE;
                    }
                    if (r.getdStatus()==CloseOpenStatus.OTWARTE) {
                        System.out.println("Lyju lyju lyju...");
                        System.out.println("Otwarte drzwi w pomieszczeniu " + r.getName() + " na kondygnacji " + f.getName());
                        syrena=AlarmStatus.WLACZONA_WYJE;
                    }
                }
            }
        }
    }

}
