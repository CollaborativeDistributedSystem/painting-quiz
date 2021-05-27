package Server;

import Server.*;

import java.util.ArrayList;

public class Game {


    private ArrayList<String> answerList;
    private String answer;
    private ArrayList<String> AnsList;
    public void start() {
        saveAnswer();
    }



    private void saveAnswer() {
        answerList = Server.ServerController.AnsList;
    }

    public void print() {
        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i));
        }
    }

    public boolean hasMoreAnswer() {
        if (answerList.size() != 0) {
            int index = (int) (Math.random() * answerList.size());
            answer = answerList.get(index);
            answerList.remove(index);
            return true;
        }
        else return false;
    }

    public String getAnswer() {
        return this.answer;
    }
}