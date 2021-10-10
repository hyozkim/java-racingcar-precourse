package nextstep.common;

public class Constant {

    // Input Message
    public static final String INPUT_MESSAGE_MOVE_TURN = "몇 번의 이동할 것인지 입력하세요 : ";
    public static final String INPUT_MESSAGE_CAR_NAME = "자동차 이름을 입력하세요. (2개 이상) : ";

    public static void systemOutPrint(String message) {
        System.out.print(message);
    }

    public static void systemOutPrintf(String message, String value) {
        System.out.printf(message, value);
    }


    // Common Variable
    public static final int MIN_START_NUMBER = 0;
    public static final int MAX_START_NUMBER = 9;
    public static final int MIN_CONTINUE_VALUE = 4;

    // Error Message
    public static final String ERROR_MESSAGE_MIN_LENGTH_REQUIRED = "자동차는 2개 이상 입력되어야 합니다.";
    public static final String ERROR_MESSAGE_LESS_THAN_5_DIGIT = "자동차 이름을 5자 이상 입력할 수 없습니다.";
    public static final String ERROR_MESSAGE_NUMBER_ONLY = "숫자만 입력이 가능합니다.";

    // Output Message
    public static final String END_MESSAGE = "최종 우승자는 %s 입니다.\n";
}
