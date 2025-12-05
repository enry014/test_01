public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }


}
