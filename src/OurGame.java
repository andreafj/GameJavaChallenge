import java.util.Scanner;

public class OurGame {

    public static void askByName(){
        System.out.println("Let's start with the adventure, Select a name from the list. Just enter the number");
        System.out.println("1.Princess               2. Citizen               3. Soldier");
    }

    public static String giveNameUser(int nameUser){
        String name = "";
        switch (nameUser){
            case 1:
                name="Princess";
                break;
            case 2:
                name="Citizen";
                break;
            case 3:
                name="Soldier";
                break;
            default:
                name="Unknown";
        }

        return name;
    }
    public static void showHistoryPartOne(String nameUser){
        System.out.println("In Villa Esperaza it is usually quiet days, but today the king called a meeting to defend it" +
                "\nsince there is a dragon on the way that destroyed several nearby towns" +
                "\nand everything indicates that your villa will be next.\n" +
                "\n" + "They need reinforcements to defend it and you will have to be part of the defense."+"\n"
                +"The king heard that there is a witch at the end of the dark forest, who has multiple magic items.\n"+
                "The ones we are interested in are the three magical dragon-slaying arrows.\n" +
                "\n" +
                "In a dream the king saw that you the "+nameUser +" were the salvation of the town, so the king ordered you to go for the arrows.");
    }

    public static void showHistoryPartTwo(String nameUser){
        System.out.println(nameUser+" toured the whole forest and met the witch\n" +
                "The witch says \"I will only give you an arrow delighted by every riddle you answer correctly. ”\n"+
                nameUser+" accept the conditions of the witch."+"\n");
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
            System.out.println(nameUser+"the correct answer was 1 brick :C, but you can still win two arrows.");
        }else if (numberUser>3 || numberUser <0){
            System.out.println("Sorry "+nameUser+", you chose a number that is not shown to you you lost the first enchanted arrow.");
        }
        System.out.println("Now the next question is....");
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
            System.out.println("You are the best "+nameUser+", you already have two arrows ^^");
        }else if(numberUser == 1 || numberUser == 2){
            System.out.println("Sorry "+nameUser+", but the answer you chose is wrong.The correct answer was 1 The windows.... You only have one more option");
        }else if (numberUser>3 || numberUser <0){
            System.out.println(nameUser+", Please enter 1-2 or 3, you just lost another enchanted arrow");
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
            System.out.println(nameUser+"For the last question the correct answer was A coffin");
            System.out.println("Sorry "+nameUser+", you chose the wrong answer");

        }else if (numberUser>3 || numberUser <0){
            System.out.println(nameUser+"By entering a number out of range you lost an enchanted arrow");
        }
        System.out.println(nameUser+" Finally answered all the questions.");
        return answer;
    }

    public static void  showResultsAboutArrows(int a1, int a2, int a3){
        int arrowsFinal = a1+a2+a3;
        System.out.println("After answering all the questions, you finally have "+arrowsFinal+" arrows delighted.");
        if(arrowsFinal==3){
            System.out.printf("You managed to defeat the dragon with your three enchanted arrows. Congratulations you are the hero of Villa Esperanza.");
        }else if(arrowsFinal == 2 || arrowsFinal == 1){
                System.out.printf("You only managed to get "+arrowsFinal+" magic arrows it's time to face the dragon,\n" +
                "\n" +
                "But it is not very likely that you will be able to defeat him\n" +
                "\n" +
                "You go to defend your village and you see the dragon\n" +
                "\n" +
                "You rush... you manage to get there you start shooting the arrows.");
                if((int)(Math.random()*10) < 5){
                    System.out.println("The dragon is wounded, but it destroyed your village and you with it.");
                }else {
                     System.out.println("The dragon falls outside the village\n" +
                    "You are a hero\n" +
                    "And the king will knight you.");
                }
        }else{
            System.out.println("Lost. the dragon burned Villa Esperanza :C");
        }
    }

    public static void main(String[] args) {
        int numberUser;
        try{
            askByName();
            Scanner userAnswer = new Scanner(System.in);
            numberUser = userAnswer.nextInt();
            String nameUser = giveNameUser(numberUser);
            showHistoryPartOne(nameUser);
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
            System.out.println("Sorry but this game, only permit number :C. Please try again");
        }
    }
}
