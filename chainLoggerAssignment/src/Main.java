public class Main {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger replaceLogger = new ReplaceSevereLogger(AbstractLogger.CAR_REPAIR_SEVERE);
        AbstractLogger repairHighLogger = new RepairWarningLogger(AbstractLogger.CAR_REPAIR_WARNING);
        AbstractLogger repairLowLogger = new RepairFineLogger(AbstractLogger.CAR_REPAIR_FINE);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.REPAIR_INFO);
        infoLogger.setNextLogger(repairLowLogger);
        repairLowLogger.setNextLogger(repairHighLogger);
        repairHighLogger.setNextLogger(replaceLogger);
        return infoLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.REPAIR_INFO,"A customer wants to repair car BMW");
        loggerChain.logMessage(AbstractLogger.CAR_REPAIR_WARNING,"Car needs to be repaired");
        loggerChain.logMessage(AbstractLogger.CAR_REPAIR_FINE,"Car is working fine");
        loggerChain.logMessage(AbstractLogger.CAR_REPAIR_SEVERE,"A customer wants to repair car but needs to be replaced");
    }
}
