
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orders_Scope0 {
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

     object orders_Scope1 {
import models.Category
import models.Product
import models.users.User

class orders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Product],User,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, products: List[Product], user: User, order: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.106*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and content """),format.raw/*7.34*/("""{"""),format.raw/*7.35*/("""html between braces"""),format.raw/*7.54*/("""}"""),format.raw/*7.55*/(""" """),format.raw/*7.56*/("""to the main view -->
"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Orders", user)/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
  """),format.raw/*9.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Order history</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*20.14*/if(flash.containsKey("success"))/*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
                """),format.raw/*21.17*/("""<div class="alert alert-success">
                """),_display_(/*22.18*/flash/*22.23*/.get("success")),format.raw/*22.38*/("""
                """),format.raw/*23.17*/("""</div>
            """)))}),format.raw/*24.14*/("""
			"""),format.raw/*25.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Total Cost</th>
						<th>Order status</th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*35.18*/for(o <- order) yield /*35.33*/ {_display_(Seq[Any](format.raw/*35.35*/("""
								"""),format.raw/*36.9*/("""<tr>	
								
									<td>"""),_display_(/*38.15*/o/*38.16*/.getOrderDate),format.raw/*38.29*/("""</td>
									<td>€"""),_display_(/*39.16*/o/*39.17*/.getOrderTotal),format.raw/*39.31*/("""</td>
									<td>"""),_display_(/*40.15*/o/*40.16*/.getStatus()),format.raw/*40.28*/("""<td>
									<td>
										<a href=""""),_display_(/*42.21*/routes/*42.27*/.AdminController.cancelOrder(o.getId)),format.raw/*42.64*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>	
									</td>
									
									"""),_display_(/*48.11*/if(o.getStatus() != "delivered")/*48.43*/{_display_(Seq[Any](format.raw/*48.44*/("""
									"""),format.raw/*49.10*/("""<td>
										<a href=""""),_display_(/*50.21*/routes/*50.27*/.AdminController.updateStatus(o.getId)),format.raw/*50.65*/("""" class="btn-xs btn-danger">
                      					<span class="glyphicon glyphicon-pencil"></span></a>
										</a>
									</td>
									""")))}),format.raw/*54.11*/("""
								"""),format.raw/*55.9*/("""</tr>
                """)))}),format.raw/*56.18*/("""

			"""),format.raw/*58.4*/("""</tbody>
            </div>
			</table>

					<!--end list-->
					</div>
				</div>
				<div>
				</div>
			</div>
  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*70.27*/("""{"""),format.raw/*70.28*/("""
        """),format.raw/*71.9*/("""return confirm('Are you sure?');
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
  """),format.raw/*73.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*76.2*/("""

"""))
      }
    }
  }

  def render(env:play.api.Environment,products:List[Product],user:User,order:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(env,products,user,order)

  def f:((play.api.Environment,List[Product],User,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (env,products,user,order) => apply(env,products,user,order)

  def ref: this.type = this

}


}
}

/**/
object orders extends orders_Scope0.orders_Scope1.orders
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:13 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/admin/orders.scala.html
                  HASH: 13d5d6dcc06c7da2d0bb56945042d4b6f10afd45
                  MATRIX: 917->75|1117->179|1145->181|1205->214|1233->215|1279->234|1307->235|1335->236|1382->258|1394->263|1428->289|1467->291|1496->294|1846->617|1887->649|1927->651|1972->668|2050->719|2064->724|2100->739|2145->756|2196->776|2227->780|2508->1034|2539->1049|2579->1051|2615->1060|2671->1089|2681->1090|2715->1103|2763->1124|2773->1125|2808->1139|2855->1159|2865->1160|2898->1172|2964->1211|2979->1217|3037->1254|3245->1435|3286->1467|3325->1468|3363->1478|3415->1503|3430->1509|3489->1547|3669->1696|3705->1705|3759->1728|3791->1733|4049->1963|4078->1964|4114->1973|4178->2010|4206->2011|4236->2014|4313->2061
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|67->35|67->35|67->35|68->36|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|74->42|74->42|74->42|80->48|80->48|80->48|81->49|82->50|82->50|82->50|86->54|87->55|88->56|90->58|102->70|102->70|103->71|104->72|104->72|105->73|108->76
                  -- GENERATED --
              */
          