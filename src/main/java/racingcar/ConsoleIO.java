package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleIO {
    private static final String NAME_INPUT_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String COUNT_INPUT_MSG = "시도할 횟수는 몇 회인가요?";
    private static final String OUTPUT_MSG = "실행결과";

    public String getNameInput() {
        System.out.println(NAME_INPUT_MSG);
        return Console.readLine();
    }

    public String getCountInput() {
        System.out.println(COUNT_INPUT_MSG);
        return Console.readLine();
    }

    public void printResultMessage() {
        System.out.println(OUTPUT_MSG);
    }
}