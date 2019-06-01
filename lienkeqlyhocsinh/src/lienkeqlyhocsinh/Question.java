/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienkeqlyhocsinh;

/**
 *
 * @author Administrator
 */
public class Question {
    private String id;
    private String content;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correct;

    public Question() {
    }

    public Question(String id, String content, String answerA, String answerB, String answerC, String answerD, String correct) {
        this.id = id;
        this.content = content;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correct = correct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.content);
        builder.append("\n");
        builder.append("A." +this.answerA);
        builder.append("B." +this.answerB);
        builder.append("C." +this.answerC);
        builder.append("D." +this.answerD);
        return builder.toString();
    }
    
}

