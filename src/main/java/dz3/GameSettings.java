package dz3;

public class GameSettings {


    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Шашки");
        GameSettings game2 = new GameSettings("Шахматы");

        setMaxPlayers(4);

        game1.addPlayer();
        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();




    }

    static int maxPlayers;

    private final String gameName;
    private int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
    }

    public static void setMaxPlayers(int maxPlayers2) {
        maxPlayers = maxPlayers2;

    }

    public String getGameName() {
        return gameName;
    }

    public int getCurrentPlayers() {
        return currentPlayers;
    }

    //нет смысла по логике самой переменной
   /* public void setCurrentPlayers(int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }*/

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Достигнуто максимальное количество игроков");
        }
    }

    public void printGameStatus() {
        System.out.println("Название игры - " + gameName + " игроков в игре - " + currentPlayers + " максимум игроков - " + maxPlayers);
    }



}


