public class KahveOtomati
{
private static MetalPara zincir = null;
public static void main(String[] args)
{
zincir = (new BirLira()).setNext((
new ElliKurus()).setNext((
new OnKurus()).setNext(
new BesKurus())));
paraAt(new BirLira());
paraAt(new ElliKurus());
paraAt(new OnKurus());
paraAt(new OnKurus());
paraAt(new OnKurus());
paraAt(new OnKurus());
paraAt(new BesKurus());
paraAt(new BesKurus());
paraAt(new BirLira());
}
public static void paraAt(MetalPara para)
{
System.out.println("+++ ------------------------ +++");
System.out.println("Otomata " + para.toString()
+ " atildi.");
zincir.check(para);
System.out.println("+++ ------------------------ +++\n");
}
}