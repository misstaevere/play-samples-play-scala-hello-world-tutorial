// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/karttaevere/Downloads/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Wed Feb 10 18:24:17 GMT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
