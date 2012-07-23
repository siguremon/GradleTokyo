# Gradle トーキョー復習
## BuildSample
Gradle + groovy + junit4.xのビルドサンプル
       gradle test
       ->build/reports/tests/index.html + etc

## simplePlugin
カスタムプラグインをbuild.gradle内で定義したサンプル
	gradle first
	gradle second
	gradle third

## customPlugin
カスタムプラグインをstandaloneで作成したサンプル
customPlugin/src/main/resources/META-INF/gradle-plugins/custom.properties
が重要
	gradle uploadArchives
	->../repo にmavenレポジトリとしてデプロイ
