
public class AppQuiz {
  int point;
  int total;
  public static void main(String[] args) {
    AppQuiz aq = new AppQuiz();
    aq.init();
  }
  public void init(){

  }
  public int question1(){
    return point;
  }
  public int question2(){
    return point;
  }
  public int question3(){
    return point;
  }
  public int question4(){
    return point;
  }
  public int question5(){
	  System.out.println("問5");
	  System.out.println("世界で、上り坂と下り坂どっちが多い？");
	  System.out.println("1:上り坂,2:下り坂");
	  do{
			System.out.println(point = sc.nextInt());
			if( point < 1 || 3 < point) {
				System.out.println("マナーを守りましょう(｀・ω・´)");
				System.out.println();
			}
			if(point == 3){
		  System.out.println("お前がナンバー1だ！");
		  point = 100;
	  }
	}while( point < 1 || 2 < point);
	  return point;
  }
  public int question6(){
    return point;
  }
}
