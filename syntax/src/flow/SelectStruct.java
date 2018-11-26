package flow;

public class SelectStruct {

    public SelectStruct() {}

    public void selectStructMethod() {
        int score = 30;

        // if..else
        if (score >= 90) {
            System.out.printf("Great");
        } else if (score >= 80) {
            System.out.println("Good");
        } else if (score >= 70) {
            System.out.println("Nice");
        } else if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Oh, my god");
        }

        int newScore =  score / 10;

        // switch..case
        switch (newScore) {
            case 9:
                System.out.println("Great");
                break;
            case 8:
                System.out.println("Good");
                break;
            case 7:
                System.out.println("Nice");
                break;
            case 6:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Oh, my god");
        }
    }
}
