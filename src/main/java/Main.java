import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.TextMessageTargetMode;
import com.github.theholywaffle.teamspeak3.api.event.TS3EventAdapter;
import com.github.theholywaffle.teamspeak3.api.event.TS3EventType;
import com.github.theholywaffle.teamspeak3.api.event.TextMessageEvent;

import java.util.logging.Level;

public class Main {
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("============== hello ====================");
		System.out.println("=========================================");

		final TS3Config config = new TS3Config();
		config.setHost("IP tähän");
		config.setQueryPort();//portti
		config.setDebugLevel(Level.ALL);
		config.setLoginCredentials("user", "password");

		final TS3Query query = new TS3Query(config);
		query.connect();

		final TS3Api api = query.getApi();
		api.selectVirtualServerById(1);
		api.setNickname("Botten-Anna");
		api.sendChannelMessage("Imma firin mah lazer!");
	}
}