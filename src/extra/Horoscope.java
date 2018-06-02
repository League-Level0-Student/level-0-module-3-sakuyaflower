package extra;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {

	String answer = JOptionPane.showInputDialog(null,"What is your zodiac?");
if(answer.equals("Aries")) {
JOptionPane.showMessageDialog(null,"Here is your horoscope; Don't get too hunng up on your appeaaraances today, others respond most to your natural charm.");
}
else if(answer.equals("Taurus")){
JOptionPane.showMessageDialog(null,"Communicate with those close to you as your personal life and work life come together today.");
}
else if(answer.equals("Gemini")) {
JOptionPane.showMessageDialog(null,"With Meercury in trine with Mars today you can put into practice the relationships changes you want to make.");
}
else if(answer.equals("Cancer")) {
JOptionPane.showMessageDialog(null,"With Venus in trine with Jupiter today you can follow your ability to read people and trust your instincts.");
}
else if(answer.equals("Leo")) {
JOptionPane.showMessageDialog(null, "Take some time to have fun today and others will want to have fun with you, regain some balance.");	
}
else if(answer.equals("Virgo")) {
JOptionPane.showMessageDialog(null,"Stay focussed today to aachieeve your goals, and start the day with rest so you have lots of energy.");
}
else if(answer.equals("Libra")){
JOptionPane.showMessageDialog(null,"Don't try to bak out of a social event with someone special in your life today, it will be positive.");
}
else if(answer.equals("Scorpio")){
JOptionPane.showMessageDialog(null,"WIth Jupiter in trine with Venus today your spiritual needs are high and you will think about a trip.");
}
else if(answer.equals("Sagittarius")){
JOptionPane.showMessageDialog(null,"You may recieve wake up calls regarding your finances today,use this chance to put things in order.");
}
else if(answer.equals("Capricorn")){
JOptionPane.showMessageDialog(null,"Keep fighting at work today, even when you feel you are getting nowhere, good news is coming");
}
else if(answer.equals("Aquarius")){
JOptionPane.showMessageDialog(null,"Energy ffrom Mars in trine with Mercury today gives you good communicaationnn and fowaard thinking. ");
}
else if(answer.equals("Pisces")){
JOptionPane.showMessageDialog(null,"When someone appears more important in your life that you thought today, do some digging.");
}
else if(answer.equals("")){
JOptionPane.showMessageDialog(null,"That's not a star sign!");
}

















}
}