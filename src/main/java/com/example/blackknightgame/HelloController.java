package com.example.blackknightgame;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HelloController {

        @FXML
        private Button strikeButton;

        @FXML
        private Text blackKnightText1;

        @FXML
        private Text blackKnightText2;

        @FXML
        private Text blackKnightText3;

        @FXML
        private TextField insertName;

        @FXML
        private Button startButton;

        @FXML
        private Text setText;

        private int temp = 0;



        //public static BlackKnight[] allKnights = new BlackKnight[10];

        @FXML
        void onStartButtonClick(ActionEvent event) {
                if(insertName.getText().isEmpty()){
                        Alert alertInsertName = new Alert(Alert.AlertType.ERROR);
                        alertInsertName.setContentText("Please insert BlackKnight's Name;\n");
                        alertInsertName.show();
                } else {
                        BlackKnight knight = new BlackKnight(insertName.getText());
                        temp = BlackKnight.numOfDeadKnights + BlackKnight.numOfAliveKnights;
                        BlackKnight.allKnights[temp] = knight;
                        BlackKnight.numOfAliveKnights++;
//                        Alert alertSuccess = new Alert(Alert.AlertType.CONFIRMATION);
//                        alertSuccess.setContentText("BlackKnight " + knight.getName() + " was created!\n");
//                        alertSuccess.show();

                        blackKnightText1.setText("BlackKnight <<" + knight.getName() + ">> was created!");
                        blackKnightText2.setText("Number of knights alive: " + BlackKnight.numOfAliveKnights + "\n" +
                                "Number of knights dead: " + BlackKnight.numOfDeadKnights + "\n\n");
                        blackKnightText3.setText(BlackKnight.allKnights[temp].toString());

                        strikeButton.setText("strike <<" + knight.getName() + ">>");


                }


        }

        @FXML
        void onStrikeButtonClick(ActionEvent event) {

                //System.out.println(BlackKnight.allKnights[0].toString());
                blackKnightText1.setText("BlackKnight <<" + BlackKnight.allKnights[temp].getName() + ">> was hit!");
                blackKnightText2.setText(BlackKnight.allKnights[temp].strike());
                blackKnightText3.setText("Number of arms: " + BlackKnight.allKnights[temp].getArms() + "\n" +
                        "Number of legs: " + BlackKnight.allKnights[temp].getLegs() + "\n" +
                        "Number of Head: " + BlackKnight.allKnights[temp].getHead() + "\n\n" +
                        "Number of knights alive: " + BlackKnight.numOfAliveKnights + "\n" +
                        "Number of knights dead: " + BlackKnight.numOfDeadKnights + "\n" +
                        BlackKnight.allKnights[temp].toString());


        }



}
