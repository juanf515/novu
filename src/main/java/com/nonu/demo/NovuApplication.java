package com.nonu.demo;

import co.novu.api.events.requests.TriggerEventRequest;
import co.novu.common.base.Novu;
import co.novu.common.rest.NovuNetworkException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NovuApplication {


	public static void main(String[] args) throws IOException, NovuNetworkException {
		String apiKey = "ebe5bdb33561a5c925d87f4128bad525";
		// Using the API Key only
		Novu novu = new Novu(apiKey);

		TriggerEventRequest event = new TriggerEventRequest();
		// Sample usage
		novu.triggerEvent(event);
	}

}
