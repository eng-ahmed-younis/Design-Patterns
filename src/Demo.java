public class Demo
{
    /**
     *
     * -> (factory method)
     *   Logistics logistics = new AirLogistics();
     *   logistics.doDeliveryTransport();
     *   .............................................................................................
     *
     *   abstract factory
     *  *  // Application application = new Application(new ModernFactory());
     *  *         application.chairStyle();
     *  *
     *  *         ->(builder)
     *  *           OrderBuilder builder = new OrderBuilder()
     *  *                 .addDesert(new Desert("konafa"))
     *  *                 .addFood(new Food(20,"rice"));
     *  *
     *  *         Order order = builder.build();
     *  *         order.orderDetails();
     *  ................................................................................................
     *  prototype
     *  // every object in BookRegistry init when create constructor
     *  // BookRegistry bookregistry = new BookRegistry();
     *  Educational educational = (Educational) bookregistry.getBook(BookType.EDUCATIONAL);
     *  System.out.println(educational);
     *  .................................................................................................
     *
     *  builder
     *
     *  Order order = new OrderBuilder()
     *                 .addId(1)
     *                 .addCustomerName("ahmed")
     *                 .addTableNumber(3)
     *                 .addDesert(new Desert("konafa"))
     *                 .addFood(new Food(20, "rice"))
     *                 .build();
     *
     * /....................................................................................................
     *
     * // adapter
     *  AudioPlayer audioPlayer = new AudioPlayer();
     *  audioPlayer.play("mp3", "beyond the horizon.mp3");
     *  audioPlayer.play("mp4", "alone.mp4");
     *  audioPlayer.play("vlc", "far far away.vlc");
     *  audioPlayer.play("avi", "mind me.avi");
     *  ..................................................................................................
     *   // bridge
     *  public static void main(String[] args) {
     *  testDevice(new Tv());
     *  testDevice(new Radio());
     *  }
     *
     *  public static void testDevice(Device device) {
     *  System.out.println("Tests with basic remote.");
     *  BasicRemote basicRemote = new BasicRemote(device);
     *  basicRemote.power();
     *  device.printStatus();
     *
     *  System.out.println("Tests with advanced remote.");
     *  AdvancedRemote advancedRemote = new AdvancedRemote(device);
     *  advancedRemote.power();
     *  advancedRemote.mute();
     *  device.printStatus();
     *
     *  ....................................................................................................
     *   composition
     *
     *    Department salesDepartment = new SalesDepartment();
     *         Department financialDepartment = new FinancialDepartment();
     *
     *         HeadDepartment headDepartment = new HeadDepartment(
     *                 3, "Head department");
     *
     *         headDepartment.addDepartment(salesDepartment);
     *         headDepartment.addDepartment(financialDepartment);
     *
     *         headDepartment.printDepartmentName();
     *
     * ......................................................................................................
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * */
}
