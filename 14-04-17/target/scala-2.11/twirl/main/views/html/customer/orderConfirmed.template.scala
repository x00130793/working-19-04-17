
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderConfirmed_Scope0 {
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

     object orderConfirmed_Scope1 {
import models.Category
import models.Product
import models.users.User

class orderConfirmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[Category],models.shopping.ShopOrder,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(customer: models.users.Customer, user: models.users.User, categories: List[Category], order: models.shopping.ShopOrder, catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models.Product._

Seq[Any](format.raw/*4.151*/("""

"""),format.raw/*10.1*/("""
"""),format.raw/*11.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*12.2*/main("Order Confirmation", customer, categories, catId, filter)/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/("""


"""),format.raw/*15.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*18.4*/if(flash.containsKey("success"))/*18.36*/ {_display_(Seq[Any](format.raw/*18.38*/("""
			  """),format.raw/*19.6*/("""<div class="alert alert-success">
			      """),_display_(/*20.11*/flash/*20.16*/.get("success")),format.raw/*20.31*/("""
			  """),format.raw/*21.6*/("""</div>
		""")))}),format.raw/*22.4*/(""" 

		"""),format.raw/*24.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*36.18*/if(order != null)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""
                    """),format.raw/*37.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*38.22*/for(i <- order.getItems) yield /*38.46*/ {_display_(Seq[Any](format.raw/*38.48*/("""
                    """),format.raw/*39.21*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getName),format.raw/*40.50*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getDescription),format.raw/*41.57*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getPrice))),format.raw/*42.64*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*52.68*/("%.2f".format(order.getOrderTotal))),format.raw/*52.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[Category],order:models.shopping.ShopOrder,catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,order,catId,filter)

  def f:((models.users.Customer,models.users.User,List[Category],models.shopping.ShopOrder,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,order,catId,filter) => apply(customer,user,categories,order,catId,filter)

  def ref: this.type = this

}


}
}

/**/
object orderConfirmed extends orderConfirmed_Scope0.orderConfirmed_Scope1.orderConfirmed
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:12 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/customer/orderConfirmed.scala.html
                  HASH: 53ca4671f8c6e59540f2f34bb9217649ffb6057f
                  MATRIX: 965->74|1317->223|1346->337|1374->338|1446->384|1518->447|1558->449|1588->452|1661->499|1702->531|1742->533|1775->539|1846->583|1860->588|1896->603|1929->609|1969->619|2001->624|2307->903|2333->920|2373->922|2422->943|2532->1026|2572->1050|2612->1052|2661->1073|2722->1107|2732->1108|2772->1127|2834->1162|2844->1163|2891->1189|2960->1231|3008->1258|3070->1293|3080->1294|3115->1308|3184->1350|3236->1381|3320->1434|3391->1474|3422->1478|3598->1627|3656->1663|3759->1736
                  LINES: 32->4|40->4|42->10|43->11|44->12|44->12|44->12|47->15|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|56->24|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|78->46|79->47|80->48|84->52|84->52|89->57
                  -- GENERATED --
              */
          