public abstract class TangibleAsset{
  private String name;
  private int price;
  private String color;

  public TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.name = price;
    this.color = color;
  }
  public String getName() {return this.name;}
  public int getPrice() {return this.price;}
  public String get color() {return this.color;}

}
