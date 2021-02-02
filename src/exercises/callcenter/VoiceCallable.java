package exercises.callcenter;

public interface VoiceCallable {
    boolean CAN_CALL = true;
    void call(String contact);

    public static void decline() {
        System.out.println("Mike is declining the method");
    }
    public default void accept(){
        System.out.println("Mike is accepting the method");
    }

}
