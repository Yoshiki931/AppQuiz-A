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
    System.out.println("TotalScore : " + total);
    sc.close();
  }
  public int question1(){
    int point = 0;
  	System.out.println("問題１");
  	System.out.println("パンはパンでも食べられないパンはなんでしょう？");
  	System.out.println("選択肢１：メロンパン");
  	System.out.println("選択肢２：フライパン");
  	do{
      System.out.print("回答：");
  	  ans = sc.nextInt();
    	if( ans == 1){
        System.out.println("不正解");
        point = 0;
    	}
    	else if( ans == 2){
        System.out.println("正解！ 100ptゲット！");
        point = 100;
  	}
  }while( ans < 1 || 2 < ans );
	  System.out.println("");
    return point;
  }
  public int question2(){
    int point = 0;
	  System.out.println("問題２：ホッキョクウサギの特徴とは？");
	  System.out.println("1.泳ぐことができる 2.3メートル以上ジャンプする 3.肉を食べる 4.時速100km以上で走る");
	  do{
	    System.out.print("回答：");
  	  ans = sc.nextInt();
  	  if(ans == 3) {
        System.out.println("正解！ 100ptゲット！");
  		  point = 100;
  	  }else if( ans != 3) {
  		  System.out.println("不正解");
  		  point = 0;
  	  }
	  }while( ans < 1 || 4 < ans );
	  System.out.println("");
	  return point;
  }
  public int question3(){
    int point = 0;
  	System.out.println("問題３");
  	System.out.println("今何問目？");
  	System.out.print("1:4問目  2:3問目");
  	do{
  	  System.out.print("回答：");
  	  ans = sc.nextInt();
  	  if( ans == 1){
        System.out.println("不正解");
  	    point = 0;
  	  }
  	  else if(ans == 2){
        System.out.println("正解！ 100ptゲット！");
        point = 100;
  	  }
    } while( ans < 1 || 2 < ans );
  	  System.out.println("");
      return point;
  }
  public int question4(){
    int point = 0;
    System.out.println("問題４\n" + "今何問目？");
    System.out.println("１：100問目  ２：４問目");
    do{
      System.out.print("回答：");
      ans =  sc.nextInt();
      if( ans == 1 || ans == 2){
        System.out.println("正解！ 100ptゲット！");
        point = 100;
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
	    System.out.print("回答：");
			ans = sc.nextInt();
			if( ans < 1 || 2 < ans) {
				System.out.println("マナーを守りましょう");
				System.out.println();
			}
			else if( ans == 1 || ans == 2){
        System.out.println("正解！ 100ptゲット！");
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
		do{
	    System.out.print("回答：");
  		ans = sc.nextInt();
  		if(ans == 1) {
        System.out.println("正解！ 100ptゲット！");
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
