import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int serial = 1;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public void log(String msg) {
        if (msg.toLowerCase().contains("error")) {
            System.out.printf("ERROR#%s [%s] <%s>\n", getSerial(), LocalDateTime.now(), msg);
            setSerial(getSerial() + 1);
        } else {
            System.out.printf("INFO#%s [%s] <%s>\n", getSerial(), LocalDateTime.now(), msg);
            setSerial(getSerial() + 1);
        }
    }
}
