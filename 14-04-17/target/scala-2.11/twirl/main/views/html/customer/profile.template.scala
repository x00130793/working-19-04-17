
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.124*/("""


"""),_display_(/*4.2*/main("Profile", user, categories, catId, filter)/*4.50*/  {_display_(Seq[Any](format.raw/*4.53*/("""


		"""),format.raw/*7.3*/("""<div class="container">
			<div class="row">
				<div class="col-sm-9 padding-right">
					<h2 class="title text-center">Profile</h2>
					<div id="accordian">
							<div class="list-group">

								<h4 class="panel-title">
									<a href=""""),_display_(/*15.20*/routes/*15.26*/.CustomerCtrl.orderHistory(catId, filter)),format.raw/*15.67*/("""" class="list-group-item">Order history</a>
									<a href=""""),_display_(/*16.20*/routes/*16.26*/.CustomerCtrl.profileEdit(catId, filter)),format.raw/*16.66*/("""" class="list-group-item">Edit profile</a>
								</h4>

							</div>
					</div>
				<div>
			</div>
		</div>


""")))}),format.raw/*26.2*/("""

"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:12 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/customer/profile.scala.html
                  HASH: 404a0ebb4ebc7b833a7149db03585c928827f010
                  MATRIX: 825->1|1043->123|1072->127|1128->175|1168->178|1199->183|1471->428|1486->434|1548->475|1638->538|1653->544|1714->584|1860->700
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|46->15|46->15|46->15|47->16|47->16|47->16|57->26
                  -- GENERATED --
              */
          