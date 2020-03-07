import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class PigLatinGenerator extends ListenerAdapter {

    public void onGuildMessageReceived (GuildMessageReceivedEvent event){
        if(!event.getAuthor().isBot()) {
            String[] messageSent = event.getMessage().getContentRaw().split(" ");
            String messagePrint = translate(messageSent);
            event.getChannel().sendMessage(messagePrint).queue();
        }
    }

    public String translate(String[] stringArray) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for(String s : stringArray){
            str += s + " ";
        }
        str.trim();

        if (VowelUtils.startsWithVowel(str)) {
            return str + "way";
        }
        if (!VowelUtils.hasVowels(str)) {
            return str + "ay";
        }
        if (stringArray.length > 1) {
            for (String s : stringArray) {
                if (VowelUtils.startsWithVowel(s)) {
                    sb.append(s + "way ");
                } else {
                    sb.append(s.substring(VowelUtils.getIndexOfFirstVowel(s)) + s.substring(0, VowelUtils.getIndexOfFirstVowel(s)) + "ay ");
                }
            }
            String pigLatinSentence = sb.toString();
            return pigLatinSentence.trim();
        }
        return str.substring(VowelUtils.getIndexOfFirstVowel(str)) + str.substring(0, VowelUtils.getIndexOfFirstVowel(str)) + "ay";
    }
}
