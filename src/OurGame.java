import java.util.Scanner;

public class OurGame {
    public static void showHistoryPartOne(){
        System.out.println("In Villa Esperaza it is usually quiet days, but today the king called a meeting to defend it" +
                "\nsince there is a dragon on the way that destroyed several nearby towns" +
                "\nand everything indicates that your villa will be next.\n" +
                "\n" + "They need reinforcements to defend it and you will have to be part of the defense."+"\n"
                +"The king heard that there is a witch at the end of the dark forest, who has multiple magic items.\n"+
                "The ones we are interested in are the three magical dragon-slaying arrows.\n" +
                "\n" +
                "In a dream the king saw that you were the salvation of the town, so the king ordered you to go for the arrows.");
    }

    public static void askByName(){
        System.out.println("Let's start with the adventure, Select a name from the list. Just enter the number");
        System.out.println("1. Rosa               2. Ariel               3. Brayan");
    }

    public static String giveNameUser(int nameUser){
        String name = "";

        if(nameUser == 1){
            name="Rosa";
        }
        if(nameUser == 2){
            name="Ariel";
        }
        if(nameUser == 3){
            name="Brayan";
        }
        return name;
    }

    public static void showHistoryPartTwo(String nameUser){
        System.out.println(nameUser+" toured the whole forest and met the witch\n" +
                "The witch says \"I will only give you an arrow delighted by every riddle you answer correctly. ”\n"+
                nameUser+" accept the conditions of the witch.");
    }

    public static void  showQuestionNumberOne(){
        System.out.println("How many bricks is needed to complete a building made of bricks?");
        System.out.println("1. 7 bricks");
        System.out.println("2. 1 brick ");
        System.out.println("3. Many bricks");
    }

    public static int askQuestionOne(int numberUser, String nameUser){
        int answer=0;
        if(numberUser == 2){
            answer=answer+1;
            System.out.println("Congratulations "+nameUser+", you got an enchanted arrow.");
        }else if(numberUser == 1 || numberUser == 3){
            System.out.println("Sorry "+nameUser+", you chose the wrong answer");
        }else if (numberUser>3 || numberUser <0){
            System.out.println("Sorry "+nameUser+", you chose a number that is not shown to you you lost the enchanted arrow.");
        }
        System.out.println("The next question is....");
        return answer;
    }

    public static void showQuestionNumberTwo(){
        System.out.println("What is it that is neither inside nor outside the house, but what is necessary for any home?");
        System.out.println("1. The roof");
        System.out.println("2. The door");
        System.out.println("3. The windows");
    }

    public static int askQuestionTwo(int numberUser, String nameUser){
        int answer=0;
        if(numberUser == 3){
            answer=answer+1;
            System.out.println("Congratulations "+nameUser+", you got an enchanted arrow. :D");
        }else if(numberUser == 1 || numberUser == 2){
            System.out.println("Sorry "+nameUser+", you chose the wrong answer. :C");
        }else if (numberUser>3 || numberUser <0){
            System.out.println("Sorry "+nameUser+", you chose a number that is not shown to you you lost the enchanted arrow.");
        }
        System.out.println("The next question is....");
        return answer;
    }

    public static void showQuestionNumberThree(){
        System.out.println("The man who sold it didn't want it. The man who bought it didn't need it. The man who used it didn't know him");
        System.out.println("1. A vase ");
        System.out.println("2. A coffin.");
        System.out.println("3. A table");
    }

    public static int askQuestionThree(int numberUser, String nameUser){
        int answer=0;
        if(numberUser == 2){
            answer=answer+1;
            System.out.println("Congratulations "+nameUser+", you got an enchanted arrow.");
        }else if(numberUser == 1 || numberUser == 3){
            System.out.println("Sorry "+nameUser+", you chose the wrong answer");
        }else if (numberUser>3 || numberUser <0){
            System.out.println("Sorry "+nameUser+", you chose a number that is not shown to you you lost the enchanted arrow.");
        }
        System.out.println(nameUser+" finally answered all the questions.");
        return answer;
    }

    public static void  showResultsAboutArrows(int a1, int a2, int a3){
        int arrowsFinal = a1+a2+a3;
        System.out.println("After answering all the questions, you finally have "+arrowsFinal+" arrows delighted.");
        if(arrowsFinal==3){
            System.out.printf("You managed to defeat the dragon with your three enchanted arrows. Congratulations you are the hero of Villa Esperanza.");
        }
        else{
            System.out.println("Lost. Villa Esperanza died :C");
        }

    }

    public static void main(String[] args) {
        int numberUser;
        try{
            showHistoryPartOne();
            askByName();
            Scanner userAnswer = new Scanner(System.in);
            numberUser = userAnswer.nextInt();
            String nameUser = giveNameUser(numberUser);
            showHistoryPartTwo(nameUser);
            showQuestionNumberOne();
            numberUser = userAnswer.nextInt();
            int answerQuestionOne = askQuestionOne(numberUser, nameUser);
            showQuestionNumberTwo();
            numberUser = userAnswer.nextInt();
            int answerQuestionTwo= askQuestionTwo(numberUser, nameUser);
            showQuestionNumberThree();
            numberUser = userAnswer.nextInt();
            int answerQuestionThree = askQuestionThree(numberUser, nameUser);
            showResultsAboutArrows(answerQuestionOne,answerQuestionTwo,answerQuestionThree);

        }catch (Exception e){
            System.out.println("Enter numbers only.");
        }
    }
}
