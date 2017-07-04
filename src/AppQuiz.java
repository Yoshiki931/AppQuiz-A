
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
	System.out.println("問題１");
	System.out.println("パンはパンでも食べられないパンはなんでしょう？");
	System.out.println("選択肢１：メロンパン");
	System.out.println("選択肢２：フライパン");
	point = sc.nextInt();
	System.out.println();
    return point;
  }
  public int question2(){
	  int ans = 0;
	  System.out.println("ホッキョクウサギの特徴とは？");
	  System.out.println("1.泳ぐことができる 2.3メートル以上ジャンプする 3.肉を食べる 4.時速100km以上で走る");
	  System.out.print("回答：");
	  ans = sc.nextInt();
	  if(ans == 3) {
		  System.out.println("正解！");
		  point = 2;
	  }else {
		  System.out.println("不正解");
	  }
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
    return point;
  }
}
