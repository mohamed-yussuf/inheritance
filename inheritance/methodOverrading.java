package inheritance;

public class methodOverrading {
    void speak(){
        System.out.println("produce sound");
    }
}
  class dog extends methodOverrading {
      void speak() {
          super.speak();
          System.out.println("the dog barks");
      }
  }
  class goat extends dog{
    void speak(){
       // super.speak();
        System.out.println("hhuiwhehwhwu");
    }
  }
    class main{
        public static void main(String[] args) {
            methodOverrading dog=new dog();
            methodOverrading goat=new goat();
            dog.speak();
            goat.speak();
        }

  }
