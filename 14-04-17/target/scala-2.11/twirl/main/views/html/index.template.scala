
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import models.Category
import models.Product
import models.users.User

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[models.Category], products: List[models.Product], user: models.users.User, catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.150*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title, user, and content """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""html between braces"""),format.raw/*7.61*/("""}"""),format.raw/*7.62*/(""" """),format.raw/*7.63*/("""to the main view -->
"""),_display_(/*8.2*/main("Home", user, categories, catId: Long, filter)/*8.53*/ {_display_(Seq[Any](format.raw/*8.55*/("""

	"""),format.raw/*10.2*/("""<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-9">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>A</span>&Js</h1>
									<h2>Welcome </h2>
									<p>Find the lowest prices</p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product5.jpg" class="girl img-responsive" alt="" />
									
									<img src="/assets/images/home/new.png"  class="pricing" alt="" />

								
								
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-Delivery</h1>
									<h2>100% Satisfaction</h2>
									<p>Buy Now get next day Delivery Free </p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product3.jpg" class="Delivery" alt="" />

									
								</div>
							</div>

							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-Clothing</h1>
									<h2>Get Massive Discounts</h2>
									<p>We provide the best clothing from Fair Trade nations and Huge International collection </p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product2.jpg" class="Delivery" alt="" />

									

								</div>
							</div>

						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section><!--/slider-->

	<div class="col-sm-12 padding-right">
		<div class="row">
		"""),_display_(/*84.4*/if(flash.containsKey("success"))/*84.36*/ {_display_(Seq[Any](format.raw/*84.38*/("""
                """),format.raw/*85.17*/("""<div class="alert alert-success">
                """),_display_(/*86.18*/flash/*86.23*/.get("success")),format.raw/*86.38*/("""
                """),format.raw/*87.17*/("""</div>
            """)))}),format.raw/*88.14*/("""
            """),format.raw/*89.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">New products</h2>
                """),_display_(/*91.18*/for(p <- products) yield /*91.36*/ {_display_(Seq[Any](format.raw/*91.38*/("""
                    """),format.raw/*92.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*96.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*96.126*/ {_display_(Seq[Any](format.raw/*96.128*/("""
                                        """),format.raw/*97.41*/("""<img src="/assets/images/productImages/"""),_display_(/*97.81*/(p.getId)),format.raw/*97.90*/(""".jpg"/>
                                    """)))}/*98.39*/else/*98.44*/{_display_(Seq[Any](format.raw/*98.45*/("""
                                        """),format.raw/*99.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*100.38*/("""

                                """),format.raw/*102.33*/("""<h2>&euro; """),_display_(/*102.45*/("%.2f".format(p.getPrice))),format.raw/*102.72*/("""</h2>
                                <h3>"""),_display_(/*103.38*/p/*103.39*/.getName),format.raw/*103.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*109.53*/("%.2f".format(p.getPrice))),format.raw/*109.80*/("""</h2>
                                        <a   href=""""),_display_(/*110.53*/routes/*110.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*110.113*/("""" <p> """),_display_(/*110.120*/p/*110.121*/.getDescription),format.raw/*110.136*/("""</p> </a>
                                       
                                    </div>
                                </div>
                            </div>
                            <div class="choose">
								<ul class="nav nav-pills nav-justified">
                                    <li><a href=""""),_display_(/*117.51*/routes/*117.57*/.HomeController.like(catId, filter, p.getId, "index")),format.raw/*117.110*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*117.166*/p/*117.167*/.getPlike().getLikeCount()),format.raw/*117.193*/(""" """),format.raw/*117.194*/("""</a></b></li>
                                    <li><a href="#"><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
                                </ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*123.18*/("""
		"""),format.raw/*124.3*/("""</div>
		</div>
					
					
					
				</div>
""")))}),format.raw/*130.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[models.Category],products:List[models.Product],user:models.users.User,catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user,catId,filter)

  def f:((play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user,catId,filter) => apply(env,categories,products,user,catId,filter)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 14:35:11 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/index.scala.html
                  HASH: b5d0539a3d5e474da1b0b5b6023d3d5beefdb5c4
                  MATRIX: 930->75|1174->223|1202->225|1269->265|1297->266|1343->285|1371->286|1399->287|1446->309|1505->360|1544->362|1574->365|3957->2722|3998->2754|4038->2756|4083->2773|4161->2824|4175->2829|4211->2844|4256->2861|4307->2881|4348->2894|4506->3025|4540->3043|4580->3045|4629->3066|4906->3316|5004->3404|5045->3406|5114->3447|5181->3487|5211->3496|5275->3542|5288->3547|5327->3548|5396->3589|5530->3691|5593->3725|5633->3737|5682->3764|5753->3807|5764->3808|5794->3816|6110->4104|6159->4131|6245->4189|6261->4195|6338->4249|6374->4256|6386->4257|6424->4272|6767->4587|6783->4593|6859->4646|6944->4702|6956->4703|7005->4729|7036->4730|7349->5011|7380->5014|7457->5060
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|42->10|116->84|116->84|116->84|117->85|118->86|118->86|118->86|119->87|120->88|121->89|123->91|123->91|123->91|124->92|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|131->99|132->100|134->102|134->102|134->102|135->103|135->103|135->103|141->109|141->109|142->110|142->110|142->110|142->110|142->110|142->110|149->117|149->117|149->117|149->117|149->117|149->117|149->117|155->123|156->124|162->130
                  -- GENERATED --
              */
          