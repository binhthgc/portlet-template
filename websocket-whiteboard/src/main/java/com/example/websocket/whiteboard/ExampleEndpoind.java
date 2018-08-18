package com.example.websocket.whiteboard;

import java.io.IOException;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Component(
		immediate = true,
		property = {
			"org.osgi.http.websocket.endpoint.path=/o/socket-example"
		},
		service = Endpoint.class
	)
public class ExampleEndpoind extends Endpoint {

	private static final Log LOG = LogFactoryUtil.getLog(ExampleEndpoind.class);
	
	/**
	 * @Override onOpen websocket connect
	 * 
	 * @param Session
	 * @param EndpointConfig
	 */
	@Override
	public void onOpen(Session session, EndpointConfig config) {
		
		// create messagehandeler to send message to client
		MessageHandler handler = new MessageHandler.Whole<String>() {

			@Override
			public void onMessage(String text) {
				onMessageHandler(text, session);
			}

		};
		
		session.addMessageHandler(handler);

	}
	
	private void onMessageHandler(String text, Session session) {
		try {
			// process data recive from client
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(text);
			
			broadcast(jsonObject.toJSONString(), session);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sends message to every opened session
	 * 
	 * @param message
	 * @param sessions
	 */
	private void broadcast(String message, Session session) {
		try {
			LOG.info("message: " + message);
			session.getBasicRemote().sendText(message);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}
}
