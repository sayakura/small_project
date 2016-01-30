import java.util.Arrays;
public class WordCount{
	public static void main(String[] args) {
		//sampleString : the original String
		String sampleString = "Time to put it all together! Following the milestones you laid out for yourself, write the code for your final project. Test your code along the way to make sure you have solved each milestone.";
		//symbolsThatsGonnaRemove
		char[] symbolsThatsGonnaRemove = {',' , '.','!', '?'};
		System.out.println("[Original Sentence]\n"+sampleString+"\n");
		String ok = Split.filter(sampleString,symbolsThatsGonnaRemove);
		System.out.println("[Filtered version]\n"+ok+"\n");
		String[] ok2= Split.splitted(' ',Split.filter(sampleString,symbolsThatsGonnaRemove)+"\n");
		System.out.println("[Array version]\n"+Arrays.toString(ok2)+"\n\n[WordCount]");
		Split.wordCount(ok2);
	}
}