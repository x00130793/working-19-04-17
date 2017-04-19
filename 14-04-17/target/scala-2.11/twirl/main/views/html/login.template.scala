
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], addUserForm: Form[models.users.User], user: models.users.User,  categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.167*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user, categories, catId, filter)/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""

	"""),format.raw/*7.2*/("""<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						"""),_display_(/*13.8*/if(loginForm.hasGlobalErrors)/*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
            						"""),format.raw/*14.19*/("""<p class="alert alert-warning">
            					"""),_display_(/*15.19*/loginForm/*15.28*/.globalError.message),format.raw/*15.48*/("""
           				"""),format.raw/*16.16*/("""</p>
						""")))}),format.raw/*17.8*/("""
						"""),_display_(/*18.8*/if(flash.containsKey("error"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
						    """),format.raw/*19.11*/("""<div class="alert alert-warning">
						    """),_display_(/*20.12*/flash/*20.17*/.get("loginRequired")),format.raw/*20.38*/("""
						    """),format.raw/*21.11*/("""</div>
						""")))}),format.raw/*22.8*/("""
						

							"""),format.raw/*25.8*/("""<!-- The login form -->
							"""),_display_(/*26.9*/helper/*26.15*/.form(action = controllers.routes.LoginController.loginSubmit(catId, filter))/*26.92*/ {_display_(Seq[Any](format.raw/*26.94*/("""

								"""),format.raw/*28.9*/("""<div class="form-group">
								"""),_display_(/*29.10*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.113*/("""
								"""),format.raw/*30.9*/("""</div>
								<div class="form-group">
								"""),_display_(/*32.10*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.123*/("""
								"""),format.raw/*33.9*/("""</div>
							"""),format.raw/*34.18*/("""
								"""),format.raw/*35.54*/("""
								"""),format.raw/*36.30*/("""
							"""),format.raw/*37.19*/("""
							"""),format.raw/*38.88*/("""
							"""),format.raw/*39.8*/("""<div class="form-group"> <input type="submit" value="Sign In" class="btn btn-primary"> </div>
						""")))}),format.raw/*40.8*/("""
					
					"""),format.raw/*42.6*/("""</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User? Signup!</h2>
						<h4>Password must have: </h4>
						<ul>
							<li>At least 8 characters</li>
							<li>One uppercase letter</li>
							<li>One lowercase letter</li>
							<li>A number</li>
							
						</ul>

						"""),_display_(/*59.8*/if(flash.containsKey("success"))/*59.40*/{_display_(Seq[Any](format.raw/*59.41*/("""
							"""),format.raw/*60.8*/("""<div class="alert alert-success">
							"""),_display_(/*61.9*/flash/*61.14*/.get("success")),format.raw/*61.29*/("""
							"""),format.raw/*62.8*/("""</div>
						""")))}),format.raw/*63.8*/("""
						"""),_display_(/*64.8*/if(flash.containsKey("fail"))/*64.37*/{_display_(Seq[Any](format.raw/*64.38*/("""
							"""),format.raw/*65.8*/("""<div class="alert alert-danger">
							"""),_display_(/*66.9*/flash/*66.14*/.get("fail")),format.raw/*66.26*/("""
							"""),format.raw/*67.8*/("""</div>
						""")))}),format.raw/*68.8*/("""
					"""),format.raw/*69.6*/("""</div>
					"""),_display_(/*70.7*/form(action = routes.HomeController.addUserSubmit(catId, filter), 'class -> "form-horizontal", 'role->"form")/*70.116*/ {_display_(Seq[Any](format.raw/*70.118*/("""

						"""),format.raw/*72.7*/("""<div class="form-row">
							<label>
							"""),_display_(/*74.9*/inputText(addUserForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*74.91*/("""
							"""),format.raw/*75.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*80.9*/inputText(addUserForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*80.91*/("""
							"""),format.raw/*81.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*86.9*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*86.86*/("""
							"""),format.raw/*87.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*92.9*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*92.112*/("""
							"""),format.raw/*93.8*/("""</label>
						</div>
					
						<div class="form-row">
							<label>
							"""),_display_(/*98.9*/inputText(addUserForm("password2"), '_label -> "Repeat Password",'class -> "form-control", 'type -> "password")),format.raw/*98.120*/("""
							"""),format.raw/*99.8*/("""</label>
						</div>



						<div class="actions">
							<input type="submit" value="Save" class="btn btn-primary">
							<a href=""""),_display_(/*106.18*/routes/*106.24*/.LoginController.login(catId, filter)),format.raw/*106.61*/("""">
							</a>
						</div>


					</div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->

""")))}),format.raw/*118.2*/("""
""")))}),format.raw/*119.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],addUserForm:Form[models.users.User],user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,addUserForm,user,categories,catId,filter)

  def f:((Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,addUserForm,user,categories,catId,filter) => apply(loginForm,addUserForm,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:11 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/login.scala.html
                  HASH: 53899129d054bcaf3fda45bb6bba6b881a4d9f74
                  MATRIX: 839->1|1115->166|1142->184|1170->257|1197->259|1251->305|1290->307|1319->310|1557->522|1595->551|1635->553|1682->572|1759->622|1777->631|1818->651|1862->667|1904->679|1938->687|1977->717|2017->719|2056->730|2128->775|2142->780|2184->801|2223->812|2267->826|2310->842|2368->874|2383->880|2469->957|2509->959|2546->969|2607->1003|2732->1106|2768->1115|2844->1164|2979->1277|3015->1286|3057->1310|3094->1364|3131->1394|3167->1413|3203->1501|3238->1509|3369->1610|3408->1622|3858->2046|3899->2078|3938->2079|3973->2087|4041->2129|4055->2134|4091->2149|4126->2157|4170->2171|4204->2179|4242->2208|4281->2209|4316->2217|4383->2258|4397->2263|4430->2275|4465->2283|4509->2297|4542->2303|4581->2316|4700->2425|4741->2427|4776->2435|4848->2481|4951->2563|4986->2571|5087->2646|5190->2728|5225->2736|5326->2811|5424->2888|5459->2896|5560->2971|5685->3074|5720->3082|5826->3162|5959->3273|5994->3281|6158->3417|6174->3423|6233->3460|6394->3590|6427->3592
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|55->25|56->26|56->26|56->26|56->26|58->28|59->29|59->29|60->30|62->32|62->32|63->33|64->34|65->35|66->36|67->37|68->38|69->39|70->40|72->42|89->59|89->59|89->59|90->60|91->61|91->61|91->61|92->62|93->63|94->64|94->64|94->64|95->65|96->66|96->66|96->66|97->67|98->68|99->69|100->70|100->70|100->70|102->72|104->74|104->74|105->75|110->80|110->80|111->81|116->86|116->86|117->87|122->92|122->92|123->93|128->98|128->98|129->99|136->106|136->106|136->106|148->118|149->119
                  -- GENERATED --
              */
          