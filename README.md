# Gradle トーキョー復習
Gradleトーキョーなるものに参加してきたけど、
いまいちついていけなかった感があるので復習してみた。
TODO:　気が向いたらブログ書く

+ atnd [Gradleトーキョー](http://atnd.org/events/30137)
+ 資料　[gradle入門](http://www.slideshare.net/mikeneck/gradleanewgenerationbuildtoolja)
+ togetter [togetter](http://togetter.com/li/340726)
+ [念願のGradleトーキョーに参加した-いぬおせろ](http://d.hatena.ne.jp/wankomagic/20120718/1342630491)
+ [Gradleトーキョー に参加してきた #jggug #gradle_ja #gradle_tokyo-Shinya’s Daily Report](http://d.hatena.ne.jp/absj31/20120718/1342625420)

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

## SampleProject
customPluginを使用するサンプル