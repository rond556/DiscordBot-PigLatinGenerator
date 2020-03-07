import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main(String args[]) throws Exception{
        JDA jda = new JDABuilder("").build();

        jda.addEventListener(new PigLatinGenerator());
    }
}