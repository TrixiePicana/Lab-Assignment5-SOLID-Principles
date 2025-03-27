public class SimpleEmailNotifier implements EmailNotifier
{
    @Override
    public void sendEmailNotification (String emailAddress)
    {
        System.out.println("Email notification is sent to " + emailAddress + ".");
    }
}
