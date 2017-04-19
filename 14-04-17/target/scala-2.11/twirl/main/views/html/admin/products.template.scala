
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

     object products_Scope1 {
import models.Category
import models.Product
import models.users.User

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Category],List[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.94*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and content """),format.raw/*7.34*/("""{"""),format.raw/*7.35*/("""html between braces"""),format.raw/*7.54*/("""}"""),format.raw/*7.55*/(""" """),format.raw/*7.56*/("""to the main view -->
"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Products", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
  """),format.raw/*9.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*15.27*/routes/*15.33*/.AdminController.products(0)),format.raw/*15.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*19.18*/for(c <- categories) yield /*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
                    """),format.raw/*20.21*/("""<a href=""""),_display_(/*20.31*/routes/*20.37*/.AdminController.products(c.getId)),format.raw/*20.71*/("""" class="list-group-item">"""),_display_(/*20.98*/c/*20.99*/.getName),format.raw/*20.107*/("""
                      """),format.raw/*21.23*/("""<span class="badge">"""),_display_(/*21.44*/c/*21.45*/.getProducts.size()),format.raw/*21.64*/("""</span>
                    </a>
                """)))}),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*28.12*/if(flash.containsKey("success"))/*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
              """),format.raw/*29.15*/("""<div class="alert alert-success">
              """),_display_(/*30.16*/flash/*30.21*/.get("success")),format.raw/*30.36*/("""
              """),format.raw/*31.15*/("""</div>
          """)))}),format.raw/*32.12*/("""
          """),format.raw/*33.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
              <th></th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*48.12*/for(p <- products) yield /*48.30*/ {_display_(Seq[Any](format.raw/*48.32*/("""
              """),format.raw/*49.15*/("""<tr>
                      <!-- Display each product field value in a column -->
                  """),_display_(/*51.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*51.108*/ {_display_(Seq[Any](format.raw/*51.110*/("""
                      """),format.raw/*52.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*52.78*/(p.getId)),format.raw/*52.87*/(""".jpg"/></td>
                  """)))}/*53.21*/else/*53.26*/{_display_(Seq[Any](format.raw/*53.27*/("""
                      """),format.raw/*54.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*55.20*/("""
                  """),format.raw/*56.19*/("""<td>"""),_display_(/*56.24*/p/*56.25*/.getId),format.raw/*56.31*/("""</td>
                  <td>"""),_display_(/*57.24*/p/*57.25*/.getName),format.raw/*57.33*/("""</td>
                  <td>"""),_display_(/*58.24*/p/*58.25*/.getDescription),format.raw/*58.40*/("""</td>
                  <td>"""),_display_(/*59.24*/p/*59.25*/.getStock),format.raw/*59.34*/("""</td>
                  <td>&euro; """),_display_(/*60.31*/("%.2f".format(p.getPrice))),format.raw/*60.58*/("""</td>
                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*63.33*/routes/*63.39*/.AdminController.updateProduct(p.getId)),format.raw/*63.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*68.33*/routes/*68.39*/.AdminController.deleteProduct(p.getId)),format.raw/*68.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
              </tr>
					""")))}),format.raw/*74.7*/(""" """),format.raw/*74.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*78.21*/routes/*78.27*/.AdminController.addProduct()),format.raw/*78.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*87.27*/("""{"""),format.raw/*87.28*/("""
        """),format.raw/*88.9*/("""return confirm('Are you sure?');
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""
  """),format.raw/*90.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*93.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user)

  def f:((play.api.Environment,List[Category],List[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user) => apply(env,categories,products,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 12:12:57 IST 2017
                  SOURCE: /home/wdd/Desktop/13-04-17/integrated-11-04-17/app/views/admin/products.scala.html
                  HASH: 08e42c0eff4d5db7030af6cdb838c85569d52384
                  MATRIX: 906->75|1093->167|1121->169|1181->202|1209->203|1255->222|1283->223|1311->224|1358->246|1370->251|1406->279|1445->281|1474->284|1740->523|1755->529|1804->557|2055->781|2091->801|2131->803|2180->824|2217->834|2232->840|2287->874|2341->901|2351->902|2381->910|2432->933|2480->954|2490->955|2530->974|2611->1024|2652->1037|2741->1099|2782->1131|2822->1133|2865->1148|2941->1197|2955->1202|2991->1217|3034->1232|3083->1250|3122->1261|3608->1720|3642->1738|3682->1740|3725->1755|3852->1855|3950->1943|3991->1945|4042->1968|4124->2023|4154->2032|4205->2065|4218->2070|4257->2071|4308->2094|4432->2187|4479->2206|4511->2211|4521->2212|4548->2218|4604->2247|4614->2248|4643->2256|4699->2285|4709->2286|4745->2301|4801->2330|4811->2331|4841->2340|4904->2376|4952->2403|5087->2511|5102->2517|5162->2556|5421->2788|5436->2794|5496->2833|5759->3066|5787->3067|5907->3160|5922->3166|5972->3195|6235->3430|6264->3431|6300->3440|6364->3477|6392->3478|6422->3481|6499->3528
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|47->15|47->15|47->15|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|53->21|55->23|56->24|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|64->32|65->33|80->48|80->48|80->48|81->49|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|88->56|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|95->63|95->63|95->63|100->68|100->68|100->68|106->74|106->74|110->78|110->78|110->78|119->87|119->87|120->88|121->89|121->89|122->90|125->93
                  -- GENERATED --
              */
          