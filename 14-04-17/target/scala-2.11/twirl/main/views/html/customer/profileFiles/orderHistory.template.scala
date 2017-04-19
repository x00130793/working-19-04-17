
package views.html.customer.profileFiles

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderHistory_Scope0 {
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

class orderHistory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, ord: List[models.shopping.ShopOrder], filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.162*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

"""),_display_(/*6.2*/main("Customer order history", user, categories, catId, filter)/*6.65*/  {_display_(Seq[Any](format.raw/*6.68*/("""


	"""),format.raw/*9.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Order history</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*18.14*/if(flash.containsKey("success"))/*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
                """),format.raw/*19.17*/("""<div class="alert alert-success">
                """),_display_(/*20.18*/flash/*20.23*/.get("success")),format.raw/*20.38*/("""
                """),format.raw/*21.17*/("""</div>
            """)))}),format.raw/*22.14*/("""
			"""),format.raw/*23.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Total Cost</th>
						<th>Order status</th>
						<th></th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*34.18*/for(o <- ord) yield /*34.31*/ {_display_(Seq[Any](format.raw/*34.33*/("""
			
								"""),format.raw/*36.9*/("""<tr>	
								
									<td>"""),_display_(/*38.15*/o/*38.16*/.getOrderDate),format.raw/*38.29*/("""</td>
									<td>€"""),_display_(/*39.16*/o/*39.17*/.getOrderTotal),format.raw/*39.31*/("""</td>
									<td>"""),_display_(/*40.15*/o/*40.16*/.getStatus()),format.raw/*40.28*/("""</td>
									"""),_display_(/*41.11*/if(o.getStatus() != "delivered")/*41.43*/{_display_(Seq[Any](format.raw/*41.44*/("""
									"""),format.raw/*42.10*/("""<td>
										<a href=""""),_display_(/*43.21*/routes/*43.27*/.CustomerCtrl.cancelOrder(catId, filter, o.getId)),format.raw/*43.76*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>
									</td>
									""")))}),format.raw/*48.11*/("""	
									"""),format.raw/*49.10*/("""</td>
									</a>
								</tr>
                """)))}),format.raw/*52.18*/("""

			"""),format.raw/*54.4*/("""</tbody>
            </div>
			</table>

					<!--end list-->
					</div>
				</div>
				<div>
				</div>
			</div>


""")))}),format.raw/*66.2*/("""

"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,ord:List[models.shopping.ShopOrder],filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,ord,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,ord,filter) => apply(customer,user,categories,catId,ord,filter)

  def ref: this.type = this

}


}

/**/
object orderHistory extends orderHistory_Scope0.orderHistory
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:12 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/customer/profileFiles/orderHistory.scala.html
                  HASH: 036bf41eb5db05ba25b1b6eebee9381f5d93e4ad
                  MATRIX: 880->1|1136->161|1163->162|1476->450|1547->513|1587->516|1617->520|1900->776|1941->808|1981->810|2026->827|2104->878|2118->883|2154->898|2199->915|2250->935|2281->939|2578->1209|2607->1222|2647->1224|2687->1237|2743->1266|2753->1267|2787->1280|2835->1301|2845->1302|2880->1316|2927->1336|2937->1337|2970->1349|3013->1365|3054->1397|3093->1398|3131->1408|3183->1433|3198->1439|3268->1488|3469->1658|3508->1669|3590->1720|3622->1725|3771->1844
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|40->9|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|53->22|54->23|65->34|65->34|65->34|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|79->48|80->49|83->52|85->54|97->66
                  -- GENERATED --
              */
          