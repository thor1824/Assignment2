/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author thor1
 */
public class Assignment2Controller implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> excBox;
    @FXML
    private TextArea txtField;

    /**
     * Initializes the controller class.
     */
    private boolean exc1 = false;
    private boolean exc2 = false;
    private boolean exc3 = false;
    private boolean exc4 = false;
    private boolean exc5 = false;
    private boolean exc6 = false;
    private boolean exc7 = false;
    private boolean exc8 = false;
    private boolean exc9 = false;
    private boolean exc10 = false;
    private boolean exc11 = false;
    private boolean exc12 = false;
    private boolean exc13 = false;
    private boolean exc14 = false;
    private boolean exc15 = false;
    private boolean exc16 = false;
    private boolean exc17 = false;
            
            
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // {
        ObservableList<String> options =  FXCollections.observableArrayList(
        "Excercise 1(String input)",
        "Excercise 2(none)",
        "Excercise 3(none)",
        "Excercise 4(none)",
        "Excercise 5(int input)",
        "Excercise 6(input)",
        "Excercise 7(input)",
        "Excercise 8(input)",
        "Excercise 9(input)",
        "Excercise 10(input)",
        "Excercise 11(input)",
        "Excercise 12(input)",
        "Excercise 13(input)",
        "Excercise 14(input)",
        "Excercise 15(input)",
        "Excercise 16(input)",
        "Excercise 17(input)"
        );
        excBox.setItems(options);
    }    
        

    @FXML
    private void boxClick(ActionEvent event) 
    {
        int selectedIndex = excBox.getSelectionModel().getSelectedIndex();
    
        switch(selectedIndex)
        {
            case 0:
                reset();
                exc1 = true;
                break;
            case 1:
                reset();
                exc2 = true;
                break;
            case 2:
                reset();
                exc3 = true;
                break;
            case 3:
                reset();
                exc4 = true;
                break;
            case 4:
                reset();
                exc5 = true;
                break;
            case 5:
                reset();
                exc6 = true;
                break;
            case 6:
                reset();
                exc7 = true;
                break;
            case 7:
                reset();
                exc8 = true;
                break;
            case 8:
                reset();
                exc9 = true;
                break;
            case 9:
                reset();
                exc10 = true;
                break;
            case 10:
                reset();
                exc11 = true;
                break;
            case 11:
                reset();
                exc12 = true;
                break;
            case 12:
                reset();
                exc13 = true;
                break;
            case 13:
                reset();
                exc14 = true;
                break;
            case 14:
                reset();
                exc15 = true;
                break;
            case 15:
                reset();
                exc16 = true;
                break;
            case 16:
                reset();
                exc17 = true;
                break;
            default:
                
                throw new UnsupportedOperationException("Selected conversion not supported yet");
                
        }
    }

    Assignment2Model aModel = new Assignment2Model();
    @FXML
    private void initialize(ActionEvent event) 
    {
        if(exc1 == true)
        {
            String print = aModel.excerciseI(txtField.getText());
            txtField.setText(print);
        }
        if(exc2 == true)
        {
            txtField.setText(txtField.getText());
        }
        if(exc3 == true)
        {
            txtField.setText(aModel.excerciseIII());
        }
        if(exc4 == true)
        {
            txtField.setText(aModel.excerciseIV());
        }
        if(exc5 == true)
        {
            int a = Integer.parseInt(txtField.getText());
            txtField.setText(String.valueOf(aModel.excerciseV(a)));
        }
        if(exc6 == true)
        {
            txtField.setText(aModel.excerciseVI(txtField.getText()));
        }
        if(exc7 == true)
        {
            txtField.setText(aModel.excerciseVII(txtField.getText()));
        }
        if(exc8 == true)
        {
            txtField.setText(aModel.excerciseIIX(txtField.getText()));
        }
        if(exc9 == true)
        {
            txtField.setText(aModel.excerciseIX(txtField.getText()));
        }
        if(exc10 == true)
        {
            txtField.setText(aModel.excerciseX(txtField.getText()));
        }
        if(exc11 == true)
        {
            txtField.setText(aModel.excerciseXI(txtField.getText()));
        }
        if(exc12 == true)
        {
            txtField.setText(aModel.excerciseXII(txtField.getText()));
        }
        if(exc13 == true)
        {
            txtField.setText(aModel.excerciseXIIV(txtField.getText()));
        }
        if(exc14 == true)
        {
            txtField.setText(aModel.excerciseXIV(txtField.getText()));
        }
        if(exc15 == true)
        {
            txtField.setText(aModel.excerciseXV(txtField.getText()));
        }
        if(exc16 == true)
        {
            txtField.setText(aModel.excerciseXVI(txtField.getText()));
        }
        if(exc17 == true)
        {
            txtField.setText(aModel.excerciseXVII(txtField.getText()));
        }
    }
    
    private void reset()
    {
        exc1 = false;
        exc2 = false;
        exc3 = false;
        exc4 = false;
        exc5 = false;
        exc6 = false;
        exc7 = false;
        exc8 = false;
        exc9 = false;
        exc10 = false;
        exc11 = false;
        exc12 = false;
        exc13 = false;
        exc14 = false;
        exc15 = false;
        exc16 = false;
        exc17 = false;
    }
    
}
