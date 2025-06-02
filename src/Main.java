//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String mood = "angry";

        if(mood == "happy") {
            System.out.println("나는 행복합니다.");
        } else if(mood == "angry") {
            System.out.println("나는 화났습니다.");
        } else if(mood == "sad") {
            System.out.println("나는 슬픕니다.");
        } else {
            System.out.println("지금 내 기분을 표현할 수 없습니다.");
        }
    }
}