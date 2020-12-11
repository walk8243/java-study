# java-study

JAVAの勉強用

## 実行コマンド

### 実行できる内容を表示

```
./gradlew tasks
```

### 実行

```
./gradlew bootRun
```

## 実行結果

共に5回を直列と並列で処理時間を比較した。

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.1)

2020-12-12 03:25:32.198  INFO 22460 --- [           main] x.w.javastudy.JavaStudyApplication       : Starting JavaStudyApplication using Java 12.0.2
2020-12-12 03:25:32.200  INFO 22460 --- [           main] x.w.javastudy.JavaStudyApplication       : No active profile set, falling back to default profiles: default
2020-12-12 03:25:32.493  INFO 22460 --- [           main] x.w.javastudy.JavaStudyApplication       : Started JavaStudyApplication in 0.532 seconds (JVM running for 0.787)
2020-12-12 03:25:32.997  INFO 22460 --- [           main] x.w.javastudy.JavaStudyApplication       : 並列処理 実行時間 => 500ms
2020-12-12 03:25:34.988  INFO 22460 --- [           main] x.w.javastudy.JavaStudyApplication       : 直列処理 実行時間 => 1990ms
```
