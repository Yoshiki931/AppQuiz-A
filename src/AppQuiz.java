
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
	System.out.println("第3問");
	System.out.println("今何問目？");
	System.out.println("1、4問目");
	System.out.println("2、3問目");
	System.out.printn("回答" + point = sc.nexInt());
    return point;
  }
  public int question4(){
    return point;
  }
  public int question5(){
	  System.out.println("��5");
	  System.out.println("���E�ŁA����Ɖ����ǂ����������H");
	  System.out.println("1:����,2:�����");
	  do{
			System.out.println(point = sc.nextInt());
			if( point < 1 || 3 < point) {
				System.out.println("�}�i�[�����܂��傤(�M�E�ցE�L)");
				System.out.println();
			}
			if(point == 3){
		  System.out.println("���O���i���o�[1���I");
		  point = 100;
	  }
	}while( point < 1 || 2 < point);
	  return point;
  }
  public int question6(){
    return point;
  }
}
