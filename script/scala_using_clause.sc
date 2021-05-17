case class Config(port: Int, baseUrl: String)
/*
def renderWebsite(path: String, c: Config): String =
  "<html>" + renderWidget(List("cart"), c)  + "</html>"

def renderWidget(items: List[String], c: Config): String = ???
*/

def renderWebsite(path: String)(using c: Config): String =
  "<html>" + renderWidget(List("cart"))    + "</html>"


def renderWidget(items: List[String])(using c: Config): String = ???

val config = Config(8080, "docs.scala-lang.org")

given Config = config

renderWebsite("/home")