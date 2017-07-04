import java.util.Scanner;

public class AppQuiz {
  Scanner sc;
  int point;
  int total;
  int ans;
  public static void main(String[] args) {
    AppQuiz aq = new AppQuiz();
    aq.init();
  }
  public void init(){
    sc = new Scanner(System.in);

    total += question1();
    total += question2();
    total += question3();
    total += question4();
    total += question5();
    total += question6();
    System.out.println("total : " + total);

    sc.close();
  }
  public int question1(){
    int point;
	System.out.println("問題１");
	System.out.println("パンはパンでも食べられないパンはなんでしょう？");
	System.out.println("選択肢１：メロンパン");
	System.out.println("選択肢２：フライパン");
	ans = sc.nextInt();
	do{
  	if( ans == 1){
      System.out.println("不正解");
      point = 0;
  	}
  	else{
      System.out.println("正解！");
      point = 100;
  	}
	}while( ans < 1 || 2 < ans );
	  System.out.println("");
    return point;
  }
  public int question2(){
    int point;
	  System.out.println("問題２：ホッキョクウサギの特徴とは？");
	  System.out.println("1.泳ぐことができる 2.3メートル以上ジャンプする 3.肉を食べる 4.時速100km以上で走る");
	  System.out.print("回答：");
	  do{
  	  ans = sc.nextInt();
  	  if(ans == 3) {
  		  System.out.println("正解！");
  		  point = 100;
  	  }else {
  		  System.out.println("不正解");
  		  point = 0;
  	  }
	  }while( ans < 1 || 4 < ans );
	  System.out.println("");
	  return point;
  }
  public int question3(){
	System.out.println("問題３");
	System.out.println("今何問目？");
	System.out.println("1、4問目");
	System.out.println("2、3問目");
	do{
	  ans = sc.nextInt();
	  if( ans == 1){
      System.out.println("不正解");
	    point = 0;
	  }
	  else{
      System.out.println("正解！");
      point = 100;
	  }
  }while( ans < 1 || 2 < ans );
	  System.out.println("");
    return point;
  }
  public int question4(){
    int point;
    System.out.println("問題４\n" + "今何問目？");
    System.out.println("１：100問目  ２：４問目");
    do{
      ans =  sc.nextInt();
      if( ans == 2){
        System.out.println("正解！");
        point = 100;
      }
      else{
        System.out.println("正解！");
        point = 0;
      }
   }while( ans < 1 || 2 < ans );
    System.out.println("");
    return point;
  }
  public int question5(){
    int point = 0;
	  System.out.println("問題５");
	  System.out.println("世界で上り坂と下り坂どっちが多い？");
	  System.out.println("1:上り坂  2:下り坂");
	  do{
			System.out.println(ans = sc.nextInt());
			if( ans < 1 || 2 < ans) {
				System.out.println("マナーを守りましょう");
				System.out.println();
			}
			else if( ans == 1 || ans == 2){
	      System.out.println("正解！");
			  System.out.println("お前がナンバー１だ！");
			  point = 100;
			}
	}while( ans < 1 || 2 < ans );
	  System.out.println("");
	  return point;
  }
  public int question6(){
	  int point = 0;
		System.out.println("問題６");
		System.out.println("”CG”とは何の略？");
		System.out.println("1.コンピュータ・グラフィック  2.コーポレーション・グランド  3.コピー・グラデーション");

		System.out.println("解答: ");

		do{
  		ans = sc.nextInt();

  		if(ans == 1) {
  			System.out.println("正解");
  			point = 100;
  		}
  		else if(ans == 2){
  			System.out.println("不正解");
  		}
  		else if(ans == 3){
  			System.out.println("不正解");
  		}
  		else{
  			System.out.println("1～3の文字を入力してください");
  		}
	  } while( ans < 1 || 3 < ans);
    System.out.println("");
    return point;
  }
}
