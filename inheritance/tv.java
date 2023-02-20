package inheritance;

public class tv {
    public tv() {
        System.out.println("type of tvs");
    }
        public void deviceType(){
            System.out.println("device type:monitors");
        }
                }
class toshiba extends tv{
    public toshiba(){
        System.out.println("toshiba:32 inch");
    }
    public void category(){
        System.out.println("digital tv");
    }
}
   class sony extends tv{
    public sony(){
        System.out.println("sony:model 22");
    }
    public void category(){
        System.out.println("digital tv");
    }
   }
   class android extends tv{
    public android(){
        System.out.println("androidSmart Android TV 4K UHD HDR Dolby Atmos AIPQ  Voice Control 50P725");
    }
    public void category(){
        System.out.println("smart tv");
    }
   }
   class vitron extends tv{
    public vitron(){
        System.out.println("vitron:Vitron 43");
    }
    public void category(){
        System.out.println("smart tv");
    }
   }
    class inheritance{
        public static void main(String[] args) {
            toshiba tvs=new toshiba();
            vitron v = new vitron();

            v.category();
            tvs.deviceType();
            tvs.category();



        }

    }
