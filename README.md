# Task List

## 1 if
入力したものが
3の倍数のときは"fizz"
5の倍数のときは"buzz"
3の倍数かつ5の倍数のときは"fizz buzz"
それ以外のときはすうじを出力してください

## 2 for 配列

```
int[] A = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
```

このような配列が用意されている
このとき、
```
1  4  7  10
2  5  8  11
3  6  9  12
```
のように出力しなさい
ただし、配列の要素数が変わった場合、
コードの変更箇所は配列の初期化部分のみで動くプログラムにしなさい

## 3 while

以下のコードの要約を日本語でしなさい
ヒント
countでは何をしていますか?
breakとcontinueの処理はどういったときに実行されますか?

```
    public static void while_3() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String inputData = scanner.nextLine();
            if (inputData.length() == 0) {
                break;
            } else if (inputData.length() % 2 == 0) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
```

## 4 class

男の子は嘘つきです
男のは年齢と名前を持っていますが、年齢はサバを読んでいつも10歳上の年齢を言います
名前は本当の名前を言います
また、男の子は「鬼が来たぞ」という嘘をつきます
この男の子のクラスを作成してください

必要な要素
- フィールド(年齢、名前、ここに保存されるのは本当の名前や年齢)
- コンストラクタ(デフォルトコンストラクタと、年齢、名前が引数としてあるものの、計二つを作る)
- メソッド(getter、setter、lieメソッド)

呼び出しの例
```
    public static void callLiarBoy_4() {
        LiarBoy liarBoy = new LiarBoy(10, "竈門炭太郎");

        System.out.println("僕の名前は" + liarBoy.getName() + "だよ");
        System.out.println("僕の年齢は" + liarBoy.getAge() + "だよ");
        liarBoy.lie();
    }
```

実行結果
```
僕の名前は竈門炭太郎だよ
僕の年齢は20だよ
鬼が来たぞ
```
