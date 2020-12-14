# 学習ノート

## Springアプリケーション

`@SpringBootApplication` を付けることで簡単にSpringアプリケーションとして起動できる。

## Webアプリケーション

対象のコントローラクラスに `@RestController` を付けて、メソッドに `@GetMapping` や `@PostMapping` を付けることで、ルーティングできる。
クラスに `@RequestMapping` を付けることもできる。

## スケジューラ

対象のクラスに `@Component` を付けて、メソッドに `@Scheduled` を付けることで、定期実行ができる。
決められた時間式で実行される `cron` 、定期実行の `fixedRate` 、間隔実行の `fixedDelay` 、遅延実行の `initialDelay` などがある。

## DIコンテナ

`@Component` を付けたコンポーネントをDIコンテナに注入することで、インスタンスやクラスを跨いで同じデータを扱うことができる。
DIコンテナに注入するときは、使用するクラス側で `@Autowired` で定義することが必要。
