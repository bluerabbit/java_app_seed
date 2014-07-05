## eclipseの設定を書き出す

```
gradle cleanEclipse
gradle eclipse
```

## テストを実行する

```
gradle test
```

## 実行する

```
gradle run -Pargs="test.xls"
```

## jarを生成して実行する

```
gradle build
java -jar build/libs/gradlestudy-0.0.1.jar test.xls
```

## 生成したファイルを消す

```
gradle clean
```
