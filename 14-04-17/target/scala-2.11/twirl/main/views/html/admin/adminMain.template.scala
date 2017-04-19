
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object adminMain_Scope1 {
import controllers.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*20.48*/routes/*20.54*/.AdminController.products()),format.raw/*20.81*/("""">Product Admin</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*24.22*/if(title == "Products")/*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""class="active"""")))}),format.raw/*24.61*/(""">
                    <a href=""""),_display_(/*25.31*/routes/*25.37*/.AdminController.products()),format.raw/*25.64*/("""">Products</a>
                </li>
                <li """),_display_(/*27.22*/if(title == "Orders")/*27.43*/{_display_(Seq[Any](format.raw/*27.44*/("""class="active"""")))}),format.raw/*27.59*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.AdminController.orders()),format.raw/*28.62*/("""">Orders</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*31.22*/if(title == "Login")/*31.42*/{_display_(Seq[Any](format.raw/*31.43*/("""class="active"""")))}),format.raw/*31.58*/(""">
                    """),_display_(/*32.22*/if(user != null)/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""
                        """),format.raw/*33.25*/("""<a href=""""),_display_(/*33.35*/controllers/*33.46*/.routes.LoginController.logout()),format.raw/*33.78*/("""">Logout """),_display_(/*33.88*/user/*33.92*/.getfName()),format.raw/*33.103*/("""</a>
                    """)))}/*34.23*/else/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
                        """),format.raw/*35.25*/("""<a href=""""),_display_(/*35.35*/controllers/*35.46*/.routes.LoginController.login()),format.raw/*35.77*/("""">Login</a>
                    """)))}),format.raw/*36.22*/("""
                """),format.raw/*37.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*43.32*/("""
        """),_display_(/*44.10*/content),format.raw/*44.17*/("""
    """),format.raw/*45.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*54.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:13 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/admin/adminMain.scala.html
                  HASH: f0e9ff1caa322358ffae60d846cea1dad88f3288
                  MATRIX: 877->66|1027->121|1055->123|1134->228|1169->237|1203->245|1228->250|1503->498|1518->504|1581->545|1669->606|1684->612|1745->651|2001->880|2016->886|2064->913|2238->1060|2270->1083|2309->1084|2355->1099|2414->1131|2429->1137|2477->1164|2562->1222|2592->1243|2631->1244|2677->1259|2736->1291|2751->1297|2797->1322|2950->1448|2979->1468|3018->1469|3064->1484|3114->1507|3139->1523|3179->1525|3232->1550|3269->1560|3289->1571|3342->1603|3379->1613|3392->1617|3425->1628|3470->1655|3483->1660|3522->1661|3575->1686|3612->1696|3632->1707|3684->1738|3748->1771|3793->1788|3903->1960|3940->1970|3968->1977|4000->1982|4362->2317|4377->2323|4439->2364
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|53->20|53->20|53->20|57->24|57->24|57->24|57->24|58->25|58->25|58->25|60->27|60->27|60->27|60->27|61->28|61->28|61->28|64->31|64->31|64->31|64->31|65->32|65->32|65->32|66->33|66->33|66->33|66->33|66->33|66->33|66->33|67->34|67->34|67->34|68->35|68->35|68->35|68->35|69->36|70->37|75->43|76->44|76->44|77->45|86->54|86->54|86->54
                  -- GENERATED --
              */
          