
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
    return point;
  }
  public int question6(){
	  int point = 0;

		System.out.print("質問6");
		System.out.print("”CG”とは何の略？");
		System.out.print("1.コンピュータ・グラフィック  2.コーポレーション・グランド  3.コピー・グラデーション");

		System.out.println("解答:" + point = sc.nextInt());
		if(point == 1) {
			System.out.println("正解");
		}
		else if(point == 2){
			System.out.println("不正解");
		}
		else if(point == 3){
			System.out.println("不正解");
		}
		else{
			System.out.println("1～3のもじを入力してください");
		}

    return point;
  }
}
