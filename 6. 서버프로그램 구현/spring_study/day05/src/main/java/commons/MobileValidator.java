package commons;

public interface MobileValidator {
    default boolean checkMobile(String num) {

        return false;
    }
}