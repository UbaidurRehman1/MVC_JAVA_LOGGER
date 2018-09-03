package com.ubaid.app.controller;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ubaid.app.model.Model;
import com.ubaid.app.model.logger.Queue;
import com.ubaid.app.view.View;

public class Controller
{
	private final Queue queue;
	private View view;
	private Model model;
	private ExecutorService intiater_thread;
	
	public Controller(Queue queue, View view)
	{
		this.queue = queue;
		this.setViewController(view);
		runInitiater();
	}
	
	private void runInitiater()
	{
		intiater_thread = Executors.newFixedThreadPool(1);
		intiater_thread.execute(new Initiater(this));
		intiater_thread.shutdown();
	}


	public Queue getQueue() {
		return queue;
	}

	public View getViewController() {
		return view;
	}

	public void setViewController(View view) {
		this.view = view;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
}
