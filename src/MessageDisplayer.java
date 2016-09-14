
public class MessageDisplayer {
	private String msg;
	public MessageDisplayer(String m)
	{
		// this will be the message to be displayed
		msg = m;
	}
	public void display()
	{
		System.out.print(msg);
	}
}
