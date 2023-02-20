package inheritance;
//  Galaxy S (2010)
//          Galaxy S II (2011)
//          Galaxy S III (2012)
//          Galaxy S4 (2013)
//          Galaxy S5 (2014)
//          Galaxy S6 / S6 Edge (2015)
//          Galaxy S7 / S7 Edge (2016)
//          Galaxy S8 / S8+ (2017)

public class samsung {
    public samsung(){
        System.out.println("types of s-series ");
    }
    public void deviceType(){
        System.out.println("Device type: s-series ");
    }


}
  class GalaxyS extends samsung{
    public GalaxyS(){
        System.out.println("manufactured in 2010");
    }
    public void category(){
        System.out.println("categorty-s-series");
    }
  }
  class GalaxyS2 extends GalaxyS{
    public GalaxyS2(){
        System.out.println("manufactured in 2011 ");
    }
    public void category(){
        System.out.println("category_s_series");
    }
  }
  class GalaxyS3 extends GalaxyS2{
    public GalaxyS3(){
        System.out.println("manufactured in 2012 ");
    }
    public void category(){
        System.out.println("category_s_series ");
    }
  }
  class phones{
      public static void main(String[] args) {
        samsung phones=new samsung();
        phones.deviceType();
        //phones.category();

      }

  }

