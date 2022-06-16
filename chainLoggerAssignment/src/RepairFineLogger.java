import java.util.logging.Logger;
public class RepairFineLogger extends AbstractLogger{
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public RepairFineLogger(int level){
        this.level = level;
    }
    protected void write(String message) {
        logger.fine("Car is working fine!");
    }
}
