
package views.html

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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.123*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and content """),format.raw/*7.34*/("""{"""),format.raw/*7.35*/("""html between braces"""),format.raw/*7.54*/("""}"""),format.raw/*7.55*/(""" """),format.raw/*7.56*/("""to the main view -->
"""),_display_(/*8.2*/main("Products", user, categories, catId: Long, filter: String)/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""
    """),format.raw/*9.5*/("""<!-- HTML content for the index view -->
    <div class="row">

        <div class="col-sm-12">

            """),_display_(/*14.14*/if(flash.containsKey("success"))/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
                """),format.raw/*15.17*/("""<div class="alert alert-success">
                """),_display_(/*16.18*/flash/*16.23*/.get("success")),format.raw/*16.38*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">Products</h2>
                """),_display_(/*21.18*/for(p <- products) yield /*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
                    """),format.raw/*22.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*26.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*26.126*/ {_display_(Seq[Any](format.raw/*26.128*/("""
                                        """),format.raw/*27.41*/("""<img src="/assets/images/productImages/"""),_display_(/*27.81*/(p.getId)),format.raw/*27.90*/(""".jpg"/>
                                    """)))}/*28.39*/else/*28.44*/{_display_(Seq[Any](format.raw/*28.45*/("""
                                        """),format.raw/*29.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*30.38*/("""

                                """),format.raw/*32.33*/("""<h2>&euro; """),_display_(/*32.45*/("%.2f".format(p.getPrice))),format.raw/*32.72*/("""</h2>
                                <h3>"""),_display_(/*33.38*/p/*33.39*/.getName),format.raw/*33.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*39.53*/("%.2f".format(p.getPrice))),format.raw/*39.80*/("""</h2>
                                        <a   href=""""),_display_(/*40.53*/routes/*40.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*40.113*/("""" <p> """),_display_(/*40.120*/p/*40.121*/.getDescription),format.raw/*40.136*/("""</p> </a>
                                       
                                    </div>
                                </div>
                            </div>
                            <div class="choose">
								<ul class="nav nav-pills nav-justified">
                                    <li><a href=""""),_display_(/*47.51*/routes/*47.57*/.HomeController.like(catId, filter, p.getId, "index")),format.raw/*47.110*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*47.166*/p/*47.167*/.getPlike().getLikeCount()),format.raw/*47.193*/(""" """),format.raw/*47.194*/("""</a></b></li>
                                    <li><a href="#"><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
                                </ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*53.18*/("""

            """),format.raw/*55.13*/("""</div>
        </div>
    </div>
        <!-- End of content for main -->
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 14:38:41 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/products.scala.html
                  HASH: 30e4cd0ab5139db4bd866f375cb01fb9e42c001b
                  MATRIX: 912->75|1129->196|1157->198|1217->231|1245->232|1291->251|1319->252|1347->253|1394->275|1465->338|1504->340|1535->345|1672->455|1713->487|1753->489|1798->506|1876->557|1890->562|1926->577|1971->594|2022->614|2063->627|2217->754|2251->772|2291->774|2340->795|2617->1045|2715->1133|2756->1135|2825->1176|2892->1216|2922->1225|2986->1271|2999->1276|3038->1277|3107->1318|3240->1420|3302->1454|3341->1466|3389->1493|3459->1536|3469->1537|3498->1545|3813->1833|3861->1860|3946->1918|3961->1924|4037->1978|4072->1985|4083->1986|4120->2001|4462->2316|4477->2322|4552->2375|4636->2431|4647->2432|4695->2458|4725->2459|5037->2740|5079->2754|5184->2829
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|51->19|53->21|53->21|53->21|54->22|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|64->32|64->32|64->32|65->33|65->33|65->33|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|79->47|79->47|79->47|79->47|79->47|79->47|79->47|85->53|87->55|91->59
                  -- GENERATED --
              */
          