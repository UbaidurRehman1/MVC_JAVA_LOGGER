package com.ubaid.app.controller;



import com.ubaid.app.model.Model;
import com.ubaid.app.model.logger.LogViewer;
import javafx.application.Platform;

public class Initiater implements Runnable
{

	Controller controller;
	
	public Initiater(Controller controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void run()
	{
		setModel();
		embedLogger();
	}
	
	private void setModel()
	{
		controller.setModel(new Model(controller));
	}
	
	
	
	private void embedLogger()
	{
		Platform.runLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				try
				{
					LogViewer logViewer = new LogViewer(controller);
					controller.getViewController().getBorderPane().setCenter(logViewer);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});

	}
	

}
