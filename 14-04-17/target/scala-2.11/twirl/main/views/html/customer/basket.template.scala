
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Long,String,models.Size,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String, size: models.Size):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._
import models.Size

Seq[Any](format.raw/*1.143*/("""

"""),format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*10.2*/main("Shopping Basket", user, categories, catId, filter)/*10.58*/ {_display_(Seq[Any](format.raw/*10.60*/("""


"""),format.raw/*13.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*16.4*/if(flash.containsKey("success"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
			  """),format.raw/*17.6*/("""<div class="alert alert-success">
			      """),_display_(/*18.11*/flash/*18.16*/.get("success")),format.raw/*18.31*/("""
			  """),format.raw/*19.6*/("""</div>
		""")))}),format.raw/*20.4*/(""" 

		"""),format.raw/*22.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Size</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*37.18*/if(customer.getBasket() != null)/*37.50*/ {_display_(Seq[Any](format.raw/*37.52*/("""
                    """),format.raw/*38.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*39.22*/for(i <- customer.getBasket().getBasketItems()) yield /*39.69*/ {_display_(Seq[Any](format.raw/*39.71*/("""
                    """),format.raw/*40.21*/("""<tr>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getName),format.raw/*41.50*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getProduct.getDescription()),format.raw/*42.59*/("""</td>
			<td>"""),_display_(/*43.9*/size/*43.13*/.getSizeName),format.raw/*43.25*/("""</td>
			

                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*49.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*50.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
			
              """)))}),format.raw/*54.16*/("""
			"""),format.raw/*55.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*59.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*59.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.ShoppingCtrl.emptyBasket()),format.raw/*65.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*71.31*/routes/*71.37*/.CustomerCtrl.payment(catId, filter)),format.raw/*71.73*/("""" class="btn btn-success btn-sm">
                    </span> Go To Payment</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*81.24*/("""{"""),format.raw/*81.25*/("""
		"""),format.raw/*82.3*/("""return confirm('Are you sure?');
	"""),format.raw/*83.2*/("""}"""),format.raw/*83.3*/("""
"""),format.raw/*84.1*/("""</script>
""")))}),format.raw/*85.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String,size:models.Size): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter,size)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String,models.Size) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter,size) => apply(customer,user,categories,catId,filter,size)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 20:44:29 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/customer/basket.scala.html
                  HASH: 4093e4a819fccfa77a5e38d944adb7238dd1c3c1
                  MATRIX: 835->1|1190->142|1218->268|1245->269|1317->315|1382->371|1422->373|1452->376|1525->423|1566->455|1606->457|1639->463|1710->507|1724->512|1760->527|1793->533|1833->543|1865->548|2237->893|2278->925|2318->927|2367->948|2477->1031|2540->1078|2580->1080|2629->1101|2690->1135|2700->1136|2740->1155|2802->1190|2812->1191|2861->1219|2901->1233|2914->1237|2947->1249|3021->1296|3069->1323|3138->1365|3190->1396|3252->1431|3262->1432|3297->1446|3368->1490|3383->1496|3436->1528|3565->1630|3580->1636|3630->1665|3771->1775|3846->1819|3877->1823|4054->1973|4126->2023|4333->2203|4348->2209|4396->2236|4718->2531|4733->2537|4790->2573|5080->2835|5109->2836|5139->2839|5200->2873|5228->2874|5256->2875|5297->2886
                  LINES: 27->1|36->1|38->8|39->9|40->10|40->10|40->10|43->13|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|52->22|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|76->46|76->46|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|82->52|84->54|85->55|89->59|89->59|95->65|95->65|95->65|101->71|101->71|101->71|111->81|111->81|112->82|113->83|113->83|114->84|115->85
                  -- GENERATED --
              */
          