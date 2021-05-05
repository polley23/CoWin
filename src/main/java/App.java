import com.amazonaws.services.lambda.runtime.Context;

public final class App {
    public static String handleRequest(String arg, Context context) {
        CoWin coWin = new CoWin();
        coWin.findVaccineCenterByPincodeForNext90Days();
        return arg;
    }
}