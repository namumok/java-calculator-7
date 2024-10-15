package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    String userInput;
    String customPattern = "^//(.+)\\n";  // 줄바꿈 문자
    String commonPattern = "[,:]+";  // 쉼표와 콜론을 기본 구분자로 설정

    public Calculator(String userInput) {
        this.userInput = userInput;
    }

    // 구분자를 추출하는 함수
    public String extractDelimiter() {
        Pattern compiledPattern = Pattern.compile(customPattern);
        Matcher matcher = compiledPattern.matcher(userInput);

        if (matcher.find()) {
            return Pattern.quote(matcher.group(1));  // 커스텀 구분자 반환
        }
        return commonPattern;  // 기본 구분자 반환
    }

    // 구분자를 사용하여 숫자를 추출하는 함수
    public void extractNumbers() {
    }
}
