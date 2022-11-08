package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private boolean finish = false;

    private int strike = 0;
    private int ball = 0;

    private List<Integer> answer = new ArrayList<>();

    public void startGame() {
        answer = Computer.createAnswer();

        while (!finish) {
            initResult();
        }
    }

    private void initResult() {
        strike = 0;
        ball = 0;
    }

    private void playGame() {
        List<Integer> input = getInput();
    }

    private List<Integer> getInput() {
        List<Integer> input = new ArrayList<>();
        String inputString = Console.readLine();

        for (char c : inputString.toCharArray()) {
            input.add(Character.getNumericValue(c));
        }

        if (!Validator.validateInput(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }
}
