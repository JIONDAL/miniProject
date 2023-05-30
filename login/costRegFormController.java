package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class costRegFormController implements Initializable{
	@FXML
	private ComboBox<String> complexCmb;
	@FXML
	private ComboBox<String> unitCmb;
	private ObservableList<String> unit101 = FXCollections.observableArrayList("101호", "102호", "201호", "202호", "301호", "302호", "401호", "402호", "501호", "502호");
	private ObservableList<String> unit102 = FXCollections.observableArrayList("101호", "102호", "103호", "201호", "202호", "203호", "301호", "302호", "303호", "401호", "402호", "403호", "501호", "502호", "503호", "601호", "602호", "603호", "701호", "702호", "703호");
	private ObservableList<String> unit103 = FXCollections.observableArrayList("101호", "102호", "103호", "104호", "301호", "302호");
	@FXML
	private TextField commonCostFld;
	@FXML
	private TextField cleanCostFld;
	@FXML
	private TextField secCostFld;
	@FXML
	private TextField elvCostFld;
	@FXML
	private TextField heatCostFld;
	@FXML
	private TextField powerCostFld;
	@FXML
	private TextField waterCostFld;
	@FXML
	private TextField operCostFld;
	@FXML
	private TextField totalCostFld;
	@FXML
	private Button costRegBtn;
	
	private int commonCost;
	private int cleanCost;
	private int secCost;
	private int elvCost;
	private int heatCost;
	private int powerCost;
	private int waterCost;
	private int operCost;
	
	private int totalCost;
	
	private CostRegFormService service;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		commonCostFld.setText("0");
		cleanCostFld.setText("0");
		secCostFld.setText("0");
		elvCostFld.setText("0");
		heatCostFld.setText("0");
		powerCostFld.setText("0");
		waterCostFld.setText("0");
		operCostFld.setText("0");
		totalCostFld.setText("0");
		
		costRegBtn.setDisable(true);
	}
	
	public void selectUnitProc() {
		String complex = complexCmb.getValue();
		switch(complex) {
		case "101동" :
			unitCmb.setItems(unit101);
			break;
		case "102동" :
			unitCmb.setItems(unit102);
			break;
		case "103동" :
			unitCmb.setItems(unit103);
			break;
		case "104동" :
			unitCmb.setItems(unit103);
			break;
		}
	}
	
	public void totalCostProc() {
		commonCost=Integer.parseInt(commonCostFld.getText());
		cleanCost=Integer.parseInt(cleanCostFld.getText());
		secCost=Integer.parseInt(secCostFld.getText());
		elvCost=Integer.parseInt(elvCostFld.getText());
		heatCost=Integer.parseInt(heatCostFld.getText());
		powerCost=Integer.parseInt(powerCostFld.getText());
		waterCost=Integer.parseInt(waterCostFld.getText());
		operCost=Integer.parseInt(operCostFld.getText());
		totalCost = commonCost + cleanCost + secCost + elvCost + heatCost + powerCost + waterCost + operCost;
		
		totalCostFld.setText(Integer.toString(totalCost));
		
		costRegBtn.setDisable(false);
	}
	
	public void costRegProc() {
		totalCost = Integer.parseInt(totalCostFld.getText());
	}
	
	public void cancelProc() {

		commonCostFld.setText("0");
		cleanCostFld.setText("0");
		secCostFld.setText("0");
		elvCostFld.setText("0");
		heatCostFld.setText("0");
		powerCostFld.setText("0");
		waterCostFld.setText("0");
		operCostFld.setText("0");
		totalCostFld.setText("0");
		
		costRegBtn.setDisable(true);
	}
}
