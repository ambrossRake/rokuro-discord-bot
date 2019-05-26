package rokuro;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

import static rokuro.Token.BOT_TOKEN;

public class App {

	public static void main(String[] args){
		try {
			JDA jda = new JDABuilder().setToken(BOT_TOKEN).setActivity(Activity.playing("with Rake")).build();
		} catch (LoginException e) {
			e.printStackTrace();
		}

	}
}