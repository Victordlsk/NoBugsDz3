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

    final String gameName;

    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
    }

    public static void setMaxPlayers(int maxPlayers2) {
        maxPlayers = maxPlayers2;

    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else System.out.println("Достигнуто максимальное количество игроков");
    }

    public void printGameStatus() {
        System.out.println("Название игры - " + gameName + " игроков в игре - " + currentPlayers + " максимум игроков - " + maxPlayers);
    }



}


