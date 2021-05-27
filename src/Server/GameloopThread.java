package Server;

import javax.swing.JTextArea;

import java.util.ArrayList;

public class GameloopThread extends Thread {

    private JTextArea screen;

    @Override
    public void run() {

        super.run();
        Server.Game game = new Server.Game();
        String answer;
        int index = 0;
        game.start();
        Server.GameController.firstStart();
        while(game.hasMoreAnswer()) {
            answer = game.getAnswer();
            Server.GameController.answer = answer;
            System.out.println(answer);
            Server.GameController.gameflag = true;
            Server.GameController.answerflag = false;
            Server.GameController.ID = ServerController.List.get(index).getUserID();
            Server.GameController.allUserMsg("CHAT:[알림] " + Server.GameController.ID +"user turn.");
            screen.append("[알림�] " + Server.GameController.ID +"user turn.\n");
            ServerController.List.get(index).sendMessage("SET:TRUE");
            ServerController.List.get(index).sendMessage("CHAT:[알림] " + "당신차례입니다.");
            ServerController.List.get(index).sendMessage("CHAT:[알림] " + "정답은  " +  answer +" 입니다.");
            ServerController.List.get(index).sendMessage("CHAT:[알림] " + "정답을 잘 설명해보세요!!!");
            ServerController.List.get(index).sendMessage("ANSWER:"+answer);
            while(true) {
                if(Server.GameController.answerflag == true) break;
                else {
                    try {
                        Thread.sleep(3000);
                    } catch(InterruptedException e) {

                    }
                }
            }
            ServerController.List.get(index).sendMessage("ANSWER:"+" ");
            Server.GameController.allUserPermissionFalse();
            ++index;
            if(index == ServerController.List.size()) {
                break;
            }
        }
    }

    public void setScreen(JTextArea screen) {
        this.screen = screen;
    }
}