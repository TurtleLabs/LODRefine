package com.metaweb.gridlock.commands;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import com.metaweb.gridlock.model.Project;

public class GetColumnModelCommand extends Command {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Project project = getProject(request);
		Properties options = new Properties();
		
		try {
			respondJSON(response, project.columnModel.getJSON(options));
		} catch (JSONException e) {
			respondException(response, e);
		}
	}

}