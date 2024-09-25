public class Main
{
  public static void main(String[] args)
  {
    double someDist = distFormula(1, 1, 2, 2);
    System.out.println(someDist);

    double quadValues = quadFormulaPos(1, -8, 5);
    System.out.println(quadValues);

    double quadVal = quadFormulaNeg(1, -8, 5);
    System.out.println(quadVal);
  }

  public static double distFormula(double x1, double y1, double x2, double y2)
  {
    double dist = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    return dist;
  }

  public static double quadFormulaPos(double a, double b, double c)
  {
    double firstQuad = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    return firstQuad;

  }

  public static double quadFormulaNeg(double a, double b, double c)
  {
    double secQuad = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    return secQuad;

  }

}
 

