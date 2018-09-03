package com.ubaid.app.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;


public class View implements Initializable
{

	@FXML BorderPane borderPane;
	@FXML ProgressBar progressBar;
	@FXML Label label;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	}

	
	public BorderPane getBorderPane()
	{
		return borderPane;
	}
	
	public ProgressBar getProgressBar()
	{
		return progressBar;
	}
	
	public Label getLabel()
	{
		return label;
	}

}
