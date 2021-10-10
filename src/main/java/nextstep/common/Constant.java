package nextstep.common;

public class Constant {

    // Input Message
    public static final String INPUT_MESSAGE_MOVE_TURN = "몇 번 이동할건지 입력하세요 : ";
    public static final String INPUT_MESSAGE_CAR_NAME = "자동차 이름을 입력하세요. (2개 이상) : ";

    public static void systemOutPrint(String message) {
        System.out.print(message);
    }

    public static void systemOutPrintln(String message) {
        System.out.print(message);
    }


    // Error Message
    public static final String ERROR_MESSAGE_MIN_LENGTH_REQUIRED = "[ERROR] 자동차는 2개 이상 입력되어야 합니다.";
    public static final String ERROR_MESSAGE_LESS_THAN_5_DIGIT = "[ERROR] 5자 이상 입력을 할 수 없습니다.";
    public static final String ERROR_MESSAGE_NUMBER_ONLY = "[ERROR] 숫자만 입력이 가능합니다.";

    // Output Message

}
