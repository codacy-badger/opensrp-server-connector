package org.opensrp.connector.rapidpro;

import java.util.Map;

import org.opensrp.domain.Camp;
import org.smartregister.domain.Client;

public interface Message {
	
	public String message(Client client, Camp camp, Map<String, String> data);
}
