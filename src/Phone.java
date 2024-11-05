public class Phone implements Chargeable{
    @Override
    public void charge()
    {
        System.out.println("The phone is charged");
    }
    public void takePhoto()
    {
        System.out.println("The phone took a Photo");
    }
}